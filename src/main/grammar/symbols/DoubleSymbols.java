package grammar.symbols;

import grammar.GrammarSymbols;
import utils.JavaTypesUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class maintains double-related symbol values
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class DoubleSymbols {

  public static final String DOUBLE_ZERO = "<Double_0>";
  public static final String DOUBLE_ONE = "<Double_1>";
  public static final String DOUBLE_TWO = "<Double_2>";
  public static final String DOUBLE_CONSTANT = "<Double_Constant>";
  public static final List<String> DOUBLE_CONSTANT_VALUE = Arrays.asList("0.0", "1.0", "-1.0");
  public static final String DOUBLE_FROM_FIELD = "<Double_From_Field>";
  public static final String DOUBLE_SET = "<Double_Set>";
  public static final String DOUBLE_FIELD = "<Double_Field>";

  public static final String DOUBLE_CMP_EXPR = "<Double_Cmp_Expr>";
  public static final String DOUBLE_CMP_EXPR_VALUE_ONE = two_vars_cmp();
  public static final String DOUBLE_CMP_EXPR_VALUE_TWO = three_vars_cmp();
  public static final String DOUBLE_CMP_EXPR_VALUE_THREE = with_logic_cmp();

  /**
   * Two integers comparison. For example, i < j
   */
  private static String two_vars_cmp() {
    return GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 0) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + DOUBLE_ONE;
  }

  /**
   * Three integers comparison. For example, i = j + k
   */
  private static String three_vars_cmp() {
    String left = GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 0);
    String right = GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 1) + " " + GrammarSymbols.NUMERIC_BIN_OP + " " + DOUBLE_TWO;
    return left + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + right;
  }

  /**
   * Comparison including logic operator
   */
  private static String with_logic_cmp() {
    String left = "("+two_vars_cmp()+")";
    String right = "("+GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 1) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + DOUBLE_TWO+")";
    return left + " " + GrammarSymbols.LOGIC_OP + " " + right;
  }

  /**
   * Prepare comparison symbol
   */
  public static LinkedList<String> prepare_cmp_symbols() {
    LinkedList<String> cmp = new LinkedList<>();
    cmp.add(DOUBLE_CMP_EXPR_VALUE_ONE);
    cmp.add(DOUBLE_CMP_EXPR_VALUE_TWO);
    cmp.add(DOUBLE_CMP_EXPR_VALUE_THREE);
    return cmp;
  }

  /**
   * Get the value for the symbol <Integer_From_Field>
   */
  public static LinkedList<String> get_double_from_field_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(DOUBLE_FIELD);
    return value;
  }

  /**
   * Get the value for the symbol <Integer_0>
   */
  public static LinkedList<String> get_double_zero_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(DOUBLE_CONSTANT);
    value.add(DOUBLE_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 0));
    return value;
  }

  /**
   * Get the value for the symbol <Integer_1>
   */
  public static LinkedList<String> get_double_one_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(DOUBLE_CONSTANT);
    value.add(DOUBLE_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 1));
    return value;
  }

  /**
   * Get the value for the symbol <Integer_2>
   */
  public static LinkedList<String> get_double_two_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(DOUBLE_CONSTANT);
    value.add(DOUBLE_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 2));
    return value;
  }

}
