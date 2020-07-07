package grammar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class contains the basic part of the grammars that will later be extended when analyzing a
 * particular CUT
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarBuilder {

  // Constant symbols that will be part of all the grammars
  public static final String START_SYMBOL = "<start>";

  // Quantifications
  public static final String QT_EXPR = "<Quantified_Expr>";
  public static final String QUANTIFIER = "<Quantifier>";
  public static final String QT_EXPR_BODY = "<Quantified_Expr_Body>";
  public static final List<String> QUANTIFIER_VALUE = Arrays.asList("all", "some");

  // Reference comparisons
  public static final String REF_OP = "<Reference_Op>";
  public static final List<String> REF_OP_VALUE = Arrays.asList("=", "!=");

  // Reference and Set comparison
  public static final String VAR_SET_CMP_OP = "<Var_Set_Cmp_Op>";
  public static final List<String> VAR_SET_CMP_OP_VALUE = Arrays.asList("in", "not in");

  // Numeric operators
  public static final String NUMERIC_CMP_OP = "<Num_Cmp_Op>";
  public static final List<String> NUMERIC_CMP_OP_VALUE = Arrays.asList("=", "!=", ">", "<", ">=",
      "<=");

  // Logic operators
  public static final String LOGIC_OP = "<Logic_Op>";
  public static final List<String> LOGIC_OP_VALUE = Arrays.asList("implies");

  // Binary numeric operators
  public static final String NUMERIC_BIN_OP = "<Num_Bin_Op>";
  public static final List<String> NUMERIC_BIN_OP_VALUE = Arrays.asList("+", "-");

  // Numeric expressions
  public static final String INTEGER = "<Integer>";
  public static final String INTEGER_CONSTANT = "<Integer_Constant>";
  public static final List<String> INTEGER_CONSTANT_VALUE = Arrays.asList("0", "1");
  public static final String INTEGER_FIELD = "<Integer_Field>";
  public static final String INTEGER_SET_SIZE = "<Integer_Set_Size>";
  public static List<String> INTEGER_VALUE = Arrays.asList(INTEGER_CONSTANT, INTEGER_SET_SIZE,
      INTEGER_FIELD);
  public static final String INTEGER_EXPR = "<Integer_Expr>";
  public static final List<String> INTEGER_EXPR_VALUE = Arrays.asList(INTEGER,
      INTEGER_FIELD + " " + NUMERIC_BIN_OP + " " + INTEGER);

  public static final String NUMERIC_CMP_EXPR = "<Num_Cmp_Expr>";
  public static List<String> NUMERIC_CMP_EXPR_VALUE = Arrays
      .asList(INTEGER_SET_SIZE + " " + NUMERIC_CMP_OP + " " + INTEGER_EXPR);

  // Other constants
  public static final String QT_VAR_NAME = "n";
  public static final String NULL = "null";

  // Keep track of the quantified sets
  private static Set<String> quantified_sets;

  /**
   * Create a Grammar with the initial state
   */
  public static Map<String, List<String>> create() {
    Map<String, List<String>> grammar = new HashMap<String, List<String>>();
    grammar.put(START_SYMBOL, new LinkedList<String>());
    grammar.get(START_SYMBOL).add(QT_EXPR);
    grammar.get(START_SYMBOL).add(NUMERIC_CMP_EXPR);
    grammar.put(QT_EXPR, new LinkedList<String>());
    grammar.put(QUANTIFIER, QUANTIFIER_VALUE);
    grammar.put(REF_OP, REF_OP_VALUE);
    grammar.put(VAR_SET_CMP_OP, VAR_SET_CMP_OP_VALUE);
    grammar.put(NUMERIC_CMP_EXPR, NUMERIC_CMP_EXPR_VALUE);
    grammar.put(NUMERIC_CMP_OP, NUMERIC_CMP_OP_VALUE);
    grammar.put(NUMERIC_BIN_OP, NUMERIC_BIN_OP_VALUE);
    grammar.put(LOGIC_OP, LOGIC_OP_VALUE);
    grammar.put(INTEGER_EXPR, INTEGER_EXPR_VALUE);
    grammar.put(INTEGER, INTEGER_VALUE);
    grammar.put(INTEGER_CONSTANT, INTEGER_CONSTANT_VALUE);
    grammar.put(INTEGER_FIELD, new LinkedList<String>());
    grammar.put(INTEGER_SET_SIZE, new LinkedList<String>());
    quantified_sets = new HashSet<String>();
    return grammar;
  }

  /**
   * Return the non-terminal symbol denoting a set of the given type
   */
  public static String get_set_symbol(String type_name) {
    return "<" + type_name + "_Set_Expr>";
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
    String formatted_type = TypesUtil.format_type(type_name);
    if (TypesUtil.INTEGER.equals(formatted_type))
      formatted_type += "_Field";
    return "<" + formatted_type + ">";
  }

  /**
   * Add quantification option
   */
  public static void add_quantification_option(Map<String, List<String>> grammar,
      String set_symbol) {
    if (quantified_sets.add(set_symbol)) {
      // First time, create the proper quantification options
      grammar.get(QT_EXPR)
          .add(QUANTIFIER + " " + QT_VAR_NAME + " : " + set_symbol + " : " + QT_EXPR_BODY);
      grammar.get(QT_EXPR).add(QUANTIFIER + " " + QT_VAR_NAME + " : " + set_symbol + " : "
          + QT_EXPR_BODY + " " + LOGIC_OP + " " + QT_EXPR_BODY);
    }
    if (quantified_sets.size() > 1) {
      throw new IllegalStateException(
          "At this time, having more than one quantified set option may lead to errors in the produced Grammar. Needs to be analyzed");
    }
  }

  /**
   * Add the given value as an option for the symbol of the given grammar
   */
  public static void extend_grammar(Map<String, List<String>> grammar, String symbol,
      String value) {
    List<String> l = new LinkedList<String>();
    l.add(value);
    if (!grammar.containsKey(symbol)) {
      grammar.put(symbol, l);
    } else {
      if (!grammar.get(symbol).contains(value))
        grammar.get(symbol).addAll(l);
    }
  }

  /**
   * Allow to create sets using more than one label if necessary
   */
  public static void extend_labels_set(Map<String, List<String>> grammar, String label_symbol,
      String labels_symbol) {
    if (grammar.get(label_symbol).size() > 1) {
      String additional_option = label_symbol + " + " + label_symbol;
      extend_grammar(grammar, labels_symbol, additional_option);
    }
  }

  /**
   * Get the comparison symbol for the given type
   */
  public static String get_cmp_symbol(String type_name) {
    if (TypesUtil.is_numeric(type_name))
      return NUMERIC_CMP_OP;
    else
      return REF_OP;
  }

  /**
   * Add quantification symbols to the given grammar
   */
  public static void add_quantification_symbols(Map<String, List<String>> grammar, String type_name,
      String curr_expr, String label) {
    String current_set_symbol = get_set_symbol(type_name);
    String current_set_labels_symbol = get_set_labels_symbol(type_name);
    extend_grammar(grammar, current_set_symbol,
        curr_expr + ".*(" + current_set_labels_symbol + ")");
    extend_grammar(grammar, current_set_symbol,
        curr_expr + ".^(" + current_set_labels_symbol + ")");
    String current_set_label_symbol = get_set_label_symbol(type_name);
    extend_grammar(grammar, current_set_labels_symbol, current_set_label_symbol);
    extend_grammar(grammar, current_set_label_symbol, label);
    extend_labels_set(grammar, current_set_label_symbol, current_set_labels_symbol);
    // Options for the quantified expressions
    String current_obj_cmp_symbol = get_qt_obj_cmp_symbol(type_name);
    add_quantification_option(grammar, current_set_symbol);
    extend_grammar(grammar, QT_EXPR_BODY, current_obj_cmp_symbol);
    extend_grammar(grammar, INTEGER_SET_SIZE, "#(" + current_set_symbol + ")");
    // Options for the quantified objects comparisons
    String current_qt_obj_symbol = get_qt_obj_symbol(type_name);
    String qt_object_cmp_option = QT_VAR_NAME + " " + REF_OP + " " + current_qt_obj_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_object_cmp_option);
    String current_qt_obj_set_symbol = get_qt_obj_set_symbol(type_name);
    String qt_var_set_cmp_option = QT_VAR_NAME + " " + VAR_SET_CMP_OP + " "
        + current_qt_obj_set_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_var_set_cmp_option);
    // Options for the quantified objects
    extend_grammar(grammar, current_qt_obj_symbol, QT_VAR_NAME + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol,
        QT_VAR_NAME + "." + current_set_label_symbol + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol, NULL);
    // Options for the quantified sets
    extend_grammar(grammar, current_qt_obj_set_symbol,
        QT_VAR_NAME + ".*(" + current_set_labels_symbol + ")");
    extend_grammar(grammar, current_qt_obj_set_symbol,
        QT_VAR_NAME + ".^(" + current_set_labels_symbol + ")");
  }

  /**
   * Add quantification symbols to the given grammar
   */
  public static void add_quantification_over_field_symbols(Map<String, List<String>> grammar,
      String type_name, String curr_expr, String dest_type, String cyclic_label,
      String dest_label) {
    String current_set_label_symbol = get_set_label_symbol(type_name);
    String formatted_dest_type = TypesUtil.format_type(dest_type);
    String current_obj_dest_cmp_symbol = get_qt_obj_dest_cmp_symbol(type_name, formatted_dest_type);
    extend_grammar(grammar, QT_EXPR_BODY, current_obj_dest_cmp_symbol);
    // Options for the quantified object field comparison
    String cmp_symbol = get_cmp_symbol(formatted_dest_type);
    String qt_obj_field_option = QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " "
        + QT_VAR_NAME + "." + current_set_label_symbol + "." + dest_label;
    extend_grammar(grammar, current_obj_dest_cmp_symbol, qt_obj_field_option);
    if (TypesUtil.BOOLEAN.equals(formatted_dest_type)) {
      // The expression n.field can be directly in the body of the quantification
      extend_grammar(grammar, current_obj_dest_cmp_symbol, QT_VAR_NAME + "." + dest_label);
    }
  }

  /**
   * Add the given option to the integer symbol
   */
  public static void add_integer_option(Map<String, List<String>> grammar, String option) {
    extend_grammar(grammar, INTEGER, option);
  }

}
