package expression;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DataStructures.List;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class ExpressionEvaluatorTests {

  @Test
  public void eval_expr_1() {
    // Alloy expression
    String alloy_expr = "all n : List.*(next) : n not in n.next";
    // List object
    List l = new List();
    l.insert(1);
    l.insert(2);
    l.insert(3);
    assertTrue(ExpressionEvaluator.eval(alloy_expr, l));
  }

}
