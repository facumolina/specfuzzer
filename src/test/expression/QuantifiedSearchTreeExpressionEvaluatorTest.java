package expression;

import DataStructures.korat.binarysearchtree.SearchTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QuantifiedSearchTreeExpressionEvaluatorTest {

  @Test
  public void intersection() {
    SearchTree st = new SearchTree();
    st.insert(-1);
    st.insert(2);
    st.insert(3);
    assertTrue(ExpressionEvaluator.eval("all n : SearchTree.root.*(left+right) : (n.left.*(left+right)) & (n.right.*(left+right)) in empty", st));
  }

}