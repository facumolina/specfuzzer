package fuzzer;

import org.json.simple.JSONObject;

/**
 * Abstract class representing a Grammar based Fuzzer
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class GrammarBasedFuzzer extends Fuzzer {

  protected JSONObject grammar; // Grammar to fuzz

}
