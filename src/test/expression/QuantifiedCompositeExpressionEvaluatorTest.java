package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.eiffel.Composite;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * AvlTreeList
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedCompositeExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private Composite composite;

  public QuantifiedCompositeExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // List object
    composite = new Composite(4);
    Composite c1 = new Composite(1);
    Composite c2 = new Composite(2);
    composite.add_child(c1);
    composite.add_child(c2);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] { { "all n : Composite.children : n.value > 0", true }, {
        "some n : Composite.ancestors : (n.children = n.parent.children) implies (n.value != n.max_child.value)",
        false }, { "all n : Composite.children : n.max_child = null", true },
        { "all n : Composite.children : n.parent != null", true } });
  }

  @Test
  public void testExpressionEvaluator() {
    System.out.println("Parameterized expr is : " + alloy_expr);
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, composite));
  }

}
