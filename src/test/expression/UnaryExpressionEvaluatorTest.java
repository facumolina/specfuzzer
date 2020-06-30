package expression;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.ParseContext;

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
    return ExpressionEvaluator.eval(ctx.expr(), o);
  }

  @Test
  public void cardinality1() {
    List l = new List();
    Object o = evaluateUnary("#(List.^(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 0);
  }

  @Test
  public void cardinality2() {
    List l = new List();
    Object o = evaluateUnary("#(List.*(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 1);
  }

  @Test
  public void cardinality3() {
    List l = new List();
    l.insert(1);
    l.insert(2);
    Object o = evaluateUnary("#(List.*(next))", l);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 3);
  }

  @Test
  public void cardinality4() {
    AvlTreeList<Integer> t = new AvlTreeList<Integer>();
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 1);
  }

  @Test
  public void cardinality5() {
    AvlTreeList<Integer> t = new AvlTreeList<Integer>();
    t.add(2);
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 2);
  }

  @Test
  public void cardinality6() {
    AvlTreeList<Integer> t = new AvlTreeList<Integer>();
    t.add(2);
    t.add(4);
    t.add(5);
    Object o = evaluateUnary("#(AvlTreeList.root.*(left + right))", t);
    assert (o instanceof Integer);
    Integer i = (Integer) o;
    assertTrue(i == 4);
  }

}
