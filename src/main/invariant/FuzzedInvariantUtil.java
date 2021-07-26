package invariant;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import com.github.javaparser.ast.type.PrimitiveType;
import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.chicory.Runtime;
import daikon.inv.InvariantStatus;
import expression.ExpressionEvaluator;
import expression.ExpressionValidator;
import grammar.GrammarSymbols;
import utils.JavaTypesUtil;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
    Set<String> class_names = new HashSet<>();
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

    List<String> vars = new ArrayList<>();
    if (fuzzed_spec.contains(cut_name + "."))
      vars.add(cut_name);

    // Check for the integer vars
    String var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 1);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER, 2);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the long vars
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 1);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.LONG, 2);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the double vars
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 1);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.DOUBLE, 2);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the boolean var
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 1);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.BOOLEAN, 2);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for the object var
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    // Check for collection vars
    var_name = GrammarSymbols.get_special_identifier_set(JavaTypesUtil.INTEGER, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);
    var_name = GrammarSymbols.get_special_identifier_set(JavaTypesUtil.OBJECT, 0);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    return vars;
  }

  /**
   * Get the value of the nth variable in the type expected by the expression
   */
  public static Object get_var_value(String fuzzed_spec,long v, int n) {
    List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, Object.class);
    Class<?> clazz = FuzzedInvariantUtil.get_class_for_variable(vars.get(n));
    if (Integer.class.isAssignableFrom(clazz))
      return (int) v;
    if (Long.class.isAssignableFrom(clazz))
      return v;
    if (Boolean.class.isAssignableFrom(clazz))
      return v!=0;
    throw new IllegalArgumentException("Unexpected variable type: " + clazz.getSimpleName() + " with value " + v);
  }

  /**
   * Get the value of the nth variable in the type expected by the expression
   */
  public static Object get_var_value(String fuzzed_spec,double v, int n) {
    List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, Object.class);
    Class<?> clazz = FuzzedInvariantUtil.get_class_for_variable(vars.get(n));
    if (Double.class.isAssignableFrom(clazz))
      return v;
    throw new IllegalArgumentException("Unexpected variable type: " + clazz.getSimpleName() + " with value " + v);
  }

  /**
   * Returns true iff the given name represents a variable name
   */
  public static boolean is_var(String name) {
    return name!=null && name.contains("_Variable_");
  }

  /**
   * Returns a random type for the given variable type (only used for tests purposes)
   */
  public static Object get_random_value_for_variable(String var_type) {
    if (var_type==null)
      throw new IllegalArgumentException("The variable type can't be null");

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.BOOLEAN)))
      return new Random().nextBoolean();

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.INTEGER)))
      return new Random().nextInt(10);

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.DOUBLE)))
      return new Random().nextDouble();

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.OBJECT)))
      return new Object();

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix_set(JavaTypesUtil.INTEGER)))
      return new HashSet<>(Arrays.asList(1,2,3));

    throw new IllegalStateException("Variable type "+var_type+" not supported");
  }

  /**
   * Get the class of a variable type
   */
  public static Class<?> get_class_for_variable(String var_type) {
    if (var_type==null)
      throw new IllegalArgumentException("The variable type can't be null");

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.BOOLEAN)))
      return Boolean.class;

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.INTEGER)))
      return Integer.class;

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.LONG)))
      return Long.class;

    if (var_type.startsWith(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.DOUBLE)))
      return Double.class;

    if (var_type.equals(GrammarSymbols.get_special_identifier_prefix(JavaTypesUtil.OBJECT)))
      return Object.class;

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
   * 1. It contains only one terminal symbol and it's not a set nor a variable
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
      } else {
        return !term.contains("_Variable");
      }
    }
    return false;
  }

  /**
   * Count the occurrences of findStr in str
   */
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

  /**
   * Handle missing key
   */
  public static InvariantStatus handle_missing_key(Map<String, InvariantStatus> cache,String fuzzed_spec,String cached_key, String type_str) {
    // First check if the fuzzed spec can be instantiated from the object type
    // This check is done here since it may be the case that the given hashcode i
    // corresponds to an object of an invalid type for the current fuzzed_spec
    String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();
    if (!ExpressionValidator.is_valid(fuzzed_spec,class_name)) {
      cache.put(cached_key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    } else {
      cache.put(cached_key, InvariantStatus.NO_CHANGE);
      return InvariantStatus.NO_CHANGE;
    }
  }

  /**
   * Return the value being compared with the object
   */
  public static Object get_value_for_variable(PptTupleInfo tuple, VarInfo var) {
    String var_name = var.name();
    Object varValue;
    if (var_name.startsWith("this")) {
      // Represents a field that can be obtained from the this object.
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace("this", tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else if (var_name.startsWith(tuple.getThisObject().getClass().getCanonicalName()) &&
            !var_name.contains("$")) {
      // Represents a static field
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace(tuple.getThisObject().getClass().getCanonicalName(), tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else {
      if (var_name.contains("orig")) { // It is an orig var
        var_name = var_name.replace("orig(", ""); // Remove orig(
        var_name = var_name.substring(0, var_name.length() - 1); // Remove )
      }
      if (var.is_size()) { // It the size of a sequence
        varValue = compute_value_for_size_var(var, tuple);
      } else {
        varValue = tuple.getVariableValue(var_name);
      }
    }
    if (varValue instanceof Runtime.PrimitiveWrapper) {
      // In the value is an instance of PrimitiveWrapper, then get the value it wraps.
      Runtime.PrimitiveWrapper wrapper = (Runtime.PrimitiveWrapper)varValue;
      varValue = wrapper.getJavaWrapper();
    }
    return varValue;
  }

  /**
   * Compute the value for a size variable
   */
  private static Object compute_value_for_size_var(VarInfo size_var, PptTupleInfo tuple) {
    // Get the name of the inner variable (as it is saved in the tuple)
    String inner_var = size_var.name().replace("size(","").replace("[..])","");
    if (inner_var.contains("-1")) inner_var = inner_var.replace("-1","");

    // Get the value from the tuple. If null, return null, else compute the size.
    Object inner_var_value = tuple.getVariableValue(inner_var);
    if (inner_var_value==null) return null;
    if (inner_var_value.getClass().isArray())
      return Arrays.asList(inner_var_value).size();

    // Unknown type
    throw new IllegalArgumentException("Dont know how to compute size for var: "+size_var.name());
  }

  /**
   * Return the prefix of the given ppt name
   */
  public static String get_ppt_name_prefix(String ppt_name) {
    if (ppt_name==null || "".equals(ppt_name)) throw new IllegalArgumentException("Invalid ppt name");
    if (ppt_name.contains(":::ENTER"))
      return ppt_name.split(":::ENTER")[0]+":::ENTER";
    if (ppt_name.contains(":::EXIT"))
      return ppt_name.split(":::EXIT")[0]+":::EXIT";
    throw new IllegalArgumentException("Do not know how to get the prefix of ppt_name "+ppt_name);
  }

  /**
   * Returns a VarInfo[] lexicographically sorted by the name of the variables present in the given array
   */
  public static VarInfo[] sort_lexicographically(VarInfo[] vis) {
    VarInfo[] copy = Arrays.copyOf(vis,vis.length);
    List<VarInfo> l = Arrays.asList(copy);
    Collections.sort(l, (v1, v2) -> {
      // Use original variable names, i.e., without orig() in the prestates
      String v1_name = v1.isPrestate()?v1.name().replace("orig(","").replace(")",""):v1.name();
      String v2_name = v2.isPrestate()?v2.name().replace("orig(","").replace(")",""):v2.name();
      return v1_name.compareTo(v2_name);
    });
    return (VarInfo[]) l.toArray();
  }

}