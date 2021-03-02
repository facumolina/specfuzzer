package invariant;

import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class that contains utils for fuzzed invariants
 */
public class FuzzedInvariantUtil {

  /**
   * Returns the corresponding arity from a given fuzzed spec
   */
  public static FuzzedInvariantArity get_arity(String fuzzed_spec, Class<?> base_cut) {

    String cut_name = base_cut.getSimpleName();
    if (!fuzzed_spec.contains(cut_name))
      throw new IllegalArgumentException(fuzzed_spec+ "can't be a spec for class "+cut_name);

    if (fuzzed_spec.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER)))
      return FuzzedInvariantArity.TWO;

    if (fuzzed_spec.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT)))
      return FuzzedInvariantArity.TWO;

    return FuzzedInvariantArity.ONE;
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

    // Check for the object var
    var_name = GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT);
    if (fuzzed_spec.contains(var_name))
      vars.add(var_name);

    return vars;
  }

  /**
   * Returns the Invariant class that needs to be used to encapsulate the given fuzzed spec
   */
  public static Class<?> get_invariant_for_spec(String fuzzed_spec, Class<?> base_cut) {
      FuzzedInvariantArity arity = get_arity(fuzzed_spec, base_cut);
      if (arity==FuzzedInvariantArity.ONE)
        return FuzzedUnaryInvariant.class;
      if (arity==FuzzedInvariantArity.TWO)
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
