package expression;

import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.Num_binary_opContext;

/**
 * This class provides methods to evaluate binary expressions that evaluate to a number.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NumericBinaryExpressionEvaluator {

  private static final String PLUS = "+";
  private static final String MINUS = "-";

  /**
   * Evaluate the given comparison
   * 
   */
  public static Number eval(ExprContext expr1, Num_binary_opContext num_binary_op,
      ExprContext expr2, Object o) {
    Object o1 = ExpressionEvaluator.eval(expr1, o);
    Object o2 = ExpressionEvaluator.eval(expr2, o);
    return eval(o1, num_binary_op.getText(), o2);
  }

  private static Number eval(Object o1, String op, Object o2) {
    assert (o1 instanceof Number);
    assert (o2 instanceof Number);
    Number n1 = (Number) o1;
    Number n2 = (Number) o2;
    switch (op) {
    case PLUS:
      return evalAdd(n1, n2);
    case MINUS:
      return evalMinus(n1, n2);
    }
    throw new IllegalArgumentException("Binary operator " + op + " still not implemented");
  }

  /**
   * Evaluate addition
   */
  private static Number evalAdd(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 + (Integer) n2;
    if (n1 instanceof Float)
      return (Float) n1 + (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 + (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }

  /**
   * Evaluate subtraction
   */
  private static Number evalMinus(Number n1, Number n2) {
    if (n1 instanceof Integer)
      return (Integer) n1 - (Integer) n2;
    if (n1 instanceof Float)
      return (Float) n1 - (Float) n2;
    if (n1 instanceof Double)
      return (Double) n1 - (Double) n2;
    throw new IllegalArgumentException(
        "Objects must be of the same type when performing numeric comparison");
  }
}
