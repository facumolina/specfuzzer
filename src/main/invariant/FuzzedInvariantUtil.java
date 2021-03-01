package invariant;

import grammar.GrammarBuilder;
import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;

/**
 * Class that contains utils for fuzzed invariants
 */
public class FuzzedInvariantUtil {

  /**
   * Returns the corresponding arity from a given fuzzed spec
   */
  public static FuzzedInvariantArity get_arity(String fuzzed_spec,Class<?> base_cut) {

    String cut_name = base_cut.getSimpleName();
    if (!fuzzed_spec.contains(cut_name))
      throw new IllegalArgumentException(fuzzed_spec+ "can't be a spec for class "+cut_name);

    if (fuzzed_spec.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.INTEGER)))
      return FuzzedInvariantArity.TWO;

    if (fuzzed_spec.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT)))
      return FuzzedInvariantArity.TWO;

    return FuzzedInvariantArity.ONE;
  }

}
