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
  //public static final List<String> QUANTIFIER_VALUE = Arrays.asList("all", "some", "no", "one", "lone");

  // Reference comparisons
  public static final String REF_OP = "<Reference_Op>";
  public static final List<String> REF_OP_VALUE = Arrays.asList("=", "!=");

  // Reference and Set comparison
  public static final String VAR_SET_CMP_OP = "<Var_Set_Cmp_Op>";
  public static final List<String> VAR_SET_CMP_OP_VALUE = Arrays.asList("in", "not in");

  // Logic comparison operators
  public static final String LOGIC_OP = "<Logic_Op>";
  public static final List<String> LOGIC_OP_VALUE = Arrays.asList("or", "implies", "iff");

  // Logic expressions
  public static final String BOOLEAN_FIELD = "<Boolean_Field>";
  public static final String LOGIC_FROM_FIELD = "<Logic_From_Field>";
  public static final String LOGIC_EXPR = "<Logic_Expr>";
  public static final String LOGIC_CMP_EXPR = "<Logic_Cmp_Expr>";
  public static List<String> LOGIC_CMP_EXPR_VALUE = Arrays
          .asList("("+ LOGIC_FROM_FIELD + ") " + LOGIC_OP + " (" + LOGIC_EXPR + ")");

  // Numeric comparison operators
  public static final String NUMERIC_CMP_OP = "<Num_Cmp_Op>";
  public static final List<String> NUMERIC_CMP_OP_VALUE = Arrays.asList("=", "!=", ">", "<", ">=",
          "<=");

  // Binary numeric operators
  public static final String NUMERIC_BIN_OP = "<Num_Bin_Op>";
  public static final List<String> NUMERIC_BIN_OP_VALUE = Arrays.asList("+", "-");

  // Numeric expressions
  public static final String INTEGER = "<Integer>";
  public static final String INTEGER_CONSTANT = "<Integer_Constant>";
  public static final List<String> INTEGER_CONSTANT_VALUE = Arrays.asList("0", "1");
  public static final String INTEGER_FROM_FIELD = "<Integer_From_Field>";
  public static final String INTEGER_SET = "<Integer_Set>";
  public static final String INTEGER_FIELD = "<Integer_Field>";
  public static final String INTEGER_FROM_SET_SIZE = "<Integer_From_Set_Size>";
  public static List<String> INTEGER_VALUE = new LinkedList<String>();
  public static final String INTEGER_EXPR = "<Integer_Expr>";
  public static List<String> INTEGER_EXPR_VALUE = new LinkedList<String>();

  public static final String NUMERIC_CMP_EXPR = "<Num_Cmp_Expr>";
  public static List<String> NUMERIC_CMP_EXPR_VALUE = Arrays
          .asList(INTEGER_FROM_FIELD + " " + NUMERIC_CMP_OP + " " + INTEGER_EXPR);

  public static List<String> INTEGER_FROM_FIELD_VALUE = new LinkedList<String>();

  // Other constants
  public static final String QT_VAR_NAME = "n";
  public static final String NULL = "null";

  // Specific symbols involving more than one variable
  public static final String MEMBERSHIP_INTEGER_SET = "<Membership_Integer_Set>";
  public static final List<String> MEMBERSHIP_INTEGER_SET_VALUE = Arrays.
          asList(INTEGER + " " + VAR_SET_CMP_OP_VALUE + " " + INTEGER_SET);

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
  public static String get_special_identifier(String type_name) {
    if (type_name==null)
      throw new IllegalArgumentException("The type name can't be null");
    return type_name + "_Variable";
  }

}