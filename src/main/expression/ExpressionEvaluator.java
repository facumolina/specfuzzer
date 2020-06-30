package expression;

import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.Binary_opContext;
import antlr.AlloyExprGrammarParser.Compare_opContext;
import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.NameContext;
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

  /**
   * Setup the parser
   */
  private static void setup(String alloy_expr) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new AlloyExprGrammarParser(tokens);
  }

  /**
   * Evaluate the given Alloy expression on the given object
   */
  public static boolean eval(String alloy_expr, Object o) {

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    ParseContext ctx = (ParseContext) tree;
    return (Boolean) eval(ctx.expr(), o);

  }

  /**
   * Evaluate the given ParseTree on the given java Object
   */
  public static Object eval(ExprContext ectx, Object o) {

    Qt_exprContext qt_expr_ctx = ectx.qt_expr();
    if (qt_expr_ctx != null)
      return QuantifiedExpressionEvaluator.eval(qt_expr_ctx, o);

    Binary_opContext binary_op = ectx.binary_op();
    if (binary_op != null) {
      // The expression is a binary one

    }

    Compare_opContext cmp_op = ectx.compare_op();
    if (cmp_op != null) {
      // The expression is a comparisson
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