package antlr;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Provide a set of tests to ensure correct parsing of quantified expressions
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class QuantifiedExpressionTest {
  
  private AlloyExprGrammarLexer lexer;
  private AlloyExprGrammarParser parser;

  /**
   * Initialize the lexer and parser from the given alloy expr
   */ 
  private void initialize(String alloy_expr) {
    lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new AlloyExprGrammarParser(tokens);
  }

  @Test
  public void test_qt_list_1() {
    String qt_expr = "all n : List.*(next) : n.next != null";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_list_2() {
    String qt_expr = "some n : List.*(next) : n != n.next.next";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_list_3() {
    String qt_expr = "lone n : List.*(next) : n != n.next.next";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_list_4() {
    String qt_expr = "one n : List.^(next) : n.x < n.next.x";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_list_5() {
    String qt_expr = "no n : List.*(next) : n != n.next";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_list_binary_1() {
    String qt_expr = "no n : List.*(next) : n.x < Integer_Variable";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_qt_avl_1() {
  	String qt_expr = "all n : AvlTreeList.root.^(left) : n not in n.^(right)";
    initialize(qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }
  
  @Test
  public void test_bad_qt_1() {
    String bad_qt_expr = "badoperator n : List.*(next) : n.next != null";
    initialize(bad_qt_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors() > 0);
  }

}