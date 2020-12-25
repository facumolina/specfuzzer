package expression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.Binary_opContext;
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
  private static void validate(String alloy_expr, Class<?> cl) {
    String class_name = cl.getSimpleName();
    if (alloy_expr.contains(class_name+".")) {
      int idx = alloy_expr.indexOf(class_name);
      if (!(idx==0 || alloy_expr.charAt(idx-1)==' ' || alloy_expr.charAt(idx-1)=='('))
        throw new NonApplicableExpressionException(
              "The expression " + alloy_expr + " is not applicable to class: " + class_name);
    }
  }

  /**
   * Evaluate the given Alloy expression on the given object
   */
  public static boolean eval(String alloy_expr, Object o) {
    if (alloy_expr == null || o == null)
      throw new IllegalArgumentException("Neither the expression nor the object can be null.");

    validate(alloy_expr, o.getClass());

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    vars.put(o.getClass().getSimpleName(), o);
    return (Boolean) eval(ctx.expr(), o);

  }

  /**
   * Evaluate the given ParseTree on the given java Object
   */
  protected static Object eval(ExprContext ectx, Object o) {

    Qt_exprContext qt_expr_ctx = ectx.qt_expr();
    if (qt_expr_ctx != null)
      return QuantifiedExpressionEvaluator.eval(qt_expr_ctx, o);

    Num_binary_opContext num_binary_op = ectx.num_binary_op();
    if (num_binary_op != null) {
      // We have a numeric binary operator, i.e., + or -
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return NumericBinaryExpressionEvaluator.eval(exprs.get(0), num_binary_op, exprs.get(1), o);
    }

    Binary_opContext binary_op = ectx.binary_op();
    if (binary_op != null) {
      // The expression is a binary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return BinaryExpressionEvaluator.eval(exprs.get(0), binary_op, exprs.get(1), o);
    }

    Compare_opContext cmp_op = ectx.compare_op();
    if (cmp_op != null) {
      // The expression is a comparison
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 2);
      return ComparisonExpressionEvaluator.eval(exprs.get(0), cmp_op, exprs.get(1), o);
    }

    Unary_opContext unary_op = ectx.unary_op();
    if (unary_op != null) {
      // The expression is a unary one
      List<ExprContext> exprs = ectx.expr();
      assert (exprs.size() == 1);
      return UnaryExpressionEvaluator.eval(unary_op, exprs.get(0), o);
    }

    NameContext name_ctx = ectx.name();
    if (name_ctx != null) {
      // The expression is a name
      return NameExpressionEvaluator.eval(name_ctx, o);
    }

    Set_exprContext set_expr = ectx.set_expr();
    if (set_expr != null) {
      // The expression is a set
      return SetExpressionEvaluator.eval(set_expr, o);
    }

    try {
      // Try to parse an Integer
      return Integer.parseInt(ectx.getText());
    } catch (NumberFormatException e) {
    }

    throw new IllegalStateException("Unable to evaluate the expression: " + ectx.getText());
  }

}