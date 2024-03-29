package antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Provide a set of tests to ensure correct parsing of numeric comparison expressions
 */
public class NumericComparisonTest {

  private ExprGrammarLexer lexer;
  private ExprGrammarParser parser;

  /**
   * Initialize the lexer and parser from the given alloy expr
   */
  private void initialize(String alloy_expr) {
    lexer = new ExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new ExprGrammarParser(tokens);
  }

  @Test
  public void test_binary_cmp() {
    String logic_expr = "List.x <= Integer_Variable_0";
    initialize(logic_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

  @Test
  public void test_binary_cmp_2() {
    String logic_expr = "#(List.^(next)) <= Integer_Variable_0";
    initialize(logic_expr);
    ParseTree tree = parser.parse();
    assertTrue(parser.getNumberOfSyntaxErrors()==0);
  }

}