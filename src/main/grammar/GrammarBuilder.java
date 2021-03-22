package grammar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains the basic part of the grammars that will later be extended when analyzing a
 * particular CUT
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarBuilder {

  // Keep track of the quantified sets
  private static Set<String> quantified_sets;
  private static Set<String> all_arguments_types;
  /**
   * Create a Grammar with the initial state
   */
  public static Map<String, List<String>> create(Class<?> cut) {
    // Start
    Map<String, List<String>> grammar = new HashMap<String, List<String>>();
    grammar.put(GrammarSymbols.START_SYMBOL, new LinkedList<String>());
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.QT_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.NUMERIC_CMP_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.LOGIC_CMP_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.MEMBERSHIP_EXPR);

    // Obtain all arguments types
    all_arguments_types = JavaTypesUtil.all_arguments_types(cut);

    // Quantified
    grammar.put(GrammarSymbols.QT_EXPR, new LinkedList<String>());
    grammar.put(GrammarSymbols.QUANTIFIER, GrammarSymbols.QUANTIFIER_VALUE);
    grammar.put(GrammarSymbols.REF_OP, GrammarSymbols.REF_OP_VALUE);
    grammar.put(GrammarSymbols.VAR_SET_CMP_OP, GrammarSymbols.VAR_SET_CMP_OP_VALUE);
    quantified_sets = new HashSet<String>();

    // Logic
    grammar.put(GrammarSymbols.LOGIC_OP, GrammarSymbols.LOGIC_OP_VALUE);
    grammar.put(GrammarSymbols.LOGIC_EXPR,new LinkedList<String>());
    grammar.get(GrammarSymbols.LOGIC_EXPR).add(GrammarSymbols.QT_EXPR);
    grammar.get(GrammarSymbols.LOGIC_EXPR).add(GrammarSymbols.NUMERIC_CMP_EXPR);
    //grammar.get(LOGIC_EXPR).add(LOGIC_FROM_FIELD);
    grammar.put(GrammarSymbols.LOGIC_CMP_EXPR,GrammarSymbols.LOGIC_CMP_EXPR_VALUE);
    grammar.put(GrammarSymbols.LOGIC_FROM_FIELD,new LinkedList<String>());
    grammar.get(GrammarSymbols.LOGIC_FROM_FIELD).add(GrammarSymbols.BOOLEAN_FIELD);
    grammar.put(GrammarSymbols.BOOLEAN_FIELD, new LinkedList<String>());

    // Numeric
    grammar.put(GrammarSymbols.NUMERIC_CMP_EXPR, GrammarSymbols.NUMERIC_CMP_EXPR_VALUE);
    grammar.put(GrammarSymbols.NUMERIC_CMP_OP, GrammarSymbols.NUMERIC_CMP_OP_VALUE);
    GrammarSymbols.INTEGER_FROM_FIELD_VALUE.add(GrammarSymbols.INTEGER_FIELD);
    GrammarSymbols.INTEGER_FROM_FIELD_VALUE.add(GrammarSymbols.INTEGER_FROM_SET_SIZE);
    grammar.put(GrammarSymbols.INTEGER_FROM_FIELD, GrammarSymbols.INTEGER_FROM_FIELD_VALUE);
    grammar.put(GrammarSymbols.NUMERIC_BIN_OP, GrammarSymbols.NUMERIC_BIN_OP_VALUE);
    GrammarSymbols.INTEGER_EXPR_VALUE.add(GrammarSymbols.INTEGER);
    GrammarSymbols.INTEGER_EXPR_VALUE.add(GrammarSymbols.INTEGER_FROM_FIELD + " " + GrammarSymbols.NUMERIC_BIN_OP + " " + GrammarSymbols.INTEGER);
    grammar.put(GrammarSymbols.INTEGER_EXPR, GrammarSymbols.INTEGER_EXPR_VALUE);
    GrammarSymbols.INTEGER_VALUE.add(GrammarSymbols.INTEGER_CONSTANT);
    GrammarSymbols.INTEGER_VALUE.add(GrammarSymbols.INTEGER_FROM_FIELD);
    GrammarSymbols.INTEGER_VALUE.add(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER));
    grammar.put(GrammarSymbols.INTEGER, GrammarSymbols.INTEGER_VALUE);
    grammar.put(GrammarSymbols.INTEGER_CONSTANT, GrammarSymbols.INTEGER_CONSTANT_VALUE);
    grammar.put(GrammarSymbols.INTEGER_FIELD, new LinkedList<String>());
    grammar.put(GrammarSymbols.INTEGER_FROM_SET_SIZE, new LinkedList<String>());

    // Membership
    grammar.put(GrammarSymbols.MEMBERSHIP_EXPR, new LinkedList<String>());


    return grammar;
  }

  /**
   * Add quantification option
   */
  private static void add_quantification_option(Map<String, List<String>> grammar,
      String set_symbol, String body_symbol) {
    if (quantified_sets.add(set_symbol)) {
      // First time, create the proper quantification options
      grammar.get(GrammarSymbols.QT_EXPR)
          .add(GrammarSymbols.QUANTIFIER + " " + GrammarSymbols.QT_VAR_NAME + " : " + set_symbol + " : " + body_symbol);
      grammar.get(GrammarSymbols.QT_EXPR).add(GrammarSymbols.QUANTIFIER + " " + GrammarSymbols.QT_VAR_NAME + " : " + set_symbol + " : ("
          + body_symbol + ") " + GrammarSymbols.LOGIC_OP + " (" + body_symbol + ")");
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
    String var = GrammarSymbols.get_special_identifier(final_set_type);
    String membership_expr_value = var + " " + GrammarSymbols.VAR_SET_CMP_OP + " " + current_set_symbol + "." + final_label;
    extend_grammar(grammar, membership_expr_symbol, membership_expr_value);
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
    extend_grammar(grammar, GrammarSymbols.INTEGER_FROM_SET_SIZE, "#(" + current_set_symbol + ")");
    // Options for the quantified objects comparisons
    String current_qt_obj_symbol = GrammarSymbols.get_qt_obj_symbol(type_name);
    String qt_object_cmp_option = GrammarSymbols.QT_VAR_NAME + " " + GrammarSymbols.REF_OP + " " + current_qt_obj_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_object_cmp_option);
    String current_qt_obj_set_symbol = GrammarSymbols.get_qt_obj_set_symbol(type_name);
    String qt_var_set_cmp_option = GrammarSymbols.QT_VAR_NAME + " " + GrammarSymbols.VAR_SET_CMP_OP + " "
        + current_qt_obj_set_symbol;
    extend_grammar(grammar, current_obj_cmp_symbol, qt_var_set_cmp_option);
    // Options for the quantified objects
    extend_grammar(grammar, current_qt_obj_symbol, GrammarSymbols.QT_VAR_NAME + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol,
            GrammarSymbols.QT_VAR_NAME + "." + current_set_label_symbol + "." + current_set_label_symbol);
    extend_grammar(grammar, current_qt_obj_symbol, GrammarSymbols.NULL);
    // Options for the quantified sets
    extend_grammar(grammar, current_qt_obj_set_symbol,
            GrammarSymbols.QT_VAR_NAME + ".^(" + current_set_labels_symbol + ")");
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
    extend_grammar(grammar, GrammarSymbols.INTEGER_FROM_SET_SIZE, "#(" + current_set_symbol + ")");
    if (JavaTypesUtil.is_integer(type_name)) {
      String numeric_cmp_symbol = GrammarSymbols.QT_VAR_NAME + " " + GrammarSymbols.NUMERIC_CMP_OP + " " + GrammarSymbols.INTEGER_EXPR;
      extend_grammar(grammar, current_obj_body_symbol, numeric_cmp_symbol);
    } else {
      String current_obj_cmp_symbol = GrammarSymbols.get_qt_obj_cmp_symbol(type_name);
      extend_grammar(grammar, current_obj_body_symbol, current_obj_cmp_symbol);
      String current_qt_obj_symbol = GrammarSymbols.get_qt_obj_symbol(type_name);
      String qt_object_cmp_option = GrammarSymbols.QT_VAR_NAME + " " + GrammarSymbols.REF_OP + " " + current_qt_obj_symbol;
      extend_grammar(grammar, current_obj_cmp_symbol, qt_object_cmp_option);
      extend_grammar(grammar, current_qt_obj_symbol, GrammarSymbols.NULL);
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
    String qt_obj_field_option = GrammarSymbols.QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " "
        + GrammarSymbols.QT_VAR_NAME + "." + current_set_label_symbol + "." + dest_label;
    extend_grammar(grammar, current_obj_dest_cmp_symbol, qt_obj_field_option);
    if (JavaTypesUtil.BOOLEAN.equals(formatted_dest_type)) {
      // The expression n.field can be directly in the body of the quantification
      extend_grammar(grammar, current_obj_dest_cmp_symbol, GrammarSymbols.QT_VAR_NAME + "." + dest_label);
    }
    if (JavaTypesUtil.INTEGER.equals(formatted_dest_type)) {
      // The expression n.field is an integer, so allow the comparison with any given integer
      String integer_cmp_symbol = GrammarSymbols.QT_VAR_NAME + "." + dest_label + " " + cmp_symbol + " " + GrammarSymbols.INTEGER;
      extend_grammar(grammar, current_obj_dest_cmp_symbol, integer_cmp_symbol);
    }
  }

  /**
   * Add the given option to the integer symbol
   */
  public static void add_integer_option(Map<String, List<String>> grammar, String option) {
    extend_grammar(grammar, GrammarSymbols.INTEGER, option);
  }

  /**
   * Remove non expandable symbols
   */
  public static void remove_non_expandable(Map<String, List<String>> grammar) {
    remove_non_expandable_from_integer(grammar);
    remove_non_expandable_from_logic(grammar);
    remove_non_expandable_from_quantification(grammar);
    remove_non_expandable_membership(grammar);
  }

  /**
   * Remove non-expandable symbols involving integers
   */
  protected static void remove_non_expandable_from_integer(Map<String, List<String>> grammar) {
    if (grammar.get(GrammarSymbols.INTEGER_FIELD).isEmpty()) {
      // There are no integer fields, so remove the symbol and all the other non-terminal symbols
      // mentioning the integer field symbol
      grammar.remove(GrammarSymbols.INTEGER_FIELD);
      grammar.get(GrammarSymbols.INTEGER_EXPR).removeIf(x -> x.contains(GrammarSymbols.INTEGER_FIELD));
      grammar.get(GrammarSymbols.INTEGER_FROM_FIELD).removeIf(x -> x.contains(GrammarSymbols.INTEGER_FIELD));
      grammar.get(GrammarSymbols.INTEGER).removeIf(x -> x.contains(GrammarSymbols.INTEGER_FIELD));
    }

    if (grammar.get(GrammarSymbols.INTEGER_FROM_SET_SIZE).isEmpty()) {
      // There are not sets for computing size
      grammar.remove(GrammarSymbols.INTEGER_FROM_SET_SIZE);
      grammar.get(GrammarSymbols.INTEGER_FROM_FIELD).removeIf(x -> x.contains(GrammarSymbols.INTEGER_FROM_SET_SIZE));
    }

    if (!all_arguments_types.contains(JavaTypesUtil.INTEGER)) {
      // There are no arguments of type Integer, so The Integer_Variable option should be removed
      grammar.get(GrammarSymbols.INTEGER).remove(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER));
    }
  }

  /**
   * Remove non-expandable symbols involving logic
   */
  protected static void remove_non_expandable_from_logic(Map<String, List<String>> grammar) {
    if (grammar.get(GrammarSymbols.BOOLEAN_FIELD).isEmpty()) {
      grammar.remove(GrammarSymbols.BOOLEAN_FIELD);
      grammar.get(GrammarSymbols.LOGIC_FROM_FIELD).removeIf(x -> x .contains(GrammarSymbols.BOOLEAN_FIELD));
    }
    if (grammar.get(GrammarSymbols.LOGIC_FROM_FIELD).isEmpty()) {
      // There are no boolean fields
      grammar.remove(GrammarSymbols.LOGIC_FROM_FIELD);
      grammar.remove(GrammarSymbols.LOGIC_CMP_EXPR);
      grammar.remove(GrammarSymbols.LOGIC_EXPR);
      grammar.get(GrammarSymbols.START_SYMBOL).removeIf(x -> x.contains(GrammarSymbols.LOGIC_CMP_EXPR));
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
      if (grammar.get(GrammarSymbols.LOGIC_EXPR) != null && !grammar.get(GrammarSymbols.LOGIC_EXPR).isEmpty())
        grammar.get(GrammarSymbols.LOGIC_EXPR).remove(GrammarSymbols.QT_EXPR);
    }
  }

  /**
   * Remove non-expandable symbol involving membership
   */
  protected static void remove_non_expandable_membership(Map<String, List<String>> grammar) {
    if (grammar.get(GrammarSymbols.MEMBERSHIP_EXPR).isEmpty()) {
      grammar.get(GrammarSymbols.START_SYMBOL).remove(GrammarSymbols.MEMBERSHIP_EXPR);
    }
  }

  /**
   * Return the number of specifications that can be generated from the given grammar
   */
  protected static int calculate_potential_specs(Map<String, List<String>> grammar) {
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
