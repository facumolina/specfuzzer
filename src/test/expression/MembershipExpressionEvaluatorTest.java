package expression;

import DataStructures.AvlTreeList;
import DataStructures.List;
import DataStructures.commonscollections.TreeList;
import DataStructures.korat.binarysearchtree.SearchTree;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class contains tests to ensure that membership expressions are being evaluated properly
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class MembershipExpressionEvaluatorTest {

  private Boolean evaluateMembershipBinary(String alloy_expr, Object o1, Object o2) {
    return ExpressionEvaluator.eval(alloy_expr, o1, o2);
  }

  @Test
  public void membership_test_1() {
    List l = new List();
    l.insert(3);
    l.insert(2);
    assertTrue(evaluateMembershipBinary("Integer_Variable_0 not in List.*(next).x", l, 5));
    assertTrue(evaluateMembershipBinary("Integer_Variable_0 in List.*(next).x", l, 2));
    assertFalse(evaluateMembershipBinary("Integer_Variable_0 in List.*(next).x", l, 10));
    assertFalse(evaluateMembershipBinary("Integer_Variable_0 in List.^(next).x", l, 2));
  }

  @Test
  public void membership_test_2() {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(1);
    avl.add(2);
    avl.add(3);
    assertTrue(evaluateMembershipBinary("Integer_Variable_0 in AvlTreeList.root.*(left + right).height", avl, 1));
    assertTrue(evaluateMembershipBinary("Object_Variable_0 in AvlTreeList.root.*(left + right).value", avl, 3));
    assertTrue(evaluateMembershipBinary("Object_Variable_0 not in AvlTreeList.root.*(left + right).value", avl, 20));
  }

  @Test
  public void membership_test_3() {
    SearchTree st = new SearchTree();
    st.insert(0);
    st.insert(9);
    st.insert(-1);
    st.insert(8);
    assertTrue(evaluateMembershipBinary("Integer_Variable_0 in SearchTree.root.*(left + right).info", st, 8));
  }

  @Test
  public void membership_test_4() {
    TreeList<Integer> tl = new TreeList<Integer>();
    tl.add(0);
    tl.add(9);
    tl.add(-1);
    tl.add(8);
    assertTrue(evaluateMembershipBinary("Boolean_Variable_0 in TreeList.root.*(right).leftIsPrevious", tl, true));
  }

  @Test
  public void membership_with_var_set() {
    Set<Integer> s = new HashSet<>();
    s.add(1);
    s.add(4);
    assertTrue(evaluateMembershipBinary("Integer_Variable_0 in Integer_Set_Variable_0", s, 4));
    assertFalse(evaluateMembershipBinary("Integer_Variable_0 in Integer_Set_Variable_0", s, 2));
  }

}
