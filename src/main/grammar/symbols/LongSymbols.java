package grammar.symbols;

import grammar.GrammarSymbols;
import utils.JavaTypesUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class maintains long-related symbol values
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LongSymbols {

    public static final String LONG_ZERO = "<Long_0>";
    public static final String LONG_ONE = "<Long_1>";
    public static final String LONG_TWO = "<Long_2>";
    public static final String LONG_FROM_FIELD = "<Long_From_Field>";
    public static final String LONG_SET = "<Long_Set>";
    public static final String LONG_FIELD = "<Long_Field>";

    public static final String LONG_CMP_EXPR = "<Long_Cmp_Expr>";
    public static final String LONG_CMP_EXPR_VALUE_ONE = two_vars_cmp();
    public static final String LONG_CMP_EXPR_VALUE_TWO = three_vars_cmp();
    public static final String LONG_CMP_EXPR_VALUE_THREE = with_logic_cmp();

    /**
     * Two integers comparison. For example, i < j
     */
    private static String two_vars_cmp() {
      return GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 0) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + LONG_ONE;
    }

    /**
     * Three integers comparison. For example, i = j + k
     */
    private static String three_vars_cmp() {
      String left = GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 0);
      String right = GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 1) + " " + GrammarSymbols.NUMERIC_BIN_OP + " " + LONG_TWO;
      return left + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + right;
    }

    /**
     * Comparison including logic operator
     */
    private static String with_logic_cmp() {
      String left = "("+two_vars_cmp()+")";
      String right = "("+GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 1) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + LONG_TWO+")";
      return left + " " + GrammarSymbols.LOGIC_OP + " " + right;
    }

    /**
     * Prepare comparison symbol
     */
    public static LinkedList<String> prepare_cmp_symbols() {
      LinkedList<String> cmp = new LinkedList<>();
      cmp.add(LONG_CMP_EXPR_VALUE_ONE);
      cmp.add(LONG_CMP_EXPR_VALUE_TWO);
      cmp.add(LONG_CMP_EXPR_VALUE_THREE);
      return cmp;
    }

    /**
     * Get the value for the symbol <Integer_From_Field>
     */
    public static LinkedList<String> get_long_from_field_value() {
      LinkedList<String> value = new LinkedList<>();
      value.add(LONG_FIELD);
      return value;
    }

    /**
     * Get the value for the symbol <Integer_0>
     */
    public static LinkedList<String> get_long_zero_value() {
      LinkedList<String> value = new LinkedList<>();
      value.add(LONG_FROM_FIELD);
      value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 0));
      return value;
    }

    /**
     * Get the value for the symbol <Integer_1>
     */
    public static LinkedList<String> get_long_one_value() {
      LinkedList<String> value = new LinkedList<>();
      value.add(LONG_FROM_FIELD);
      value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 1));
      return value;
    }

    /**
     * Get the value for the symbol <Integer_2>
     */
    public static LinkedList<String> get_long_two_value() {
      LinkedList<String> value = new LinkedList<>();
      value.add(LONG_FROM_FIELD);
      value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 2));
      return value;
    }

}
