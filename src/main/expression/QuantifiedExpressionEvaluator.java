package expression;

import java.util.Set;

import antlr.ExprGrammarParser.ExprContext;
import antlr.ExprGrammarParser.Qt_exprContext;
import antlr.ExprGrammarParser.QuantifierContext;
import grammar.symbols.ConstantSymbols;

/**
 * This class provides methods to evaluate quantified expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantifiedExpressionEvaluator {

  private static final String ALL = "all";
  private static final String SOME = "some";
  private static final String NO = "no";
  private static final String LONE = "lone";
  private static final String ONE = "one";

  public static final String QT_VAR_NAME = "n";
  public static final String EMPTY_SET = "empty";

  public static int last_set_size = 0;

  /**
   * Evaluate the given quantified expression on the given java Object
   */
  public static boolean eval(Qt_exprContext qt_expr) {
    Set<Object> set = qt_expr.set_expr() != null
        ? SetExpressionEvaluator.eval(qt_expr.set_expr())
        : SetExpressionEvaluator.eval(qt_expr.collection());
    QuantifierContext qt = qt_expr.quantifier();
    last_set_size = set.size();
    switch (qt.getText()) {
    case ALL:
      return computeAll(set, qt_expr.expr());
    case SOME:
      return computeSome(set, qt_expr.expr());
    case NO:
      return computeNo(set, qt_expr.expr());
    case LONE:
      return computeLone(set, qt_expr.expr());
    case ONE:
      return computeOne(set, qt_expr.expr());
    }

    return true;
  }

  /**
   * Returns true if ALL the objects in the given set satisfies the given expression
   */
  private static boolean computeAll(Set<Object> set, ExprContext expr) {
    for (Object o : set) {
      ExpressionEvaluator.vars.put(ConstantSymbols.QT_VAR_NAME, o);
      try {
        if (!(Boolean) ExpressionEvaluator.eval(expr))
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
        ExpressionEvaluator.vars.put(ConstantSymbols.QT_VAR_NAME, o);
        if ((Boolean) ExpressionEvaluator.eval(expr))
          return true;
      } catch (NonEvaluableExpressionException e) {
        // For now, when an expression can't be evaluated in the body, ignore it
        // This simulates null safe
        continue;
      }
    }
    return false;
  }

  /**
   * Returns true if NONE of the objects in the given set satisfies the given expression
   */
  private static boolean computeNo(Set<Object> set, ExprContext expr) {
    for (Object o : set) {
      ExpressionEvaluator.vars.put(ConstantSymbols.QT_VAR_NAME, o);
      try {
        if ((Boolean) ExpressionEvaluator.eval(expr))
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
   * Returns true if ZERO or ONE of the objects in the given set satisfies the given expression
   */
  private static boolean computeLone(Set<Object> set, ExprContext expr) {
    int satisfying = 0;
    for (Object o : set) {
      ExpressionEvaluator.vars.put(ConstantSymbols.QT_VAR_NAME, o);
      try {
        if ((Boolean) ExpressionEvaluator.eval(expr))
          satisfying++;
        if (satisfying > 1)
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
   * Returns true if ONE of the objects in the given set satisfies the given expression
   */
  private static boolean computeOne(Set<Object> set, ExprContext expr) {
    int satisfying = 0;
    for (Object o : set) {
      ExpressionEvaluator.vars.put(ConstantSymbols.QT_VAR_NAME, o);
      try {
        if ((Boolean) ExpressionEvaluator.eval(expr))
          satisfying++;
        if (satisfying > 1)
          return false;
      } catch (NonEvaluableExpressionException e) {
        // For now, when an expression can't be evaluated in the body, ignore it
        // This simulates null safe
        continue;
      }
    }
    return satisfying==1;
  }

}
