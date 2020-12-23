package expression;

import DataStructures.List;
import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LogicExpressionEvaluatorTest {

    private Boolean evaluateLogicCmp(String alloy_expr, Object o) {
        AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlloyExprGrammarParser parser = new AlloyExprGrammarParser(tokens);
        ParseTree tree = parser.parse();
        AlloyExprGrammarParser.ParseContext ctx = (AlloyExprGrammarParser.ParseContext) tree;
        ExpressionEvaluator.vars = new HashMap<String, Object>();
        return (Boolean) ExpressionEvaluator.eval(ctx.expr(), o);
    }

    @Test
    public void or_false() {
        List l = new List();
        assertFalse(evaluateLogicCmp("(List.x = 0) or (List.x = 1)", l));
    }

    @Test
    public void or_one_side_true() {
        List l = new List();
        assertTrue(evaluateLogicCmp("(List.x = 0) or (List.x > 1)", l));
    }

    @Test
    public void or_both_sides_true() {
        List l = new List();
        l.insert(1);
        assertTrue(evaluateLogicCmp("(List.x != 0) or (List.x >= 1)", l));
    }

    @Test
    public void and_true() {
        List l = new List();
        assertTrue(evaluateLogicCmp("(List.x > 0) and (List.next = null)", l));
    }

    @Test
    public void and_one_side_false() {
        List l = new List();
        assertFalse(evaluateLogicCmp("(List.x > 0) and (List.next != null)", l));
    }

    @Test
    public void and_both_sides_false() {
        List l = new List();
        assertFalse(evaluateLogicCmp("(List.x = 0) and (List.next = null)", l));
    }

}
