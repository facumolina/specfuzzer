package antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Provide a set of tests to ensure correct parsing of logic comparison expressions
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LogicComparisonTest {

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
    public void test_list_or_1() {
        String logic_expr = "(some n : List.*(next) : n not in n.^(next)) or (one n : List.*(next) : n in n.^(next))";
        initialize(logic_expr);
        ParseTree tree = parser.parse();
        assertTrue(parser.getNumberOfSyntaxErrors()==0);
    }

    @Test
    public void test_list_iff() {
        String logic_expr = "(List.x < 0) iff (List.x <= List.x + List.x)";
        initialize(logic_expr);
        ParseTree tree = parser.parse();
        assertTrue(parser.getNumberOfSyntaxErrors()==0);
    }

}
