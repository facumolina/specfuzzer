package grammar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
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
  public static final String INTEGER_FIELD = "<Integer_Field>";
  public static final String INTEGER_SET_SIZE = "<Integer_Set_Size>";
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

  // Keep track of the quantified sets
  private static Set<String> quantified_sets;

  /**
   * Create a Grammar with the initial state
   */
  public static Map<String, List<String>> create() {
    // Start
    Map<String, List<String>> grammar = new HashMap<String, List<String>>();
    grammar.put(START_SYMBOL, new LinkedList<String>());
    grammar.get(START_SYMBOL).add(QT_EXPR);
    grammar.get(START_SYMBOL).add(NUMERIC_CMP_EXPR);
    grammar.get(START_SYMBOL).add(LOGIC_CMP_EXPR);

    // Quantified
    grammar.put(QT_EXPR, new LinkedList<String>());
    grammar.put(QUANTIFIER, QUANTIFIER_VALUE);
    grammar.put(REF_OP, REF_OP_VALUE);
    grammar.put(VAR_SET_CMP_OP, VAR_SET_CMP_OP_VALUE);
    quantified_sets = new HashSet<String>();

    // Logic
    grammar.put(LOGIC_OP, LOGIC_OP_VALUE);
    grammar.put(LOGIC_EXPR,new LinkedList<String>());
    grammar.get(LOGIC_EXPR).add(QT_EXPR);
    grammar.get(LOGIC_EXPR).add(NUMERIC_CMP_EXPR);
    //grammar.get(LOGIC_EXPR).add(LOGIC_FROM_FIELD);
    grammar.put(LOGIC_CMP_EXPR,LOGIC_CMP_EXPR_VALUE);
    grammar.put(LOGIC_FROM_FIELD,new LinkedList<String>());
    grammar.get(LOGIC_FROM_FIELD).add(BOOLEAN_FIELD);
    grammar.put(BOOLEAN_FIELD, new LinkedList<String>());

    // Numeric
    grammar.put(NUMERIC_CMP_EXPR, NUMERIC_CMP_EXPR_VALUE);
    grammar.put(NUMERIC_CMP_OP, NUMERIC_CMP_OP_VALUE);
    INTEGER_FROM_FIELD_VALUE.add(INTEGER_FIELD);
    INTEGER_FROM_FIELD_VALUE.add(INTEGER_SET_SIZE);
    grammar.put(INTEGER_FROM_FIELD, INTEGER_FROM_FIELD_VALUE);
    grammar.put(NUMERIC_BIN_OP, NUMERIC_BIN_OP_VALUE);
    INTEGER_EXPR_VALUE.add(INTEGER);
    INTEGER_EXPR_VALUE.add(INTEGER_FROM_FIELD + " " + NUMERIC_BIN_OP + " " + INTEGER);
    grammar.put(INTEGER_EXPR, INTEGER_EXPR_VALUE);
    INTEGER_VALUE.add(INTEGER_CONSTANT);
    INTEGER_VALUE.add(INTEGER_FROM_FIELD);
    grammar.put(INTEGER, INTEGER_VALUE);
    grammar.put(INTEGER_CONSTANT, INTEGER_CONSTANT_VALUE);
    grammar.put(INTEGER_FIELD, new LinkedList<String>());
    grammar.put(INTEGER_SET_SIZE, new LinkedList<String>());

    return grammar;
  }

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
    String formatted_type = TypesUtil.format_type(type_name);
    if (TypesUtil.INTEGER.equals(formatted_type))
      formatted_type += "_Field";
    if (TypesUtil.BOOLEAN.equals(formatted_type))
      formatted_type += "_Field";
    return "<" + formatted_type + ">";
  }

  /**
   * Add quantification option
   */
  private static void add_quantification_option(Map<String, List<String>> grammar,
      String set_symbol, String body_symbol) {
    if (quantified_sets.add(set_symbol)) {
      // First time, create the proper quantification options
      grammar.get(QT_EXPR)
          .add(QUANTIFIER + " " + QT_VAR_NAME + " : " + set_symbol + " : " + body_symbol);
      grammar.get(QT_EXPR).add(QUANTIFIER + " " + QT_VAR_NAME + " : " + set_symbol + " : ("
          + body_symbol + ") " + LOGIC_OP + " (" + body_symbol + ")");
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
    // Add single labels
    List<String> curr_labels = grammar.get(label_symbol);
    curr_labels.forEach(label -> {
      extend_grammar(grammar, labels_symbol, label);
    });
    // Add pairs of labels
    for (int i=0; i < curr_labels.size() - 1; i++) {
      String fst = curr_labels.get(i);
      for (int j = i+1; j < curr_labels.size(); j++) {
        String snd = curr_labels.get(j);
        extend_grammar(grammar, labels_symbol, fst + " + " + snd);
      }
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
    extend_grammar(grammar, current_set_label_symbol, label);
    extend_labels_set(grammar, current_set_label_symbol, current_set_labels_symbol);
    // Options for the quantified expressions
    String current_obj_cmp_symbol = get_qt_obj_cmp_symbol(type_name);
    String current_obj_body_symbol = get_qt_body_symbol(type_name);
    add_quantification_option(grammar, current_set_symbol, current_obj_body_symbol);
    extend_grammar(grammar, current_obj_body_symbol, current_obj_cmp_symbol);
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
  public static void add_special_quantification_symbols(Map<String, List<String>> grammar,
      String type_name, String curr_expr) {
    String current_set_symbol = get_set_symbol(type_name);
    String current_obj_body_symbol = get_qt_body_symbol(type_name);
    add_quantification_option(grammar, current_set_symbol, current_obj_body_symbol);
    extend_grammar(grammar, current_set_symbol, curr_expr);
    extend_grammar(grammar, INTEGER_SET_SIZE, "#(" + current_set_symbol + ")");
    if (TypesUtil.is_integer(type_name)) {
      String numeric_cmp_symbol = QT_VAR_NAME + " " + NUMERIC_CMP_OP + " " + INTEGER_EXPR;
      extend_grammar(grammar, current_obj_body_symbol, numeric_cmp_symbol);
    } else {
      String current_obj_cmp_symbol = get_qt_obj_cmp_symbol(type_name);
      extend_grammar(grammar, current_obj_body_symbol, current_obj_cmp_symbol);
    }
  }

  /**
   * Add quantification symbols to the given grammar
   */
  public static void add_quantification_over_field_symbols(Map<String, List<String>> grammar,
      String type_name, String curr_expr, String dest_type, String cyclic_label,
      String dest_label) {
    String current_obj_body_symbol = get_qt_body_symbol(type_name);
    String current_set_label_symbol = get_set_label_symbol(type_name);
    String formatted_dest_type = TypesUtil.format_type(dest_type);
    String current_obj_dest_cmp_symbol = get_qt_obj_dest_cmp_symbol(type_name, formatted_dest_type);
    extend_grammar(grammar, current_obj_body_symbol, current_obj_dest_cmp_symbol);
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

  /**
   * Remove non expandable symbols
   */
  public static void remove_non_expandable(Map<String, List<String>> grammar) {
    if (grammar.get(INTEGER_FIELD).isEmpty()) {
      // There are no integer fields, so remove the symbol and all the other non-terminal symbols
      // mentioning the integer field symbol
      grammar.remove(INTEGER_FIELD);
      grammar.get(INTEGER_EXPR).removeIf(x -> x.contains(INTEGER_FIELD));
      grammar.get(INTEGER_FROM_FIELD).removeIf(x -> x.contains(INTEGER_FIELD));
      grammar.get(INTEGER).removeIf(x -> x.contains(INTEGER_FIELD));
    }

    if (grammar.get(INTEGER_SET_SIZE).isEmpty()) {
      // There are not sets for computing size
      grammar.remove(INTEGER_SET_SIZE);
      grammar.get(INTEGER_FROM_FIELD).removeIf(x -> x.contains(INTEGER_SET_SIZE));
    }

    if (grammar.get(BOOLEAN_FIELD).isEmpty()) {
      grammar.remove(BOOLEAN_FIELD);
      grammar.get(LOGIC_FROM_FIELD).removeIf(x -> x .contains(BOOLEAN_FIELD));
    }

    if (grammar.get(LOGIC_FROM_FIELD).isEmpty()) {
      // There are no boolean fields
      grammar.remove(LOGIC_FROM_FIELD);
      grammar.remove(LOGIC_CMP_EXPR);
      grammar.remove(LOGIC_EXPR);
      grammar.get(START_SYMBOL).removeIf(x -> x.contains(LOGIC_CMP_EXPR));
    }

    if (grammar.get(QT_EXPR).isEmpty()) {
      // There are no expressions to quantify
      grammar.remove(QT_EXPR);
      grammar.remove(QUANTIFIER);
      grammar.get(START_SYMBOL).remove(QT_EXPR);
      if (!grammar.get(LOGIC_EXPR).isEmpty())
        grammar.get(LOGIC_EXPR).remove(QT_EXPR);
    }

  }
}
