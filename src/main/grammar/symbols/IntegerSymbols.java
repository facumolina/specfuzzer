package grammar.symbols;

import grammar.GrammarSymbols;
import utils.JavaTypesUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class maintains integer-related symbol values
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class IntegerSymbols {

  public static final String INTEGER_ZERO = "<Integer_0>";
  public static final String INTEGER_ONE = "<Integer_1>";
  public static final String INTEGER_TWO = "<Integer_2>";
  public static final String INTEGER_CONSTANT = "<Integer_Constant>";
  public static final List<String> INTEGER_CONSTANT_VALUE = Arrays.asList("0", "1", "-1");
  public static final String INTEGER_FROM_FIELD = "<Integer_From_Field>";
  public static final String INTEGER_SET = "<Integer_Set>";
  public static final String INTEGER_FIELD = "<Integer_Field>";
  public static final String INTEGER_FROM_SET_SIZE = "<Integer_From_Set_Size>";

  public static final String INTEGER_CMP_EXPR = "<Integer_Cmp_Expr>";
  public static final String INTEGER_CMP_EXPR_VALUE_ONE = two_vars_cmp();
  public static final String INTEGER_CMP_EXPR_VALUE_TWO = three_vars_cmp();
  public static final String INTEGER_CMP_EXPR_VALUE_THREE = with_logic_cmp();

  /**
   * Two integers comparison. For example, i < j
   */
  private static String two_vars_cmp() {
    return GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 0) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + INTEGER_ONE;
  }

  /**
   * Three integers comparison. For example, i = j + k
   */
  private static String three_vars_cmp() {
    String left = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 0);
    String right = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 1) + " " + GrammarSymbols.NUMERIC_BIN_OP + " " + INTEGER_TWO;
    return left + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + right;
  }

  /**
   * Comparison including logic operator
   */
  private static String with_logic_cmp() {
    String left = "("+two_vars_cmp()+")";
    String right = "("+GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 1) + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + INTEGER_TWO+")";
    return left + " " + GrammarSymbols.LOGIC_OP + " " + right;
  }

  /**
   * Prepare comparison symbol
   */
  public static LinkedList<String> prepare_cmp_symbols() {
    LinkedList<String> cmp = new LinkedList<>();
    cmp.add(IntegerSymbols.INTEGER_CMP_EXPR_VALUE_ONE);
    cmp.add(IntegerSymbols.INTEGER_CMP_EXPR_VALUE_TWO);
    cmp.add(IntegerSymbols.INTEGER_CMP_EXPR_VALUE_THREE);
    return cmp;
  }

  /**
   * Get the value for the symbol <Integer_From_Field>
   */
  public static LinkedList<String> get_integer_from_field_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(IntegerSymbols.INTEGER_FIELD);
    value.add(IntegerSymbols.INTEGER_FROM_SET_SIZE);
    return value;
  }

  /**
   * Get the value for the symbol <Integer_0>
   */
  public static LinkedList<String> get_integer_zero_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(INTEGER_CONSTANT);
    value.add(INTEGER_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 0));
    return value;
  }

  /**
   * Get the value for the symbol <Integer_1>
   */
  public static LinkedList<String> get_integer_one_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(INTEGER_CONSTANT);
    value.add(INTEGER_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 1));
    return value;
  }

  /**
   * Get the value for the symbol <Integer_2>
   */
  public static LinkedList<String> get_integer_two_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(INTEGER_CONSTANT);
    value.add(INTEGER_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 2));
    return value;
  }

}