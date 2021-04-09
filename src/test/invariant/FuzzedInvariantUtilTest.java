package invariant;

import DataStructures.List;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

  @Test
  public void test_binary_3() {
    assertTrue(2==FuzzedInvariantUtil.get_amount_of_vars("#(Query.criterias) > Integer_Variable"));
  }

  @Test
  public void num_of_soft_comp_stack_ar() {
    int n = FuzzedInvariantUtil.number_of_software_components("#(StackAr.theArray) != #(StackAr.theArray) + 1");
    assertTrue(n==1);
    n = FuzzedInvariantUtil.number_of_software_components("#(StackAr.theArray) <= #(StackAr.theArray) + StackAr.topOfStack");
    assertTrue(n==2);
    n = FuzzedInvariantUtil.number_of_software_components("all n : StackAr.theArray : n != null");
    assertTrue(n==3);
  }

  @Test
  public void num_of_soft_comp_list() {
    int n = FuzzedInvariantUtil.number_of_software_components("List.x <= List.x");
    assertTrue(n==1);
    n = FuzzedInvariantUtil.number_of_software_components("#(List.*(next)) != #(List.^(next))");
    assertTrue(n==2);
  }

  @Test
  public void discard_1() {
    assertTrue(FuzzedInvariantUtil.discard("#(StackAr.theArray) != #(StackAr.theArray) + 1"));
    assertFalse(FuzzedInvariantUtil.discard("#(StackAr.theArray) <= #(StackAr.theArray) + StackAr.topOfStack"));
    assertFalse(FuzzedInvariantUtil.discard("all n : StackAr.theArray : n != null"));
    assertTrue(FuzzedInvariantUtil.discard("List.x <= List.x"));
    assertTrue(FuzzedInvariantUtil.discard("List.x = List.x - 0"));
    assertTrue(FuzzedInvariantUtil.discard("List.x >= List.x - 0"));
    assertTrue(FuzzedInvariantUtil.discard("List.x >= List.x - 1"));
    assertFalse(FuzzedInvariantUtil.discard("#(List.*(next)) != #(List.^(next))"));
    assertFalse(FuzzedInvariantUtil.discard("#(List.*(next)) != 0"));
    assertTrue(FuzzedInvariantUtil.discard("#(List.*(next)) >= #(List.*(next)) + 0"));
    assertTrue(FuzzedInvariantUtil.discard("#(SearchTree.root.^(left + right)) = #(SearchTree.root.^(left + right))"));
  }

}
