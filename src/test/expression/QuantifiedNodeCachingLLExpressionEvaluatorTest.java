package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.commonscollections.NodeCachingLinkedList;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * NodeCachingLinkedList
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedNodeCachingLLExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private NodeCachingLinkedList<Integer> ncll;

  public QuantifiedNodeCachingLLExpressionEvaluatorTest(String alloy_expr,
      Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // NodeCachingLinkedList object
    this.ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(1);
    ncll.add(2);
    ncll.add(3);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] {
        { "all n : NodeCachingLinkedList.firstCachedNode.^(previous + next) : n = n.next.next",
            true },
        { "all n : NodeCachingLinkedList.header.*(previous + next) : n = n.next.previous", true },
        { "all n : NodeCachingLinkedList.header.^(next) : n not in n.*(next)", false },
        { "some n : NodeCachingLinkedList.header.*(previous + next) : n.value != n.previous.value",
            true },
        { "all n : NodeCachingLinkedList.header.^(previous) : n not in n.*(next + previous) implies n not in n.^(next + next)",
            true } });
  }

  @Test
  public void testExpressionEvaluator() {
    System.out.println("Parameterized expr is : " + alloy_expr);
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, ncll));
  }

}
