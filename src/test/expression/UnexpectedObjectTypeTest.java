package expression;

import static org.junit.Assert.assertEquals;

import DataStructures.AvlTreeList;
import org.junit.Test;

import DataStructures.List;

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
    List l = new List();
    assertEquals(false, ExpressionEvaluator
        .eval("all n : AvlTreeList.root.*(left + right) : n in n.^(left+right)", l));
  }

  @Test(expected = NonApplicableExpressionException.class)
  public void testExpressionEvaluatorTwo() {
    AvlTreeList.Node n = AvlTreeList.Node.EMPTY_LEAF;
    assertEquals(false, ExpressionEvaluator
            .eval("all n : AvlTreeList.root.*(left + right) : n in n.^(left+right)", n));
  }

}
