package fuzzer;

import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import expression.ExpressionEvaluator;

/**
 * This class contains tests to ensure that the BasicFuzzer is creating expressions that are
 * evaluated without unexpected errors.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class BasicFuzzerTest {

  private static final int invs_to_fuzz = 100;

  @Test
  public void fuzz_list_invs() {
    // Prepare list
    List l = new List();
    l.insert(2);
    l.insert(3);
    // Fuzz invariants
    String grammar_file = System.getProperty("user.dir") + "/grammars/ListGrammar.json";
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = BasicFuzzer.fuzz(grammar_file);
      System.out.println("Evaluating spec: " + fuzzed_spec);
      ExpressionEvaluator.eval(fuzzed_spec, l);
    }
  }

  @Test
  public void fuzz_avltreelist_invs() {
    // Prepare list
    AvlTreeList<Integer> avl = new AvlTreeList<Integer>();
    avl.add(5);
    avl.add(4);
    avl.add(1);
    // Fuzz invariants
    BasicFuzzer.emtpy_grammar();
    String grammar_file = System.getProperty("user.dir") + "/grammars/AvlTreeListGrammar.json";
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = BasicFuzzer.fuzz(grammar_file);
      System.out.println("Evaluating spec: " + fuzzed_spec);
      ExpressionEvaluator.eval(fuzzed_spec, avl);
    }
  }
}
