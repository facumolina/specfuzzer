package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.commonscollections.TreeList;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * NodeCachingLinkedList
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedTreeListExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private TreeList<Integer> tlist;

  public QuantifiedTreeListExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // TreeList object
    tlist = new TreeList<Integer>();
    tlist.add(1);
    tlist.add(4);
    tlist.add(5);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] {
        { "all n : TreeList.root.^(right) : n.rightIsNext != n.right.rightIsNext", true },
        { "some n : TreeList.root.*(left) : n.value != n.left.value", true } });
  }

  @Test
  public void testExpressionEvaluator() {
    System.out.println("Parameterized expr is : " + alloy_expr);
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, tlist));
  }

}
