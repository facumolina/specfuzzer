package expression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import DataStructures.List;
import DataStructures.commonscollections.NodeCachingLinkedList;
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
  public void int_field() {
    NodeCachingLinkedList<Integer> ncll = new NodeCachingLinkedList<Integer>();
    assertTrue(evaluateCmp("0 <= NodeCachingLinkedList.cacheSize", ncll));
  }
}
