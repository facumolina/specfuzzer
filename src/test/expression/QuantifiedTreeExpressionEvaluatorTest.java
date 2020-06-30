package expression;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import DataStructures.AvlTreeList;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
@RunWith(Parameterized.class)
public class QuantifiedTreeExpressionEvaluatorTest {

  private String alloy_expr;
  private Boolean expected_result;
  private AvlTreeList<Integer> tree;

  public QuantifiedTreeExpressionEvaluatorTest(String alloy_expr, Boolean expected_result) {
    this.alloy_expr = alloy_expr;
    this.expected_result = expected_result;
    // List object
    tree = new AvlTreeList<Integer>();
    tree.add(1);
    tree.add(2);
    tree.add(3);
  }

  @Parameterized.Parameters
  public static Collection alloyExpressions() {
    return Arrays
        .asList(new Object[][] { { "all n : AvlTreeList.root.*(left) : n != n.right", true },
            { "all n : AvlTreeList.root.*(right) : n != n.right", true },
            { "all n : AvlTreeList.root.*(left + right) : n != n.right", true },
            { "all n : AvlTreeList.root.*(left + right) : n not in n.^(left+right)", true },
            { "all n : AvlTreeList.root.*(left + right) : n in n.^(left+right)", false },
            { "all n : AvlTreeList.root.*(left + right) : n in n.^(left)", false },
            { "all n : AvlTreeList.root.*(left + right) : n not in n.^(right)", true },
            { "all n : AvlTreeList.root.*(left + right) : n = n.right", false },
            { "some n : AvlTreeList.root.*(left + right) : n = n.right.left", false },
            { "all n : AvlTreeList.root.^(left) : n.height < n.left.height", false },
            { "all n : AvlTreeList.root.^(left) : n.height > n.left.height", true },
            { "all n : AvlTreeList.root.*(left + right) : n.size > n.right.size", true },
            { "all n : AvlTreeList.root.*(left + right) : n.size > n.left.size", true },
            { "all n : AvlTreeList.root.*(left + right) : n.size > n.left.size and n.size > n.right.size",
                true },
            { "all n : AvlTreeList.root.*(left + right) : n.size < n.left.size and n.size > n.right.size",
                false },
            { "all n : AvlTreeList.root.*(left + right) : n.height > n.left.height and n.height > n.right.height",
                true } });
  }

  @Test
  public void testExpressionEvaluator() {
    System.out.println("Parameterized expr is : " + alloy_expr);
    assertEquals(expected_result, ExpressionEvaluator.eval(alloy_expr, tree));
  }

}
