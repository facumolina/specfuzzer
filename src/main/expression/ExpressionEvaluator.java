package expression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;
import invariant.FuzzedInvariantUtil;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.Binary_opContext;
import antlr.AlloyExprGrammarParser.Set_binary_opContext;
import antlr.AlloyExprGrammarParser.Compare_opContext;
import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.NameContext;
import antlr.AlloyExprGrammarParser.Num_binary_opContext;
import antlr.AlloyExprGrammarParser.ParseContext;
import antlr.AlloyExprGrammarParser.Qt_exprContext;
import antlr.AlloyExprGrammarParser.Set_exprContext;
import antlr.AlloyExprGrammarParser.Unary_opContext;

/**
 * This class represents an Expression Evaluator. Provides a method that given a Java object and an
 * expression (in the Alloy grammar) evaluates the expression on the object.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExpressionEvaluator {

  private static AlloyExprGrammarParser parser; // Alloy Expressions Parser

  protected static Map<String, Object> vars; // Map from var name to object

  /**
   * Setup the parser
   */
  private static void setup(String alloy_expr) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new AlloyExprGrammarParser(tokens);
    vars = new HashMap<String, Object>();
  }

  /**
   * Validate that the given expression is applicable to the given object class
   */
  private static void validate(String alloy_expr, Class<?> cl, Class<?> cl2) {
    String class_name = cl.getSimpleName();
    if (!alloy_expr.contains(class_name+"."))
      throw new NonApplicableExpressionException(
              "The expression " + alloy_expr + " is not applicable to class: " + class_name);
    int idx = alloy_expr.indexOf(class_name);
    while (idx >= 0) {
      if (!(idx == 0 || alloy_expr.charAt(idx - 1) == ' ' || alloy_expr.charAt(idx - 1) == '('))
        throw new NonApplicableExpressionException("The expression " + alloy_expr + " is not applicable to class: " + class_name);
      idx = alloy_expr.indexOf(class_name,idx+1);
    }
    if (cl2 != null) {
      // Either cl2.getSimpleName()_Variable string should exist or Object_Variable
      String var_name = cl2.getSimpleName()+"_Variable";
      if (!alloy_expr.contains(var_name) && !alloy_expr.contains("Object_Variable")) {
        throw new NonApplicableExpressionException(
                "The expression " + alloy_expr + " is not applicable to var: " + var_name);
      }
    }
  }

  /**
   * Returns true if the given expression is applicable to an object of the given class name
   */
  public static boolean is_valid(String alloy_expr, String class_name) {
    if (!alloy_expr.contains(class_name+"."))
      return false;
    int idx = alloy_expr.indexOf(class_name);
    while (idx >= 0) {
      if (!(idx == 0 || alloy_expr.charAt(idx - 1) == ' ' || alloy_expr.charAt(idx - 1) == '('))
        return false;
      idx = alloy_expr.indexOf(class_name,idx+1);
    }
    return true;
  }

  /**
   * Evaluate the given unary Alloy expression on the given object
   */
  public static boolean eval(String alloy_expr, Object o) {
    if (alloy_expr == null || o == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");

    validate(alloy_expr, o.getClass(), null);

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    vars.put(o.getClass().getSimpleName(), o);
    return (Boolean) eval(ctx.expr());
  }


  /**
   * Evaluate the given binary Alloy expression on the given objects
   */
  public static boolean eval(String alloy_expr, Object o1, Object o2) {
    if (alloy_expr == null || o1 == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");

    validate(alloy_expr, o1.getClass(), o2.getClass());

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    vars.put(o1.getClass().getSimpleName(), o1);
    String var_name = FuzzedInvariantUtil.get_vars(alloy_expr, o1.getClass()).get(1);
    vars.put(var_name, o2);
    return (Boolean) eval(ctx.expr());

  }

  /**
   * Evaluate the given any expr (not necessarily boolean) on the given object
   */
  public static Object evalAnyExpr(String alloy_expr, Object o) {
    if (alloy_expr == null || o == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");

    validate(alloy_expr, o.getClass(), null);

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
      BinarySetExpressionEvaluator.eval(set_exprs.get(0), set_binary_op, set_exprs.get(1));
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

    throw new IllegalStateException("Unable to evaluate the expression: " + ectx.getText());
  }

}