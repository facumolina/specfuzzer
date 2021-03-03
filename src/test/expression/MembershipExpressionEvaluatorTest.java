package expression;

import DataStructures.List;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MembershipExpressionEvaluatorTest {

  private Boolean evaluateMembershipBinary(String alloy_expr, Object o1, Object o2) {
    return ExpressionEvaluator.eval(alloy_expr, o1, o2);
  }

  @Test
  public void membership_test_1() {
    List l = new List();
    l.insert(3);
    l.insert(2);
    assertTrue(evaluateMembershipBinary("Integer_Variable not in List.*(next).x", l, 5));
    assertTrue(evaluateMembershipBinary("Integer_Variable in List.*(next).x", l, 2));
    assertFalse(evaluateMembershipBinary("Integer_Variable in List.*(next).x", l, 10));
  }

}