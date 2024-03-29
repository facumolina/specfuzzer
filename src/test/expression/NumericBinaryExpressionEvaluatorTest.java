package expression;

import DataStructures.SortedList;
import antlr.ExprGrammarLexer;
import antlr.ExprGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class contains tests to ensure that the expression evaluator is working properly on numeric binary expressions.
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NumericBinaryExpressionEvaluatorTest {

  private Number evaluateBinaryExpr(String alloy_expr, Object o) {
    ExprGrammarLexer lexer = new ExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprGrammarParser parser = new ExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    ExprGrammarParser.ParseContext ctx = (ExprGrammarParser.ParseContext) tree;
    ExpressionEvaluator.vars = new HashMap<String, Object>();
    ExpressionEvaluator.vars.put(o.getClass().getSimpleName(), o);
    return (Number) ExpressionEvaluator.eval(ctx.expr());
  }

  @Test
  public void test_addition() {
    SortedList l = new SortedList();
    l.insert(1);
    assertEquals(evaluateBinaryExpr("SortedList.x + SortedList.x", l), 2);
    l.insert(-1);
    assertEquals(evaluateBinaryExpr("SortedList.x + SortedList.x", l), -2);
  }

  @Test
  public void test_subtraction() {
    SortedList l = new SortedList();
    l.insert(1);
    assertEquals(evaluateBinaryExpr("SortedList.x - SortedList.x", l), 0);
    l.insert(-1);
    assertEquals(evaluateBinaryExpr("SortedList.x - SortedList.x", l), 0);
  }

  @Test
  public void test_multiply() {
    SortedList l = new SortedList();
    l.insert(2);
    assertEquals(evaluateBinaryExpr("SortedList.x * 0", l), 0);
    assertEquals(evaluateBinaryExpr("SortedList.x * 1", l), 2);
    assertEquals(evaluateBinaryExpr("SortedList.x * SortedList.x", l), 4);
    l.insert(-1);
    assertEquals(evaluateBinaryExpr("SortedList.x * 1", l), -1);
    assertEquals(evaluateBinaryExpr("SortedList.x * SortedList.x", l), 1);
  }

  @Test(expected = NonEvaluableExpressionException.class)
  public void test_divide_by_zero() {
    SortedList l = new SortedList();
    l.insert(3);
    evaluateBinaryExpr("SortedList.x / 0", l);
  }

  @Test
  public void test_divide() {
    SortedList l = new SortedList();
    l.insert(4);
    assertEquals(evaluateBinaryExpr("SortedList.x / 1", l), 4);
    assertEquals(evaluateBinaryExpr("SortedList.x / SortedList.x", l), 1);
    l.insert(2);
    assertEquals(evaluateBinaryExpr("SortedList.next.x / SortedList.x", l), 2);
    l.insert(-4);
    assertEquals(evaluateBinaryExpr("SortedList.x / 1", l), -4);
    assertEquals(evaluateBinaryExpr("SortedList.x / SortedList.x", l), 1);
    assertEquals(evaluateBinaryExpr("SortedList.x / SortedList.next.x", l), -2);
  }

  @Test
  public void test_modulo() {
    SortedList l = new SortedList();
    l.insert(4);
    assertEquals(evaluateBinaryExpr("SortedList.x % 1", l), 0);
    assertEquals(evaluateBinaryExpr("SortedList.x % SortedList.x", l), 0);
    l.insert(3);
    assertEquals(evaluateBinaryExpr("SortedList.next.x % SortedList.x", l), 1);
  }

}