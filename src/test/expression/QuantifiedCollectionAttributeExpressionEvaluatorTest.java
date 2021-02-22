package expression;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import DataStructures.CollectionAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * CollectionAttribute
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedCollectionAttributeExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private CollectionAttribute collectionAttribute;

  public QuantifiedCollectionAttributeExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // CollectionAttribute object
    collectionAttribute = new CollectionAttribute();
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] {
      {"all n : CollectionAttribute.nonNullList : n != null", true},
      {"some n : CollectionAttribute.nonNullList : n = null", false},
      {"some n : CollectionAttribute.positives : n >= #(CollectionAttribute.nonNullList)", true},
      {"all n : CollectionAttribute.positives : n > 0", true},
      {"no n : CollectionAttribute.nonNullList : n = null", true}
    });
  }

  @Test
  public void testExpressionEvaluator() {
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, collectionAttribute));
  }

}
