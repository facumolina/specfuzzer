package expression;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DataStructures.SortedList;

/**
 * This class contains tests to ensure that when an invalid object type is supplied for evaluation,
 * the evaluator behaves properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class UnexpectedObjectTypeTest {

  @Test(expected = NonApplicableExpressionException.class)
  public void testExpressionEvaluator() {
    SortedList l = new SortedList();
    assertEquals(false, ExpressionEvaluator
        .eval("all n : AvlTreeList.root.*(left + right) : n in n.^(left+right)", l));
  }

  @Test(expected = NonApplicableExpressionException.class)
  public void testExpressionEvaluatorTwo() {
    assertEquals(false, ExpressionEvaluator
            .eval("all n : AvlTreeList.root.*(left + right) : n in n.^(left+right)", new String()));
  }

}
