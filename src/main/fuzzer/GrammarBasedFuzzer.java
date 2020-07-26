package fuzzer;

import org.json.simple.JSONObject;

public abstract class GrammarBasedFuzzer extends Fuzzer {

  protected JSONObject grammar; // Grammar to fuzz

}
