package invariant;

import DataStructures.List;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FuzzedInvariantUtilTest {

  @Test
  public void test_unary_1() {
    assertTrue(1==FuzzedInvariantUtil.get_amount_of_vars("List.x <= List.x"));
  }

  @Test
  public void test_unary_2() {
    assertTrue(1==FuzzedInvariantUtil.get_amount_of_vars("no n : List.*(next) : n.x <= List.x"));
  }

  @Test
  public void test_unary_3() {
    assertTrue(1==FuzzedInvariantUtil.get_amount_of_vars("List.x <= #(List.*(next)) - List.x"));
  }

  @Test
  public void test_binary_1() {
    assertTrue(2==FuzzedInvariantUtil.get_amount_of_vars("#(List.^(next)) = Integer_Variable"));
  }

  @Test
  public void test_binary_2() {
    assertTrue(2==FuzzedInvariantUtil.get_amount_of_vars("#(List.^(next)) != List.x + Integer_Variable"));
  }

}
