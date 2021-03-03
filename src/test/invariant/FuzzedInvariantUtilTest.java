package invariant;

import DataStructures.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FuzzedInvariantUtilTest {

  @Test
  public void test_unary_1() {
    assertTrue(FuzzedInvariantArity.ONE==FuzzedInvariantUtil.get_arity("List.x <= List.x", List.class));
  }

  @Test
  public void test_unary_2() {
    assertTrue(FuzzedInvariantArity.ONE==FuzzedInvariantUtil.get_arity("no n : List.*(next) : n.x <= List.x", List.class));
  }

  @Test
  public void test_unary_3() {
    assertTrue(FuzzedInvariantArity.ONE==FuzzedInvariantUtil.get_arity("List.x <= #(List.*(next)) - List.x", List.class));
  }

  @Test
  public void test_binary_1() {
    assertTrue(FuzzedInvariantArity.TWO==FuzzedInvariantUtil.get_arity("#(List.^(next)) = Integer_Variable", List.class));
  }

  @Test
  public void test_binary_2() {
    assertTrue(FuzzedInvariantArity.TWO==FuzzedInvariantUtil.get_arity("#(List.^(next)) != List.x + Integer_Variable", List.class));
  }

}
