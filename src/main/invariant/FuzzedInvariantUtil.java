package invariant;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * Class that contains utils for fuzzed invariants
 */
public class FuzzedInvariantUtil {

  /**
   * Parse the given fuzzed spec
   */
  private static AlloyExprGrammarParser.ExprContext parse_expr(String fuzzed_spec) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(fuzzed_spec));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AlloyExprGrammarParser parser = new AlloyExprGrammarParser(tokens);
    ParseTree tree = parser.parse();
    AlloyExprGrammarParser.ParseContext ctx = (AlloyExprGrammarParser.ParseContext) tree;
    return ctx.expr();
  }

  /**
   * Return the list of class names
   */
  public static int get_amount_of_vars(String fuzzed_spec) {
    Set<String> class_names = new HashSet<String>();
    int vars = 0;
    for (int i=0 ; i < fuzzed_spec.length(); i++) {
      if (Character.isUpperCase(fuzzed_spec.charAt(i))) {
        if (i==0 || fuzzed_spec.charAt(i-1)==' ' || fuzzed_spec.charAt(i-1)=='(') {
          String name = "";
          while (i < fuzzed_spec.length() && fuzzed_spec.charAt(i)!='.' && fuzzed_spec.charAt(i)!=' ' && fuzzed_spec.charAt(i)!=')') {
            name += fuzzed_spec.charAt(i);
            i++;
          }
          class_names.add(name);
        }
      }
    }
    return class_names.size();
  }

  /**
   * Returns the variable names present in the spec
   */
  public static List<String> get_vars(String fuzzed_spec, Class<?> base_cut) {
    String cut_name = base_cut.getSimpleName();
    if (!fuzzed_spec.contains(cut_name))
      throw new IllegalArgumentException(fuzzed_spec+ "can't be a spec for class "+cut_name);

    List<String> vars = new ArrayList<>();
    vars.add(cut_name);

    // Check for the integer var
    String var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the boolean var
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the object var
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    return vars;
  }

  /**
   * Returns the Invariant class that needs to be used to encapsulate the given fuzzed spec
   */
  public static Class<?> get_invariant_for_spec(String fuzzed_spec) {
      int arity = get_amount_of_vars(fuzzed_spec);
      if (arity==1)
        return FuzzedUnaryInvariant.class;
      if (arity==2)
        return FuzzedBinaryInvariant.class;
      return null;
  }

  /**
   * Returns a random type for the given variable type (only used for tests purposes)
   */
  public static Object get_random_value_for_variable(String var_type) {
    if (var_type==null)
      throw new IllegalArgumentException("The variable type can't be null");

    if (var_type.equals(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER)))
      return new Random().nextInt(10);

    if (var_type.equals(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT)))
      return new Object();

    throw new IllegalStateException("Variable type "+var_type+" not supported");
  }

  /**
   * Returns the amount of Software components of the given spec
   */
  public static int number_of_software_components(String fuzzed_spec) {
    AlloyExprGrammarParser.ExprContext exprContext = parse_expr(fuzzed_spec);
    Set<String> terminals = new HashSet<>();
    find_terminals(exprContext, terminals);
    return terminals.size();
  }

  /**
   * Returns true if the given fuzzed spec must be discarded
   * A spec is discarded if:
   * 1. It contains only one terminal symbol and it's not a set
   * 2. It contains only one terminal set symbol that occurs more than once.
   */
  public static boolean discard(String fuzzed_spec) {
    AlloyExprGrammarParser.ExprContext exprContext = parse_expr(fuzzed_spec);
    Set<String> terminals = new HashSet<>();
    find_terminals(exprContext, terminals);
    if (terminals.size()==1) {
      String term = terminals.iterator().next();
      if (term.contains("*")||term.contains("^")) {
        term = term.replace(" ", "");
        String spec = fuzzed_spec.replace(" ","");
        int occurrences = count_occurrences(term, spec);
        return occurrences > 1;
      }
      return true;
    }
    return false;
  }

  private static int count_occurrences(String findStr, String str) {
    int lastIndex = 0;
    int count = 0;
    while(lastIndex != -1){
      lastIndex = str.indexOf(findStr,lastIndex);
      if(lastIndex != -1){
        count ++;
        lastIndex += findStr.length();
      }
    }
    return count;
  }

  /**
   * Recursively visit the tree obtaining the terminals
   */
  private static void find_terminals(ParseTree tree, Set<String> terminals) {
    for (int i=0; i < tree.getChildCount(); i++) {
      ParseTree child = tree.getChild(i);
      if (child instanceof AlloyExprGrammarParser.NameContext)
        terminals.add(child.getText());
      else
        if (child instanceof AlloyExprGrammarParser.Set_exprContext)
          terminals.add(child.getText());
        else
          find_terminals(child, terminals);
    }
  }

  /**
   * Returns true if the given spec is quantified
   */
  public static boolean is_quantified(String fuzzed_spec) {
    return fuzzed_spec.startsWith("all ")||fuzzed_spec.startsWith("some ")||fuzzed_spec.startsWith("no ");
  }

}
