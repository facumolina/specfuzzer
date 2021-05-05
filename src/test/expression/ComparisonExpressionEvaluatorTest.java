package expression;

import DataStructures.korat.binarysearchtree.SearchTree;
import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import DataStructures.MapWrapper;
import DataStructures.commonscollections.NodeCachingLinkedList;
import DataStructures.commonscollections.TreeList;
import DataStructures.eiffel.Composite;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class ComparisonExpressionEvaluatorTest {

  private Boolean evaluateCmp(String alloy_expr, Object o) {
    return ExpressionEvaluator.eval(alloy_expr, o);
  }

  private Boolean evaluateCmpBinary(String alloy_expr, Object o1, Object o2) {
    return ExpressionEvaluator.eval(alloy_expr, o1, o2);
  }

  @Test
  public void not_equals() {
    List l = new List();
    assertFalse(evaluateCmp("List.x != List.x", l));
    assertTrue(evaluateCmp("#(List.^(next)) != List.x - 1", l));
    assertTrue(evaluateCmp("List.x > 0", l));
  }

  @Test
  public void lt_eq() {
    List l = new List();
    assertTrue(evaluateCmp("List.x <= List.x", l));
  }

  @Test
  public void eq() {
    List l = new List();
    assertTrue(evaluateCmp("List.x = List.x", l));
  }

  @Test
  public void eq2() {
    List l = new List();
    l.insert(2);
    l.insert(2);
    assertTrue(evaluateCmp("List.x = List.next.x", l));
  }

  @Test
  public void constant_gt() {
    List l = new List();
    l.insert(1);
    assertFalse(evaluateCmp("0 > List.x", l));
  }

  @Test
  public void cardinal_gte() {
    List l = new List();
    l.insert(1);
    assertTrue(evaluateCmp("#(List.*(next)) >= List.x", l));
    assertFalse(evaluateCmp("List.x > #(List.*(next)) + 1", l));
  }

  @Test
  public void set_sizes() {
    List l = new List();
    l.insert(1);
    l.insert(2);
    assertFalse(evaluateCmp("#(List.^(next)) >= #(List.*(next))", l));
  }

  @Test
  public void set_sizes_two() {
    List l = new List();
    l.insert(1);
    l.insert(2);
    assertTrue(evaluateCmp("#(List.*(next)) >= #(List.*(next))", l));
  }

  @Test
  public void set_size_non_zero() {
    List l = new List();
    l.insert(2);
    l.insert(3);
    assertTrue(evaluateCmp("#(List.*(next)) != 0", l));
    assertTrue(evaluateCmp("#(List.*(next)) > 0", l));
    assertTrue(evaluateCmp("#(List.*(next)) >= 1", l));
  }

  @Test
  public void set_size_binary_1() {
    List l = new List();
    l.insert(2);
    l.insert(3);
    assertTrue(evaluateCmpBinary("#(List.*(next)) = Integer_Variable_0", l, 3));
  }

  @Test
  public void variables_binary_1() {
    List l = new List();
    l.insert(2);
    l.insert(3);
    assertFalse(evaluateCmpBinary("List.x = Integer_Variable_0", l, 10));
  }


  @Test
  public void int_field() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    assertTrue(evaluateCmp("0 <= NodeCachingLinkedList.cacheSize", ncll));
  }

  @Test
  public void set_sizes_ncll() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    ncll.add(1);
    ncll.add(2);
    ncll.add(3);
    assertTrue(evaluateCmp(
        "#(NodeCachingLinkedList.header.*(next)) = #(NodeCachingLinkedList.header.*(previous))",
        ncll));
  }

  @Test
  public void set_size_treelist() {
    TreeList<Integer> tl = new TreeList<Integer>();
    tl.add(1);
    tl.add(2);
    tl.add(3);
    assertTrue(evaluateCmp("#(TreeList.root.*(left+right)) = TreeList.size", tl));
  }

  @Test
  public void set_size_avl() {
    AvlTreeList<Integer> t = new AvlTreeList<Integer>();
    t.add(2);
    t.add(4);
    t.add(5);
    assertTrue(evaluateCmp("#(AvlTreeList.root.*(left + right)) = AvlTreeList.root.size + 1", t));
    assertTrue(evaluateCmp("#(AvlTreeList.root.*(left + right)) - 1 = AvlTreeList.root.size", t));
  }

  @Test
  public void set_size_composite() {
    Composite c = new Composite(3);
    assertTrue(evaluateCmp("#(Composite.children) = 0", c));
    c.add_child(new Composite(1));
    assertTrue(evaluateCmp("#(Composite.children) = 1", c));
    c.add_child(new Composite(2));
    assertTrue(evaluateCmp("#(Composite.children) > 1", c));
    assertTrue(evaluateCmp("#(Composite.ancestors) = 0", c));
  }

  @Test
  public void sets_map_wrapper() {
    MapWrapper wrapper = new MapWrapper();
    wrapper.add(1, 2);
    wrapper.add(2, 3);
    assertTrue(evaluateCmp("#(MapWrapper.map.values) = #(MapWrapper.map.keySet)", wrapper));
  }

  @Test
  public void size_searchtree() {
    SearchTree stree = new SearchTree();
    assertFalse(evaluateCmp("SearchTree.size != 0", stree));
    assertFalse(evaluateCmp("SearchTree.size > 0", stree));
    assertTrue(evaluateCmp("SearchTree.size = #(SearchTree.root.*(left + right))",stree));
  }

  @Test
  public void size_searchtree_twp() {
    SearchTree stree = new SearchTree();
    stree.insert(2);
    stree.insert(5);
    stree.insert(56);
    assertTrue(evaluateCmp("SearchTree.size > 0", stree));
    assertTrue(evaluateCmp("SearchTree.size = #(SearchTree.root.*(left + right))",stree));
  }

  @Test
  public void test_bin_numeric_cmp() {
    assertTrue(evaluateCmpBinary("Integer_Variable_0 > Integer_Variable_1", 1, 0));
    assertTrue(evaluateCmpBinary("Integer_Variable_0 = Integer_Variable_1", 1, 1));
  }

}
