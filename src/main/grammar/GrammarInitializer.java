package grammar;

import grammar.symbols.LogicSymbols;
import grammar.symbols.DoubleSymbols;
import grammar.symbols.IntegerSymbols;
import grammar.symbols.LongSymbols;
import utils.JavaTypesUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * This class allows to initialize the main components of a base grammar for a CUT.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class GrammarInitializer {

  /**
   * Initialize all the main symbols
   */
  public static void initialize_main_symbols(Map<String, List<String>> grammar) {
    grammar.put(GrammarSymbols.START_SYMBOL, new LinkedList<>());
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.QT_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.NUMERIC_CMP_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(LogicSymbols.LOGIC_CMP_EXPR);
    grammar.get(GrammarSymbols.START_SYMBOL).add(GrammarSymbols.MEMBERSHIP_EXPR);
  }

  /**
   * Initialize all the symbols related to quantified expressions
   */
  public static void initialize_quantified_expressions(Map<String, List<String>> grammar) {
    grammar.put(GrammarSymbols.QT_EXPR, new LinkedList<>());
    grammar.put(GrammarSymbols.QUANTIFIER, GrammarSymbols.QUANTIFIER_VALUE);
    grammar.put(GrammarSymbols.REF_OP, GrammarSymbols.REF_OP_VALUE);
    grammar.put(GrammarSymbols.VAR_SET_CMP_OP, GrammarSymbols.VAR_SET_CMP_OP_VALUE);
    grammar.put(GrammarSymbols.SET_BIN_OP, GrammarSymbols.SET_BIN_OP_VALUE);
  }

  /**
   * Initialize all the symbols related to logic expressions
   */
  public static void initialize_logic_expressions(Map<String, List<String>> grammar) {
    grammar.put(GrammarSymbols.LOGIC_OP, GrammarSymbols.LOGIC_OP_VALUE);
    grammar.put(LogicSymbols.LOGIC_EXPR, LogicSymbols.get_logic_expr_value());
    grammar.put(LogicSymbols.LOGIC_CMP_EXPR,LogicSymbols.prepare_cmp_symbols());
    grammar.put(LogicSymbols.LOGIC_FROM_FIELD,LogicSymbols.get_logic_from_field_value());
    grammar.put(LogicSymbols.BOOLEAN_ZERO, LogicSymbols.get_boolean_zero_value());
    grammar.put(LogicSymbols.BOOLEAN_ONE, LogicSymbols.get_boolean_one_value());
    grammar.put(LogicSymbols.BOOLEAN_TWO, LogicSymbols.get_boolean_two_value());
    grammar.put(LogicSymbols.BOOLEAN_FIELD, new LinkedList<>());
  }

  /**
   * Initialize all the symbols related to numeric comparison expressions
   */
  public static void initialize_numeric_cmp_expressions(Map<String, List<String>> grammar) {
    grammar.put(GrammarSymbols.NUMERIC_CMP_EXPR, new LinkedList<>());
    // Operators
    grammar.put(GrammarSymbols.NUMERIC_CMP_OP, GrammarSymbols.NUMERIC_CMP_OP_VALUE);
    grammar.put(GrammarSymbols.NUMERIC_BIN_OP, GrammarSymbols.NUMERIC_BIN_OP_VALUE);

    // Integer stuff
    grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).add(IntegerSymbols.INTEGER_CMP_EXPR);
    grammar.put(IntegerSymbols.INTEGER_CMP_EXPR, IntegerSymbols.prepare_cmp_symbols());
    grammar.put(IntegerSymbols.INTEGER_FROM_FIELD, IntegerSymbols.get_integer_from_field_value());
    grammar.put(IntegerSymbols.INTEGER_ZERO, IntegerSymbols.get_integer_zero_value());
    grammar.put(IntegerSymbols.INTEGER_ONE, IntegerSymbols.get_integer_one_value());
    grammar.put(IntegerSymbols.INTEGER_TWO, IntegerSymbols.get_integer_two_value());
    grammar.put(IntegerSymbols.INTEGER_CONSTANT, IntegerSymbols.INTEGER_CONSTANT_VALUE);
    grammar.put(IntegerSymbols.INTEGER_FIELD, new LinkedList<>());
    grammar.put(IntegerSymbols.INTEGER_FROM_SET_SIZE, new LinkedList<>());
    grammar.get(IntegerSymbols.INTEGER_FROM_SET_SIZE).add("#(" + GrammarSymbols.get_set_symbol(JavaTypesUtil.INTEGER) + ")");

    // Long stuff
    grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).add(LongSymbols.LONG_CMP_EXPR);
    grammar.put(LongSymbols.LONG_CMP_EXPR, LongSymbols.prepare_cmp_symbols());
    grammar.put(LongSymbols.LONG_FROM_FIELD, LongSymbols.get_long_from_field_value());
    grammar.put(LongSymbols.LONG_ZERO, LongSymbols.get_long_zero_value());
    grammar.put(LongSymbols.LONG_ONE, LongSymbols.get_long_one_value());
    grammar.put(LongSymbols.LONG_TWO, LongSymbols.get_long_two_value());
    grammar.put(LongSymbols.LONG_FIELD, new LinkedList<>());

    // Double stuff
    grammar.get(GrammarSymbols.NUMERIC_CMP_EXPR).add(DoubleSymbols.DOUBLE_CMP_EXPR);
    grammar.put(DoubleSymbols.DOUBLE_CMP_EXPR, DoubleSymbols.prepare_cmp_symbols());
    grammar.put(DoubleSymbols.DOUBLE_FROM_FIELD, DoubleSymbols.get_double_from_field_value());
    grammar.put(DoubleSymbols.DOUBLE_ZERO, DoubleSymbols.get_double_zero_value());
    grammar.put(DoubleSymbols.DOUBLE_ONE, DoubleSymbols.get_double_one_value());
    grammar.put(DoubleSymbols.DOUBLE_TWO, DoubleSymbols.get_double_two_value());
    grammar.put(DoubleSymbols.DOUBLE_CONSTANT, DoubleSymbols.DOUBLE_CONSTANT_VALUE);
    grammar.put(DoubleSymbols.DOUBLE_FIELD, new LinkedList<>());
  }

  /**
   * Initialize all the symbols related to membership expressions
   */
  public static void initialize_membership_expressions(Map<String, List<String>> grammar) {
    grammar.put(GrammarSymbols.MEMBERSHIP_EXPR, new LinkedList<>());
    // Base integer membership
    String integer_membership = GrammarSymbols.get_membership_symbol(JavaTypesUtil.INTEGER);
    grammar.get(GrammarSymbols.MEMBERSHIP_EXPR).add(integer_membership);
    String set_symbol = GrammarSymbols.get_set_symbol(JavaTypesUtil.INTEGER);
    String integer_membership_value = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 0) + " " + GrammarSymbols.VAR_SET_CMP_OP + " " + set_symbol;
    GrammarBuilder.extend_grammar(grammar, integer_membership, integer_membership_value);
    GrammarBuilder.extend_grammar(grammar, set_symbol, GrammarSymbols.get_special_identifier_set(JavaTypesUtil.INTEGER, 0));
  }

}