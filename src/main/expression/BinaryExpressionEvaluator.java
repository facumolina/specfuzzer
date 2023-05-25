package expression;

import antlr.ExprGrammarParser.Binary_opContext;
import antlr.ExprGrammarParser.ExprContext;

/**
 * This class provides methods to evaluate binary expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class BinaryExpressionEvaluator {

  private static final String AND_1 = "&&";
  private static final String AND_2 = "and";
  private static final String OR_1 = "||";
  private static final String OR_2 = "or";
  private static final String IMPLIES_1 = "=>";
  private static final String IMPLIES_2 = "implies";
  private static final String IFF = "iff";
  private static final String XOR = "xor";

  /**
   * Evaluate the given operation
   */
  public static boolean eval(ExprContext expr1, Binary_opContext binary_op, ExprContext expr2) {
    Object o1 = ExpressionEvaluator.eval(expr1);
    Object o2 = ExpressionEvaluator.eval(expr2);
    return eval(o1, binary_op.getText(), o2);
  }

  private static boolean eval(Object o1, String op, Object o2) {
    assert (o1 instanceof Boolean);
    assert (o2 instanceof Boolean);
    Boolean b1 = (Boolean) o1;
    Boolean b2 = (Boolean) o2;
    switch (op) {
    case (AND_1):
      return b1 && b2;
    case (AND_2):
      return b1 && b2;
    case (OR_1):
      return b1 || b2;
    case (OR_2):
      return b1 || b2;
    case (IMPLIES_1):
      return !b1 || b2;
    case (IMPLIES_2):
      return !b1 || b2;
    case (IFF):
      return b1 == b2;
    case (XOR):
      return b1 != b2;
    }
    throw new IllegalArgumentException("Binary operator " + op + " still not implemented");
  }
}
