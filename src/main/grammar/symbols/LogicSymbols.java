package grammar.symbols;

import grammar.GrammarSymbols;
import utils.JavaTypesUtil;

import java.util.LinkedList;

/**
 * This class maintains boolean-related symbol values
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class LogicSymbols {

  public static final String BOOLEAN_ZERO = "<Boolean_0>";
  public static final String BOOLEAN_ONE = "<Boolean_1>";
  public static final String BOOLEAN_TWO = "<Boolean_2>";
  public static final String BOOLEAN_FIELD = "<Boolean_Field>";
  public static final String LOGIC_FROM_FIELD = "<Logic_From_Field>";
  public static final String LOGIC_EXPR = "<Logic_Expr>";

  public static final String LOGIC_CMP_EXPR = "<Logic_Cmp_Expr>";
  public static final String LOGIC_CMP_EXPR_VALUE_ONE = two_vars_cmp();
  public static final String LOGIC_CMP_EXPR_VALUE_TWO = with_logic_cmp();
  public static final String LOGIC_CMP_EXPR_VALUE_THREE = with_logic_expr();

  /**
   * Two boolean comparison. For example, b1 or b2
   */
  private static String two_vars_cmp() {
    return  GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 0) + " " + GrammarSymbols.LOGIC_OP  + " " + BOOLEAN_ONE;
  }

  /**
   * Comparison including logic operator
   */
  private static String with_logic_cmp() {
    String left = "("+two_vars_cmp()+")";
    return left + " " + GrammarSymbols.LOGIC_OP + " (" + IntegerSymbols.INTEGER_CMP_EXPR_VALUE_ONE + ")" ;
  }

  /**
   * Comparison including logic expr
   */
  private static String with_logic_expr() {
    return  "(" + BOOLEAN_ZERO + ") " + GrammarSymbols.LOGIC_OP + " (" + IntegerSymbols.INTEGER_CMP_EXPR_VALUE_ONE + ")" ;
  }

  /**
   * Prepare comparison symbol
   */
  public static LinkedList<String> prepare_cmp_symbols() {
    LinkedList<String> cmp = new LinkedList<>();
    cmp.add(LOGIC_CMP_EXPR_VALUE_ONE);
    cmp.add(LOGIC_CMP_EXPR_VALUE_TWO);
    cmp.add(LOGIC_CMP_EXPR_VALUE_THREE);
    return cmp;
  }

  /**
   * Get the value for the symbol <Logic_From_Field>
   */
  public static LinkedList<String> get_logic_from_field_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(BOOLEAN_FIELD);
    return value;
  }

  /**
   * Get the value for the symbol <Logic_Expr>
   */
  public static LinkedList<String> get_logic_expr_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(GrammarSymbols.QT_EXPR);
    value.add(GrammarSymbols.NUMERIC_CMP_EXPR);
    return value;
  }

  /**
   * Get the value for the symbol <Boolean_0>
   */
  public static LinkedList<String> get_boolean_zero_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(LOGIC_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 0));
    return value;
  }

  /**
   * Get the value for the symbol <Boolean_1>
   */
  public static LinkedList<String> get_boolean_one_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(LOGIC_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 1));
    return value;
  }

  /**
   * Get the value for the symbol <Boolean_2>
   */
  public static LinkedList<String> get_boolean_two_value() {
    LinkedList<String> value = new LinkedList<>();
    value.add(LOGIC_FROM_FIELD);
    value.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 2));
    return value;
  }

}
