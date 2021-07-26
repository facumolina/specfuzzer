package grammar;

import grammar.symbols.*;
import utils.JavaTypesUtil;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class allows to create a base grammar for a CUT and provides methods for further refinement of the grammar.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarBuilder {

  // Keep track of the quantified sets
  private static Set<String> quantified_sets;
  private static Set<String> all_arguments_types;
  private static Set<String> all_fields_types;

  /**
   * Create a Grammar with the initial state
   */
  public static Map<String, List<String>> create(Class<?> cut) {
    // Start
    Map<String, List<String>> grammar = new HashMap<>();
    GrammarInitializer.initialize_main_symbols(grammar);
    all_fields_types = new HashSet<>();

    // Obtain all arguments types
    all_arguments_types = JavaTypesUtil.all_arguments_types(cut);

    // Quantified
    GrammarInitializer.initialize_quantified_expressions(grammar);
    quantified_sets = new HashSet<>();

    // Logic
    GrammarInitializer.initialize_logic_expressions(grammar);

    // Numeric
    GrammarInitializer.initialize_numeric_cmp_expressions(grammar);

    // Membership
    GrammarInitializer.initialize_membership_expressions(grammar);

    return grammar;
  }

  /**
   * Add field type
   */
  public static void add_field_type(String type) {
    if (type==null)
      throw new IllegalArgumentException("Type can't be null");
    all_fields_types.add(JavaTypesUtil.format_type(type));
  }

  /**
   * Add quantification option
   */
  private static void add_quantification_option(Map<String, List<String>> grammar,
      String set_symbol, String body_symbol) {
    if (quantified_sets.add(set_symbol)) {
      // First time, create the proper quantification options
      grammar.get(GrammarSymbols.QT_EXPR)
          .add(GrammarSymbols.QUANTIFIER + " " + ConstantSymbols.QT_VAR_NAME + " : " + set_symbol + " : " + body_symbol);
      //grammar.get(GrammarSymbols.QT_EXPR).add(GrammarSymbols.QUANTIFIER + " " + ConstantSymbols.QT_VAR_NAME + " : " + set_symbol + " : ("
      //    + body_symbol + ") " + GrammarSymbols.LOGIC_OP + " (" + body_symbol + ")");
    }
  }

  /**
   * Add the given value as an option for the symbol of the given grammar
   */
  public static void extend_grammar(Map<String, List<String>> grammar, String symbol,
      String value) {
    List<String> l = new LinkedList<>();
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
    curr_labels.forEach(label -> extend_grammar(grammar, labels_symbol, label));
    // Add pairs of labels
    for (int i=0; i < curr_labels.size() - 1; i++) {
      String fst = curr_labels.get(i);
      for (int j = i+1; j < curr_labels.size(); j++) {
        String snd = curr_labels.get(j);
        extend_grammar(grammar, labels_symbol, fst + " + " + snd);
        // When creating pairs, single labels are no longer considered.
        grammar.get(labels_symbol).remove(fst);
        grammar.get(labels_symbol).remove(snd);
      }
    }
  }

  /**
   * Get the comparison symbol for the given type
   */
  public static String get_cmp_symbol(String type_name) {
    if (JavaTypesUtil.is_numeric(type_name))
      return GrammarSymbols.NUMERIC_CMP_OP;
    else
      return GrammarSymbols.REF_OP;
  }

  /**
   * Add membership symbols to the given grammar
   */
  public static void add_membership_symbol(Map<String, List<String>> grammar, String type_name,
      String curr_expr, String final_label, String final_set_type) {
    String current_set_symbol = GrammarSymbols.get_set_symbol(type_name);
    String membership_expr_symbol = GrammarSymbols.get_membership_symbol(final_set_type);
    String var = GrammarSymbols.get_special_identifier(final_set_type, 0);
    if (JavaTypesUtil.INTEGER.equals(final_set_type)) {
      String int_set_symbol = GrammarSymbols.get_set_symbol(JavaTypesUtil.INTEGER);
      String membership_expr_value = var + " " + GrammarSymbols.VAR_SET_CMP_OP + " " + int_set_symbol;
      extend_grammar(grammar, membership_expr_symbol, membership_expr_value);
      extend_grammar(grammar, int_set_symbol, current_set_symbol + "." + final_label);
    } else {
      String membership_expr_value = var + " " + GrammarSymbols.VAR_SET_CMP_OP + " " + current_set_symbol + "." + final_label;
      extend_grammar(grammar, membership_expr_symbol, membership_expr_value);
    }
    extend_grammar(grammar, GrammarSymbols.MEMBERSHIP_EXPR, membership_expr_symbol);
  }

  /**
   * Add quantification symbols to the given grammar
   */
  public static void add_quantification_symbols(Map<String, List<String>> grammar, String type_name,
      String curr_expr, String label) {
    String current_set_symbol = GrammarSymbols.get_set_symbol(type_name);
    String current_set_labels_symbol = GrammarSymbols.get_set_labels_symbol(type_name);
    extend_grammar(grammar, current_set_symbol,
        curr_expr + ".*(" + current_set_labels_symbol + ")");
    extend_grammar(grammar, current_set_symbol,
        curr_expr + ".^(" + current_set_labels_symbol + ")");
    String current_set_label_symbol = GrammarSymbols.get_set_label_symbol(type_name);
    extend_grammar(grammar, current_set_label_symbol, label);
    extend_labels_set(grammar, current_set_label_symbol, current_set_labels_symbol);
    // Options for the quantified expressions
    String current_obj_cmp_symbol = GrammarSymbols.get_qt_obj_cmp_symbol(type_name);
    String current_obj_body_symbol = GrammarSymbols.get_qt_body_symbol(type_name);
    add_quantification_option(grammar, current_set_symbol, current_obj_body_symbol);
    extend_grammar(grammar, current_obj_body_symbol, current_obj_cmp_symbol);
    extend_grammar(grammar, IntegerSymbols.INTEGER_FROM_SET_SIZE, "#(" + current_set_symbol + ")");
    // Options for the quantified objects comparisons
    String current_qt_obj_symbol = GrammarSymbols.get_qt_obj_symbol(type_name);
    String qt_object_cmp_option = ConstantSymbols.QT_VAR_NAME + " " + GrammarSymbols.REF_OP + " " + current_qt_obj_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_object_cmp_option);
    String current_qt_obj_set_symbol = GrammarSymbols.get_qt_obj_set_symbol(type_name);
    String qt_var_set_cmp_option = ConstantSymbols.QT_VAR_NAME + " " + GrammarSymbols.VAR_SET_CMP_OP + " "
        + current_qt_obj_set_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_var_set_cmp_option);
    String current_qt_var_obj_set_symbol = GrammarSymbols.get_qt_var_obj_set_symbol(type_name);
    String qt_set_set_cmp_option = "(" + current_qt_var_obj_set_symbol + ") " + GrammarSymbols.SET_BIN_OP + " ("
        + current_qt_var_obj_set_symbol + ") " + GrammarSymbols.VAR_SET_CMP_OP + " empty";
    extend_grammar(grammar, current_obj_cmp_symbol, qt_set_set_cmp_option);
    // Options for the quantified objects
    extend_grammar(grammar, current_qt_obj_symbol, ConstantSymbols.QT_VAR_NAME + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol,
            ConstantSymbols.QT_VAR_NAME + "." + current_set_label_symbol + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol, ConstantSymbols.NULL);
    // Options for the quantified sets
    extend_grammar(grammar, current_qt_obj_set_symbol,
            ConstantSymbols.QT_VAR_NAME + ".^(" + current_set_labels_symbol + ")");
    extend_grammar(grammar, current_qt_var_obj_set_symbol,
            ConstantSymbols.QT_VAR_NAME + "." + current_set_label_symbol + ".*(" + current_set_labels_symbol + ")");
  }

  /**
   * Add special quantification symbols to the given grammar
   * These are called specials because they are symbols related to a quantification originated
   * from label that leads to a Collection.
   */
  public static void add_special_quantification_symbols(Map<String, List<String>> grammar,
      String type_name, String curr_expr) {
    String current_set_symbol = GrammarSymbols.get_set_symbol(type_name);
    String current_obj_body_symbol = GrammarSymbols.get_qt_body_symbol(type_name);
    add_quantification_option(grammar, current_set_symbol, current_obj_body_symbol);
    extend_grammar(grammar, current_set_symbol, curr_expr);
    extend_grammar(grammar, IntegerSymbols.INTEGER_FROM_SET_SIZE, "#(" + current_set_symbol + ")");
    if (JavaTypesUtil.is_integer(type_name)) {
      String numeric_cmp_symbol = ConstantSymbols.QT_VAR_NAME + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + IntegerSymbols.INTEGER_ZERO;
      extend_grammar(grammar, current_obj_body_symbol, numeric_cmp_symbol);
    } else {
      String current_obj_cmp_symbol = GrammarSymbols.get_qt_obj_cmp_symbol(type_name);
      extend_grammar(grammar, current_obj_body_symbol, current_obj_cmp_symbol);
      String current_qt_obj_symbol = GrammarSymbols.get_qt_obj_symbol(type_name);
      String qt_object_cmp_option = ConstantSymbols.QT_VAR_NAME + " " + GrammarSymbols.REF_OP + " " + current_qt_obj_symbol;
      extend_grammar(grammar, current_obj_cmp_symbol, qt_object_cmp_option);
      extend_grammar(grammar, current_qt_obj_symbol, ConstantSymbols.NULL);
    }
  }

  /**
   * Add quantification symbols to the given grammar
   */
  public static void add_quantification_over_field_symbols(Map<String, List<String>> grammar,
      String type_name, String curr_expr, String dest_type, String cyclic_label,
      String dest_label) {
    String current_obj_body_symbol = GrammarSymbols.get_qt_body_symbol(type_name);
    String current_set_label_symbol = GrammarSymbols.get_set_label_symbol(type_name);
    String formatted_dest_type = JavaTypesUtil.format_type(dest_type);
    String current_obj_dest_cmp_symbol = GrammarSymbols.get_qt_obj_dest_cmp_symbol(type_name, formatted_dest_type);
    extend_grammar(grammar, current_obj_body_symbol, current_obj_dest_cmp_symbol);
    // Options for the quantified object field comparison
    String cmp_symbol = get_cmp_symbol(formatted_dest_type);
    String qt_obj_field_option = ConstantSymbols.QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " "
        + ConstantSymbols.QT_VAR_NAME + "." + current_set_label_symbol + "." + dest_label;
    extend_grammar(grammar, current_obj_dest_cmp_symbol, qt_obj_field_option);
    if (JavaTypesUtil.BOOLEAN.equals(formatted_dest_type)) {
      // The expression n.field can be directly in the body of the quantification
      extend_grammar(grammar, current_obj_dest_cmp_symbol, ConstantSymbols.QT_VAR_NAME + "." + dest_label);
    }
    if (JavaTypesUtil.INTEGER.equals(formatted_dest_type)) {
      // The expression n.field is an integer, so allow the comparison with any given integer
      String integer_cmp_symbol = ConstantSymbols.QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " " + IntegerSymbols.INTEGER_ZERO;
      extend_grammar(grammar, current_obj_dest_cmp_symbol, integer_cmp_symbol);
    }
  }

  /**
   * Remove non expandable symbols
   */
  public static void remove_non_expandable(Map<String, List<String>> grammar) {
    remove_non_expandable_collection_vars(grammar);
    remove_non_expandable_from_integer(grammar);
    remove_non_expandable_from_long(grammar);
    remove_non_expandable_from_double(grammar);
    remove_non_expandable_from_logic(grammar);
    remove_non_expandable_from_quantification(grammar);
    remove_non_expandable_membership(grammar);
  }

  /**
   * Remove non-expandable symbols involving integers
   */
  protected static void remove_non_expandable_from_integer(Map<String, List<String>> grammar) {
    if (grammar.get(IntegerSymbols.INTEGER_FIELD).isEmpty()) {
      // There are no integer fields, so remove the symbol and all the other non-terminal symbols
      // mentioning the integer field symbol
      grammar.remove(IntegerSymbols.INTEGER_FIELD);
      grammar.get(IntegerSymbols.INTEGER_FROM_FIELD).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FIELD));
    }

    if (grammar.get(IntegerSymbols.INTEGER_FROM_SET_SIZE).isEmpty()) {
      // There are not sets for computing size
      grammar.remove(IntegerSymbols.INTEGER_FROM_SET_SIZE);
      grammar.get(IntegerSymbols.INTEGER_FROM_FIELD).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FROM_SET_SIZE));
    }

    if (grammar.get(IntegerSymbols.INTEGER_FROM_FIELD).isEmpty()) {
      // Integer from field symbol is empty, to remove it
      grammar.remove(IntegerSymbols.INTEGER_FROM_FIELD);
      grammar.get(IntegerSymbols.INTEGER_ZERO).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FROM_FIELD));
      grammar.get(IntegerSymbols.INTEGER_ONE).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FROM_FIELD));
      grammar.get(IntegerSymbols.INTEGER_TWO).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FROM_FIELD));
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(IntegerSymbols.INTEGER_FROM_FIELD));
    }

    if (!all_arguments_types.contains(JavaTypesUtil.INTEGER) && !all_fields_types.contains(JavaTypesUtil.INTEGER)) {
      // There are no arguments nor fields of type Integer, so the Integer_Variable option should be removed
      grammar.get(IntegerSymbols.INTEGER_ZERO).removeIf(x -> x.contains(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.INTEGER)));
      grammar.remove(IntegerSymbols.INTEGER_ONE).removeIf(x -> x.contains(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.INTEGER)));
      grammar.remove(IntegerSymbols.INTEGER_TWO).removeIf(x -> x.contains(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.INTEGER)));
      grammar.remove(IntegerSymbols.INTEGER_CMP_EXPR);
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(IntegerSymbols.INTEGER_CMP_EXPR));
      if (grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).isEmpty()) {
        grammar.remove(GrammarSymbols.NUMERIC_CMP_EXPR);
        grammar.get(GrammarSymbols.START_SYMBOL).removeIf(x -> x.contains(GrammarSymbols.NUMERIC_CMP_EXPR));
      }
    }
  }

  /**
   * Remove non-expandable symbols involving longs
   */
  protected static void remove_non_expandable_from_long(Map<String, List<String>> grammar) {
    if (grammar.get(LongSymbols.LONG_FIELD).isEmpty()) {
      // There are no long fields, so remove the symbol and all the other non-terminal symbols
      // mentioning the long field symbol
      grammar.remove(LongSymbols.LONG_FIELD);
      grammar.get(LongSymbols.LONG_FROM_FIELD).removeIf(x -> x.contains(LongSymbols.LONG_FIELD));
    }

    if (grammar.get(LongSymbols.LONG_FROM_FIELD).isEmpty()) {
      // Integer from field symbol is empty, to remove it
      grammar.remove(LongSymbols.LONG_FROM_FIELD);
      grammar.get(LongSymbols.LONG_ZERO).removeIf(x -> x.contains(LongSymbols.LONG_FROM_FIELD));
      grammar.get(LongSymbols.LONG_ONE).removeIf(x -> x.contains(LongSymbols.LONG_FROM_FIELD));
      grammar.get(LongSymbols.LONG_TWO).removeIf(x -> x.contains(LongSymbols.LONG_FROM_FIELD));
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(LongSymbols.LONG_FROM_FIELD));
    }

    if (!all_arguments_types.contains(JavaTypesUtil.LONG) && !all_fields_types.contains(JavaTypesUtil.LONG)) {
      // There are no arguments nor fields of type Integer, so the Integer_Variable option should be removed
      grammar.remove(LongSymbols.LONG_ZERO);
      grammar.remove(LongSymbols.LONG_ONE);
      grammar.remove(LongSymbols.LONG_TWO);
      grammar.remove(LongSymbols.LONG_CMP_EXPR);
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(LongSymbols.LONG_CMP_EXPR));
      if (grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).isEmpty()) {
        grammar.remove(GrammarSymbols.NUMERIC_CMP_EXPR);
        grammar.get(GrammarSymbols.START_SYMBOL).removeIf(x -> x.contains(GrammarSymbols.NUMERIC_CMP_EXPR));
      }
    }
  }

  /**
   * Remove non-expandable symbols involving doubles
   */
  protected static void remove_non_expandable_from_double(Map<String, List<String>> grammar) {
    if (grammar.get(DoubleSymbols.DOUBLE_FIELD).isEmpty()) {
      // There are no integer fields, so remove the symbol and all the other non-terminal symbols
      // mentioning the integer field symbol
      grammar.remove(DoubleSymbols.DOUBLE_FIELD);
      grammar.get(DoubleSymbols.DOUBLE_FROM_FIELD).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_FIELD));
    }

    if (grammar.get(DoubleSymbols.DOUBLE_FROM_FIELD).isEmpty()) {
      // Integer from field symbol is empty, to remove it
      grammar.remove(DoubleSymbols.DOUBLE_FROM_FIELD);
      grammar.get(DoubleSymbols.DOUBLE_ZERO).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_FROM_FIELD));
      grammar.get(DoubleSymbols.DOUBLE_ONE).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_FROM_FIELD));
      grammar.get(DoubleSymbols.DOUBLE_TWO).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_FROM_FIELD));
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_FROM_FIELD));
    }

    if (!all_arguments_types.contains(JavaTypesUtil.DOUBLE) && !all_fields_types.contains(JavaTypesUtil.DOUBLE)) {
      // There are no arguments nor fields of type Integer, so the Integer_Variable option should be removed
      grammar.remove(DoubleSymbols.DOUBLE_ZERO);
      grammar.remove(DoubleSymbols.DOUBLE_ONE);
      grammar.remove(DoubleSymbols.DOUBLE_TWO);
      grammar.remove(DoubleSymbols.DOUBLE_CMP_EXPR);
      grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).removeIf(x -> x.contains(DoubleSymbols.DOUBLE_CMP_EXPR));
      if (grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).isEmpty()) {
        grammar.remove(GrammarSymbols.NUMERIC_CMP_EXPR);
        grammar.get(GrammarSymbols.START_SYMBOL).removeIf(x -> x.contains(GrammarSymbols.NUMERIC_CMP_EXPR));
      }
    }
  }

  /**
   * Remove non-expandable symbols involving logic
   */
  protected static void remove_non_expandable_from_logic(Map<String, List<String>> grammar) {
    if (grammar.get(LogicSymbols.BOOLEAN_FIELD).isEmpty()) {
      grammar.remove(LogicSymbols.BOOLEAN_FIELD);
      grammar.get(LogicSymbols.LOGIC_FROM_FIELD).removeIf(x -> x .contains(LogicSymbols.BOOLEAN_FIELD));
    }

    if (grammar.get(LogicSymbols.LOGIC_FROM_FIELD).isEmpty()) {
      // There are no boolean fields
      grammar.remove(LogicSymbols.LOGIC_FROM_FIELD);
      grammar.get(LogicSymbols.BOOLEAN_ZERO).removeIf(x -> x.contains(LogicSymbols.LOGIC_FROM_FIELD));
      grammar.get(LogicSymbols.BOOLEAN_ONE).removeIf(x -> x.contains(LogicSymbols.LOGIC_FROM_FIELD));
      grammar.get(LogicSymbols.BOOLEAN_TWO).removeIf(x -> x.contains(LogicSymbols.LOGIC_FROM_FIELD));
    }

    if (!all_arguments_types.contains(JavaTypesUtil.BOOLEAN) && !all_fields_types.contains(JavaTypesUtil.BOOLEAN)) {
      // There are no arguments nor fields of type Boolean, so the Boolean_Variable option should be removed
      grammar.remove(LogicSymbols.BOOLEAN_ZERO);
      grammar.remove(LogicSymbols.BOOLEAN_ONE);
      grammar.remove(LogicSymbols.BOOLEAN_TWO);
      grammar.remove(LogicSymbols.LOGIC_CMP_EXPR);
      grammar.remove(LogicSymbols.LOGIC_EXPR);
      grammar.get(GrammarSymbols.START_SYMBOL).removeIf(x -> x.contains(LogicSymbols.LOGIC_CMP_EXPR));
    }

  }

  /**
   * Remove non-expandable symbols involving quantifications
   */
  protected static void remove_non_expandable_from_quantification(Map<String, List<String>> grammar) {
    if (grammar.get(GrammarSymbols.QT_EXPR).isEmpty()) {
      // There are no expressions to quantify
      grammar.remove(GrammarSymbols.QT_EXPR);
      grammar.remove(GrammarSymbols.QUANTIFIER);
      grammar.get(GrammarSymbols.START_SYMBOL).remove(GrammarSymbols.QT_EXPR);
      if (grammar.get(LogicSymbols.LOGIC_EXPR) != null && !grammar.get(LogicSymbols.LOGIC_EXPR).isEmpty())
        grammar.get(LogicSymbols.LOGIC_EXPR).remove(GrammarSymbols.QT_EXPR);
    }
  }

  /**
   * Remove non-expandable symbol involving membership
   */
  protected static void remove_non_expandable_membership(Map<String, List<String>> grammar) {
    if (grammar.get(GrammarSymbols.MEMBERSHIP_EXPR).isEmpty()) {
      grammar.remove(GrammarSymbols.MEMBERSHIP_EXPR);
      grammar.get(GrammarSymbols.START_SYMBOL).remove(GrammarSymbols.MEMBERSHIP_EXPR);
    }
  }

  /**
   * Remove non-expandable symbols involving collection variables
   */
  protected static void remove_non_expandable_collection_vars(Map<String, List<String>> grammar) {
    String integer_set_type = JavaTypesUtil.format_set_of_type(JavaTypesUtil.INTEGER);
    String integer_set_symbol = GrammarSymbols.get_set_symbol(JavaTypesUtil.INTEGER);
    if (!all_arguments_types.contains(integer_set_type)) {
      // There are no arguments of type Integer, so collections integers should not be considered
      String symbol_to_remove = GrammarSymbols.get_special_identifier_set(JavaTypesUtil.INTEGER, 0);
      grammar.get(integer_set_symbol).removeIf(x -> x.contains(symbol_to_remove));
      if (grammar.get(integer_set_symbol).isEmpty()) {
        grammar.remove(integer_set_symbol);
        String integer_membership_symbol = GrammarSymbols.get_membership_symbol(JavaTypesUtil.INTEGER);
        grammar.get(integer_membership_symbol).removeIf(x -> x.contains(integer_set_symbol));
        if (grammar.get(integer_membership_symbol).isEmpty()) {
          grammar.remove(integer_membership_symbol);
          grammar.get(GrammarSymbols.MEMBERSHIP_EXPR).removeIf(x -> x.contains(integer_membership_symbol));
        }
      }
    }
    if (!grammar.containsKey(integer_set_symbol)) {
      grammar.get(IntegerSymbols.INTEGER_FROM_SET_SIZE).removeIf(x -> x.contains(integer_set_symbol));
    }
  }

  /**
   * Return the number of specifications that can be generated from the given grammar
   */
  public static int calculate_potential_specs(Map<String, List<String>> grammar) {
    return calculate_potential_specs(grammar, GrammarSymbols.START_SYMBOL);
  }

  /**
   * Return the number of specifications that can be generated from the given grammar and symbol
   */
  private static int calculate_potential_specs(Map<String, List<String>> grammar, String symbol) {
    int specs = 0;
    List<String> expansion = grammar.get(symbol);
    for (String exp : expansion) {
      List<String> non_terminals = nonterminals(exp);
      int non_term_count = 1;
      for (String non_term : non_terminals) {
        non_term_count *= calculate_potential_specs(grammar, non_term);
      }
      specs += non_term_count;
    }
    return specs;
  }

  /**
   * Get the amount of non terminals symbols of the given symbol
   */
  private static List<String> nonterminals(String symbol) {
    String re_nonterminal = "(<[^<> ]*>)";
    List<String> matches = new LinkedList<String>();
    Matcher m = Pattern.compile("(?=(" + re_nonterminal + "))").matcher(symbol);
    while (m.find()) {
      matches.add(m.group(1));
    }
    return matches;
  }

}
