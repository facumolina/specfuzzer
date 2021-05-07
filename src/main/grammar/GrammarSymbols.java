package grammar;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Class to handle the grammar symbols.
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar
 */
public class GrammarSymbols {

  // Constant symbols that will be part of all the grammars
  public static final String START_SYMBOL = "<Fuzzed_Spec>";

  // Quantification
  public static final String QT_EXPR = "<Quantified_Expr>";
  public static final String QUANTIFIER = "<Quantifier>";
  public static final List<String> QUANTIFIER_VALUE = Arrays.asList("all", "some", "no");

  // Reference comparisons
  public static final String REF_OP = "<Reference_Op>";
  public static final List<String> REF_OP_VALUE = Arrays.asList("=", "!=");

  // Reference and Set comparison
  public static final String VAR_SET_CMP_OP = "<Var_Set_Cmp_Op>";
  public static final List<String> VAR_SET_CMP_OP_VALUE = Arrays.asList("in", "not in");

  // Set comparison operator
  public static final String SET_BIN_OP = "<Set_Set_Cmp_Op>";
  public static final List<String> SET_BIN_OP_VALUE = Arrays.asList("&");

  // Logic comparison operators
  public static final String LOGIC_OP = "<Logic_Op>";
  public static final List<String> LOGIC_OP_VALUE = Arrays.asList("or", "xor", "implies", "iff");

  // Logic expressions
  public static final String BOOLEAN_FIELD = "<Boolean_Field>";
  public static final String LOGIC_FROM_FIELD = "<Logic_From_Field>";
  public static final String LOGIC_EXPR = "<Logic_Expr>";
  public static final String LOGIC_CMP_EXPR = "<Logic_Cmp_Expr>";
  public static List<String> LOGIC_CMP_EXPR_VALUE = Arrays
          .asList("("+ LOGIC_FROM_FIELD + ") " + LOGIC_OP + " (" + LOGIC_EXPR + ")");

  // Numeric comparison operators
  public static final String NUMERIC_CMP_OP = "<Num_Cmp_Op>";
  public static final List<String> NUMERIC_CMP_OP_VALUE = Arrays.asList("=", "!=", ">", "<", ">=", "<=");

  // Binary numeric operators
  public static final String NUMERIC_BIN_OP = "<Num_Bin_Op>";
  public static final List<String> NUMERIC_BIN_OP_VALUE = Arrays.asList("+", "-", "*", "/", "%");

  // Numeric expressions
  public static final String INTEGER_ZERO = "<Integer_0>";
  public static final String INTEGER_TWO = "<Integer_2>";
  public static final String INTEGER_CONSTANT = "<Integer_Constant>";
  public static final List<String> INTEGER_CONSTANT_VALUE = Arrays.asList("0", "1");
  public static final String INTEGER_FROM_FIELD = "<Integer_From_Field>";
  public static final String INTEGER_SET = "<Integer_Set>";
  public static final String INTEGER_FIELD = "<Integer_Field>";
  public static final String INTEGER_FROM_SET_SIZE = "<Integer_From_Set_Size>";
  public static List<String> INTEGER_ZERO_VALUE = new LinkedList<>();
  public static List<String> INTEGER_TWO_VALUE = new LinkedList<>();
  public static final String INTEGER_EXPR = "<Integer_Expr>";
  public static List<String> INTEGER_EXPR_VALUE = new LinkedList<>();

  public static final String NUMERIC_CMP_EXPR = "<Num_Cmp_Expr>";
  public static List<String> NUMERIC_CMP_EXPR_VALUE = new LinkedList<>();
  public static final String INTEGER_CMP_EXPR_VALUE = get_special_identifier(JavaTypesUtil.INTEGER, 0) + " " + NUMERIC_CMP_OP + " " + INTEGER_EXPR;
  public static List<String> INTEGER_FROM_FIELD_VALUE = new LinkedList<>();

  // Membership expressions
  public static final String MEMBERSHIP_EXPR = "<Membership_Expr>";

  // Other constants
  public static final String QT_VAR_NAME = "n";
  public static final String NULL = "null";

  /**
   * Return the non-terminal symbol denoting a set of the given type
   */
  public static String get_set_symbol(String type_name) {
    return "<" + type_name + "_Set_Expr>";
  }

  /**
   * Return the non-terminal symbol denoting the body of a quantified expression of the given type
   */
  public static String get_qt_body_symbol(String type_name) {
    return "<" + type_name + "_Qt_Expr_Body>";
  }

  /**
   * Return the non-terminal symbol denoting a single label to build a set of the given type
   */
  public static String get_set_label_symbol(String type_name) {
    return "<" + type_name + "_Set_Label>";
  }

  /**
   * Return the non-terminal symbol denoting the labels to build a set of the given type
   */
  public static String get_set_labels_symbol(String type_name) {
    return "<" + type_name + "_Set_Labels>";
  }

  /**
   * Return the non-terminal symbol denoting a quantified object of the given type
   */
  public static String get_qt_obj_symbol(String type_name) {
    return "<" + type_name + "_Qt_Obj>";
  }

  /**
   * Return the non-terminal symbol denoting a quantified set of the given type
   */
  public static String get_qt_obj_set_symbol(String type_name) {
    return "<" + type_name + "_Set_Qt_Expr>";
  }

  /**
   * Return the non-terminal symbol denoting a quantified set of the given type computed from applying a variable
   */
  public static String get_qt_var_obj_set_symbol(String type_name) {
    return "<" + type_name + "_Var_Set_Qt_Expr>";
  }

  /**
   * Return the non-terminal symbol denoting a comparison of objects of a set of the given type
   */
  public static String get_qt_obj_cmp_symbol(String type_name) {
    return "<Qt_" + type_name + "_Obj_Cmp>";
  }

  /**
   * Return the non-terminal symbol denoting a comparison of objects of a set of the given type
   */
  public static String get_qt_obj_dest_cmp_symbol(String type_name, String dest_type) {
    return "<Qt_" + type_name + "_Obj_" + dest_type + "_Cmp>";
  }

  /**
   * Return the non-terminal symbol denoting a comparison of objects of a set of the given type
   */
  public static String get_symbol_for_type(String type_name) {
    String formatted_type = JavaTypesUtil.format_type(type_name);
    if (JavaTypesUtil.INTEGER.equals(formatted_type))
      formatted_type += "_Field";
    if (JavaTypesUtil.BOOLEAN.equals(formatted_type))
      formatted_type += "_Field";
    return "<" + formatted_type + ">";
  }

  /**
   * Return the special identifier for a variable of the given type, for instance, Integer_Variable
   */
  public static String get_special_identifier(String type_name, int n) {
    if (type_name==null || n < 0)
      throw new IllegalArgumentException("The type name can't be null and n can't be less than zero");
    return get_special_identifier_prefix(type_name) + "_" + n;
  }

  /**
   * Returns the prefix for the special identifiers for variables of the given type
   */
  public static String get_special_identifier_prefix(String type_name) {
    return type_name + "_Variable";
  }

  /**
   * Get membership symbol for type
   */
  public static String get_membership_symbol(String type) {
    if (type==null)
      throw new IllegalArgumentException("The type can't be null");
    return "<Membership_" + type + "_Set>";
  }

}