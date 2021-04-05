package fuzzer;

import grammar.GrammarBuilder;
import org.json.simple.JSONObject;

/**
 * Abstract class representing a Grammar based Fuzzer
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class GrammarBasedFuzzer extends Fuzzer {

  protected JSONObject grammar; // Grammar to fuzz

  /**
   * Returns the number of potential expressions that could be built
   * by fuzzing the current grammar
   */
  public int potential_expressions() {
    if (grammar!=null) {
      return GrammarBuilder.calculate_potential_specs(grammar);
    }
    return 0;
  }
}
