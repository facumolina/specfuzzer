package expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import DataStructures.AvlTreeList;
import DataStructures.CollectionAttribute;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

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
public class SetExpressionEvaluatorTest {

  private Collection<Object> evaluateSet(String alloy_expr, Object o) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AlloyExprGrammarParser parser = new AlloyExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    ParseContext ctx = (ParseContext) tree;
    ExpressionEvaluator.vars = new HashMap<String, Object>();
    return (Collection<Object>) ExpressionEvaluator.eval(ctx.expr(), o);
  }

  @Test
  public void emptySet() {
    List l = new List();
    Collection<Object> set = evaluateSet("List.*(next)", l);
    assertEquals(set.size(), 1);
  }

  @Test
  public void emptySet2() {
    List l = new List();
    Collection<Object> set = evaluateSet("List.^(next)", l);
    assertEquals(set.size(), 0);
  }

  @Test
  public void filledSet() {
    List l = new List();
    l.insert(2);
    l.insert(3);
    Collection<Object> set = evaluateSet("List.*(next)", l);
    assertEquals(set.size(), 3);
  }

  @Test
  public void filledSet2() {
    List l = new List();
    l.insert(2);
    l.insert(3);
    Collection<Object> set = evaluateSet("List.^(next)", l);
    assertEquals(set.size(), 2);
  }

  @Test
  public void filledAvlSet() {
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    Collection<Object> set = evaluateSet("AvlTreeList.root.*(left)", avl);
    assertEquals(set.size(), 1);
  }

  @Test
  public void collectionAttrs() {
    CollectionAttribute ca = new CollectionAttribute();
    // Collections
    Collection<Object> collection = evaluateSet("CollectionAttribute.positives", ca);
    assertEquals(collection.size(), 5);
    Collection<Object> nullSet = evaluateSet("CollectionAttribute.nullList", ca);
    assertNull(nullSet);
  }

}
