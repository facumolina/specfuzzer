package expression;

import DataStructures.SortedList;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class contains tests to ensure that the expression evaluator is working properly
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LogicExpressionEvaluatorTest {

    private Boolean evaluateLogicCmp(String alloy_expr, Object o) {
        return ExpressionEvaluator.eval(alloy_expr, o);
    }

    private Boolean evaluateLogicCmpTernary(String alloy_expr, Object o1, Object o2, Object o3) {
        return ExpressionEvaluator.eval(alloy_expr, o1, o2, o3);
    }

    @Test
    public void or_false() {
        SortedList l = new SortedList();
        assertFalse(evaluateLogicCmp("(SortedList.x = 0) or (SortedList.x = 1)", l));
    }

    @Test
    public void or_one_side_true() {
        SortedList l = new SortedList();
        assertTrue(evaluateLogicCmp("(SortedList.x = 0) or (SortedList.x > 1)", l));
    }

    @Test
    public void or_both_sides_true() {
        SortedList l = new SortedList();
        l.insert(1);
        assertTrue(evaluateLogicCmp("(SortedList.x != 0) or (SortedList.x >= 1)", l));
    }

    @Test
    public void and_true() {
        SortedList l = new SortedList();
        assertTrue(evaluateLogicCmp("(SortedList.x > 0) and (SortedList.next = null)", l));
    }

    @Test
    public void and_one_side_false() {
        SortedList l = new SortedList();
        assertFalse(evaluateLogicCmp("(SortedList.x > 0) and (SortedList.next != null)", l));
    }

    @Test
    public void and_both_sides_false() {
        SortedList l = new SortedList();
        assertFalse(evaluateLogicCmp("(SortedList.x = 0) and (SortedList.next = null)", l));
    }

    @Test
    public void implies_false() {
        SortedList l = new SortedList();
        l.insert(1);
        assertFalse(evaluateLogicCmp("(#(SortedList.*(next)) > 0) implies (SortedList.x = 0)", l));
    }

    @Test
    public void implies_true() {
        SortedList l = new SortedList();
        assertTrue(evaluateLogicCmp("(#(SortedList.^(next)) <= 1) implies (SortedList.x != 1)", l));
    }

    @Test
    public void implies_true_2() {
        SortedList l = new SortedList();
        assertTrue(evaluateLogicCmp("(SortedList.x = 1) implies (SortedList.x < 1)", l));
    }

    @Test
    public void iff_false() {
        SortedList l = new SortedList();
        assertFalse(evaluateLogicCmp("(SortedList.x < 0) iff (SortedList.x >= 0)", l));
    }

    @Test
    public void iff_false_2() {
        SortedList l = new SortedList();
        l.insert(1);
        assertFalse(evaluateLogicCmp("(#(SortedList.*(next)) >= 1) iff (SortedList.x = 0)", l));
    }

    @Test
    public void iff_true_by_false() {
        SortedList l = new SortedList();
        l.insert(1);
        assertTrue(evaluateLogicCmp("(#(SortedList.*(next)) < 0) iff (#(SortedList.*(next)) < 1)", l));
    }

    @Test
    public void iff_true_by_true() {
        SortedList l = new SortedList();
        l.insert(1);
        assertTrue(evaluateLogicCmp("(#(SortedList.*(next)) > 0) iff (#(SortedList.*(next)) >= 1)", l));
    }

    @Test
    public void xor_test() {
        SortedList l = new SortedList();
        l.insert(1);
        assertFalse(evaluateLogicCmp("(SortedList.x != 1) xor (SortedList.x > 1)", l));
        assertTrue(evaluateLogicCmp("(SortedList.x != 1) xor (SortedList.x >= 1)", l));
        assertTrue(evaluateLogicCmp("(SortedList.x = 1) xor (SortedList.x > 1)", l));
        assertFalse(evaluateLogicCmp("(SortedList.x = 1) xor (SortedList.x >= 1)", l));
    }

    @Test
    public void iff_booleans_int_ternary() {
        assertTrue(evaluateLogicCmpTernary("(Boolean_Variable_0 iff Boolean_Variable_1) implies (Integer_Variable_0 = 0)", true, true, 0 ));
        assertTrue(evaluateLogicCmpTernary("(Boolean_Variable_0 iff Boolean_Variable_1) implies (Integer_Variable_0 = 0)", false, false, 0 ));
        assertTrue(evaluateLogicCmpTernary("(Boolean_Variable_0 iff Boolean_Variable_1) implies (Integer_Variable_0 = 0)", true, false, 1 ));
        assertFalse(evaluateLogicCmpTernary("(Boolean_Variable_0 iff Boolean_Variable_1) implies (Integer_Variable_0 = 0)", true, true, 1 ));
    }
}