package expression;

import java.util.Set;

import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.Qt_exprContext;
import antlr.AlloyExprGrammarParser.QuantifierContext;

/**
 * This class provides methods to evaluate quantified expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantifiedExpressionEvaluator {

  private static final String ALL = "all";
  private static final String SOME = "some";

  public static final String QT_VAR_NAME = "n";

  /**
   * Evaluate the given quantified expression on the given java Object
   */
  public static boolean eval(Qt_exprContext qt_expr, Object o) {
    Set<Object> set = SetExpressionEvaluator.eval(qt_expr.set_expr(), o);

    QuantifierContext qt = qt_expr.quantifier();
    switch (qt.getText()) {
    case ALL:
      return computeAll(set, qt_expr.expr());
    case SOME:
      return computeSome(set, qt_expr.expr());
    }

    return true;
  }

  /**
   * Returns true if ALL the objects in the given set satisfies the given expression
   */
  private static boolean computeAll(Set<Object> set, ExprContext expr) {
    for (Object o : set) {
      try {
        if (!(Boolean) ExpressionEvaluator.eval(expr, o))
          return false;
      } catch (NonEvaluableExpressionException e) {
        // For now, when an expression can't be evaluated in the body, ignore it
        // This simulates null safe
        continue;
      }
    }
    return true;
  }

  /**
   * Returns true if SOME of the objects in the given set satisfies the given expression
   */
  private static boolean computeSome(Set<Object> set, ExprContext expr) {
    for (Object o : set) {
      try {
        if ((Boolean) ExpressionEvaluator.eval(expr, o))
          return true;
      } catch (NonEvaluableExpressionException e) {
        // For now, when an expression can't be evaluated in the body, ignore it
        // This simulates null safe
        continue;
      }
    }
    return false;
  }

}
