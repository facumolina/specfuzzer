package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.MapWrapper;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * MapWrapper
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedMapWrapperExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private MapWrapper wrapper;

  public QuantifiedMapWrapperExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // MapWrapper object
    wrapper = new MapWrapper();
    wrapper.add(1, 100);
    wrapper.add(2, 100);
    wrapper.add(3, 100);
    wrapper.add(4, 100);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] { { "some n : MapWrapper.map.keySet : n >= 1", true },
        { "all n : MapWrapper.map.keySet : n > 1", false },
        { "some n : MapWrapper.map.values : n <= 0", false },
        { "all n : MapWrapper.map.values : n > 0", true },
        { "some n : MapWrapper.map.keySet : n != #(MapWrapper.map.values)", true } });
  }

  @Test
  public void testExpressionEvaluator() {
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, wrapper));
  }

}
