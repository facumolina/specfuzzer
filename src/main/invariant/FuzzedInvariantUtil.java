package invariant;

import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;

import java.util.*;

/**
 * Class that contains utils for fuzzed invariants
 */
public class FuzzedInvariantUtil {

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

}
