package expression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import DataStructures.MapWrapper;
import DataStructures.commonscollections.NodeCachingLinkedList;
import DataStructures.commonscollections.TreeList;
import DataStructures.eiffel.Composite;
import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.ParseContext;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class ComparisonExpressionEvaluatorTest {

  private Boolean evaluateCmp(String alloy_expr, Object o) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AlloyExprGrammarParser parser = new AlloyExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    ParseContext ctx = (ParseContext) tree;
    return (Boolean) ExpressionEvaluator.eval(ctx.expr(), o);
  }

  @Test
  public void not_equals() {
    List l = new List();
    assertFalse(evaluateCmp("List.x != List.x", l));
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
}
