package expression;

import java.util.Collection;

import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.Unary_opContext;

/**
 * This class provides methods to evaluate comparison expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class UnaryExpressionEvaluator {

  private static final String CARDINALITY = "#";
  private static final String NOT = "!";

  /**
   * Evaluate the given unary expression
   * 
   */
  public static Object eval(Unary_opContext unary_op, ExprContext expr, Object o) {
    Object o1 = ExpressionEvaluator.eval(expr, o);
    return eval(unary_op.getText(), o1);
  }

  private static Object eval(String op, Object o) {
    switch (op) {
    case CARDINALITY:
      assert (o instanceof Collection);
      Collection<Object> set = (Collection<Object>) o;
      return set==null ? 0 : set.size();
    }
    throw new IllegalArgumentException(
        "Operator " + op + " is not supported for unary expressions");
  }
}
