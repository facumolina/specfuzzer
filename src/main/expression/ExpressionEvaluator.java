package expression;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grammar.GrammarSymbols;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprGrammarLexer;
import antlr.ExprGrammarParser;
import antlr.ExprGrammarParser.Binary_opContext;
import antlr.ExprGrammarParser.Set_binary_opContext;
import antlr.ExprGrammarParser.Compare_opContext;
import antlr.ExprGrammarParser.ExprContext;
import antlr.ExprGrammarParser.NameContext;
import antlr.ExprGrammarParser.Num_binary_opContext;
import antlr.ExprGrammarParser.ParseContext;
import antlr.ExprGrammarParser.Qt_exprContext;
import antlr.ExprGrammarParser.Set_exprContext;
import antlr.ExprGrammarParser.Unary_opContext;

/**
 * This class represents an Expression Evaluator. Provides a method that given a Java object and an
 * expression (in the Alloy grammar) evaluates the expression on the object.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExpressionEvaluator {

  private static ExprGrammarParser parser; // Alloy Expressions Parser

  protected static Map<String, Object> vars; // Map from var name to object

  /**
   * Setup the parser
   */
  private static void setup(String alloy_expr) {
    ExprGrammarLexer lexer = new ExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new ExprGrammarParser(tokens);
    vars = new HashMap<String, Object>();
  }

  /**
   * Check the arguments for evaluation
   */
  private static void check_eval_args(String alloy_expr, Object base) {
    if (alloy_expr == null || base == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");
  }

  /**
   * Evaluate the given unary expression with the given object
   */
  public static boolean eval(String alloy_expr, Object o) {
    return eval(alloy_expr, o, null, null);
  }


  /**
   * Evaluate the given binary expression with the given objects
   */
  public static boolean eval(String alloy_expr, Object o1, Object o2) {
    return eval(alloy_expr, o1, o2, null);
  }

  /**
   * Evaluate the given ternary expression with the given objects
   */
  public static boolean eval(String alloy_expr, Object o1, Object o2, Object o3) {
    check_eval_args(alloy_expr, o1);
    ExpressionValidator.validate(alloy_expr, o1.getClass(), o2!=null?o2.getClass():null, o3!=null?o3.getClass():null);
    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    set_vars(alloy_expr, o1, o2, o3);
    return (Boolean) eval(ctx.expr());
  }

  /**
   * Set the variable values in the map
   */
  private static void set_vars(String alloy_expr, Object o1, Object o2, Object o3) {
    if (Number.class.isAssignableFrom(o1.getClass()) || Boolean.class.isAssignableFrom(o1.getClass())) {
      vars.put(GrammarSymbols.get_special_identifier(o1.getClass().getSimpleName(),0), o1);
    } else {
      if (Collection.class.isAssignableFrom(o1.getClass())) {
        set_collection_var(o1);
      }
      vars.put(o1.getClass().getSimpleName(), o1);
    }
    if (o2 != null) {
      if (alloy_expr.contains("Object_Variable_0"))
        vars.put("Object_Variable_0", o2);
      else {
        if (Number.class.isAssignableFrom(o2.getClass()) || Boolean.class.isAssignableFrom(o2.getClass())) {
          if (o2.getClass().getSimpleName().equals(o1.getClass().getSimpleName())) {
            vars.put(GrammarSymbols.get_special_identifier(o2.getClass().getSimpleName(), 1), o2);
          } else {
            vars.put(GrammarSymbols.get_special_identifier(o2.getClass().getSimpleName(), 0), o2);
          }
        }
        if (Collection.class.isAssignableFrom(o2.getClass())) {
          set_collection_var(o2);
        }
      }
    }
    if (o3 != null) {
      if (alloy_expr.contains("Object_Variable_1"))
        vars.put("Object_Variable_1", o3);
      else {
        if (Number.class.isAssignableFrom(o3.getClass()) || Boolean.class.isAssignableFrom(o3.getClass())) {
          if (o3.getClass().getSimpleName().equals(o2.getClass().getSimpleName()) && o3.getClass().getSimpleName().equals(o1.getClass().getSimpleName())) {
            vars.put(GrammarSymbols.get_special_identifier(o3.getClass().getSimpleName(), 2), o3);
          } else {
            if (o3.getClass().getSimpleName().equals(o2.getClass().getSimpleName()) || o3.getClass().getSimpleName().equals(o1.getClass().getSimpleName())) {
              vars.put(GrammarSymbols.get_special_identifier(o3.getClass().getSimpleName(), 1), o3);
            } else {
              vars.put(GrammarSymbols.get_special_identifier(o3.getClass().getSimpleName(), 0), o3);
            }
          }
        }
        if (Collection.class.isAssignableFrom(o3.getClass())) {
          set_collection_var(o3);
        }
      }
    }
  }

  /**
   * Set the collection var
   */
  private static void set_collection_var(Object o) {
    if (vars.containsKey("Integer_Set_Variable_0"))
      throw new IllegalStateException("Variable value for collection class already inserted!");
    vars.put("Integer_Set_Variable_0", o);
    vars.put("Object_Set_Variable_0", o);
  }

  /**
   * Evaluate the given any expr (not necessarily boolean) on the given object
   */
  public static Object evalAnyExpr(String alloy_expr, Object o) {
    if (alloy_expr == null || o == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");

    ExpressionValidator.validate(alloy_expr, o.getClass(), null, null);

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    vars.put(o.getClass().getSimpleName(), o);
    return eval(ctx.expr());
  }

  /**
   * Evaluate the given ParseTree on the given java Object
   */
  protected static Object eval(ExprContext ectx) {

    Qt_exprContext qt_expr_ctx = ectx.qt_expr();
    if (qt_expr_ctx != null)
      return QuantifiedExpressionEvaluator.eval(qt_expr_ctx);

    Num_binary_opContext num_binary_op = ectx.num_binary_op();
    if (num_binary_op != null) {
      // We have a numeric binary operator, i.e., + or -
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return NumericBinaryExpressionEvaluator.eval(exprs.get(0), num_binary_op, exprs.get(1));
    }

    Binary_opContext binary_op = ectx.binary_op();
    if (binary_op != null) {
      // The expression is a binary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return BinaryExpressionEvaluator.eval(exprs.get(0), binary_op, exprs.get(1));
    }

    Set_binary_opContext set_binary_op = ectx.set_binary_op();
    if (set_binary_op != null) {
      // The expression is a comparison between two sets
      List<Set_exprContext> set_exprs = ectx.set_expr();
      assert(set_exprs.size() == 2);
      return BinarySetExpressionEvaluator.eval(set_exprs.get(0), set_binary_op, set_exprs.get(1));
    }

    Compare_opContext cmp_op = ectx.compare_op();
    if (cmp_op != null) {
      // The expression is a comparison
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return ComparisonExpressionEvaluator.eval(exprs.get(0), cmp_op, exprs.get(1));
    }

    Unary_opContext unary_op = ectx.unary_op();
    if (unary_op != null) {
      // The expression is a unary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 1);
      return UnaryExpressionEvaluator.eval(unary_op, exprs.get(0));
    }

    NameContext name_ctx = ectx.name();
    if (name_ctx != null) {
      // The expression is a name
      return NameExpressionEvaluator.eval(name_ctx, null);
    }

    List<Set_exprContext> set_exprs = ectx.set_expr();
    if (set_exprs != null && set_exprs.size()>0) {
      // The expression is a set
      return SetExpressionEvaluator.eval(set_exprs.get(0));
    }

    try {
      // Try to parse an Integer
      return Integer.parseInt(ectx.getText());
    } catch (NumberFormatException e) {
    }

    try {
      // Try to parse a Double
      return Double.parseDouble(ectx.getText());
    } catch (NumberFormatException e) {
    }

    throw new IllegalStateException("Unable to evaluate the expression: " + ectx.getText());
  }

}