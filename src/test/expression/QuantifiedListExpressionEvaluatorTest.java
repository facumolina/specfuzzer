package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.SortedList;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on class
 * List
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedListExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private SortedList list;

  public QuantifiedListExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // List object
    list = new SortedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays.asList(new Object[][] { { "all n : SortedList.*(next) : n not in n.^(next)", true },
        { "all n : SortedList.*(next) : n in n.^(next)", false },
        { "all n : SortedList.*(next) : n not in n.*(next)", false },
        { "some n : SortedList.*(next) : n.x >= n.next.x", false },
        { "some n : SortedList.*(next) : n.x != n.next.x", true },
        { "all n : SortedList.*(next) : n.x > n.next.x", false },
        { "all n : SortedList.^(next) : n.x < n.next.x", true },
        { "all n : SortedList.^(next) : n.x <= n.next.x", true },
        { "all n : SortedList.*(next) : n.x = n.next.x", false },
        { "all n : SortedList.*(next) : n != n.next", true },
        { "all n : SortedList.*(next) : n = n.next", false },
        { "some n : SortedList.*(next) : n.x < n.next.x", true },
        { "all n : SortedList.*(next) : (n.x > n.next.x) implies (n.x != n.next.x)", true },
        { "all n : SortedList.*(next) : (n = n.next.next) implies (n != n.next)", true },
        { "all n : SortedList.^(next) : (n != null) implies (n.x <= n.next.x)", true },
        { "no n: SortedList.*(next) : n.x = 0", true},
        { "no n: SortedList.*(next) : n.x = 1", false},
        { "lone n: SortedList.*(next) : n.x = 0", true},
        { "lone n: SortedList.*(next) : n.x = 1", true},
        { "lone n: SortedList.*(next) : n.x > 1", false},
        { "one n: SortedList.*(next) : n.x = 0", false},
        { "one n: SortedList.*(next) : n.x > 1", false},
        { "one n: SortedList.*(next) : n.x = 1", true},
        { "all n: SortedList.*(next) : (n.x = 0) or (n.x = 1)", false},
        { "all n: SortedList.*(next) : (n.x = 0) or (n.x > 0)", true}
    });
  }

  @Test
  public void testExpressionEvaluator() {
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, list));
  }

}
