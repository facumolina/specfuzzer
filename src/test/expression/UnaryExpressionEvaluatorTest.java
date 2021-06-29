package expression;

import java.util.HashMap;

import DataStructures.daikon.StackAr;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import DataStructures.commonscollections.NodeCachingLinkedList;
import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.ParseContext;

import static org.junit.Assert.*;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class UnaryExpressionEvaluatorTest {

  private Object evaluateUnary(String alloy_expr, Object o) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AlloyExprGrammarParser parser = new AlloyExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    ParseContext ctx = (ParseContext) tree;
    ExpressionEvaluator.vars = new HashMap<>();
    ExpressionEvaluator.vars.put(o.getClass().getSimpleName(), o);
    return ExpressionEvaluator.eval(ctx.expr());
  }

  @Test
  public void cardinality1() {
    List l = new List();
    Object o = evaluateUnary("#(List.^(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(0, (int) i);
  }

  @Test
  public void cardinality2() {
    List l = new List();
    Object o = evaluateUnary("#(List.*(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(1, (int) i);
  }

  @Test
  public void cardinality3() {
    List l = new List();
    l.insert(1);
    l.insert(2);
    Object o = evaluateUnary("#(List.*(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(3, (int) i);
  }

  @Test
  public void cardinality4() {
    AvlTreeList<Integer> t = new AvlTreeList<>();
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(1, (int) i);
  }

  @Test
  public void card() {
    StackAr s = new StackAr(1);
    Object o = evaluateUnary("#(StackAr.theArray)", s);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(1, (int) i); // Only contains null
  }

  @Test
  public void cardinality5() {
    AvlTreeList<Integer> t = new AvlTreeList<>();
    t.add(2);
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(2, (int) i);
  }

  @Test
  public void cardinality6() {
    AvlTreeList<Integer> t = new AvlTreeList<>();
    t.add(2);
    t.add(4);
    t.add(5);
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertEquals(4, (int) i);
  }

  @Test
  public void cardinality7() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    ncll.add(1);
    ncll.add(2);
    ncll.add(3);
    Object o = evaluateUnary("#(NodeCachingLinkedList.header.^(next))", ncll);
    Object o1 = evaluateUnary("#(NodeCachingLinkedList.header.*(next+previous))", ncll);
    Object o2 = evaluateUnary("#(NodeCachingLinkedList.header.*(previous))", ncll);
    assert (o instanceof Integer);
    assert (o1 instanceof Integer);
    assert (o2 instanceof Integer);
    Integer i = (Integer) o;
    Integer i1 = (Integer) o1;
    Integer i2 = (Integer) o2;
    assertEquals(4, (int) i);
    assertSame(i, i1);
    assertSame(i, i2);
  }

  @Test
  public void cardinality8() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<>();
    System.out.println(ncll);
    assertFalse(ExpressionEvaluator.eval("#(NodeCachingLinkedList.header.*(previous + next)) != 1", ncll));
  }

}
