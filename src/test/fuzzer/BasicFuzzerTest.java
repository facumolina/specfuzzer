package fuzzer;

import DataStructures.CollectionAttribute;
import DataStructures.eiffel.Composite;
import invariant.FuzzedInvariantUtil;
import org.junit.Test;

import DataStructures.AvlTreeList;
import DataStructures.List;
import DataStructures.MapWrapper;
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

  private void eval(String fuzzed_spec, Object o, java.util.List<String> vars) {
    Object o1 = o;
    // If the first name is a variable, then use a random value instead of the current object
    if (FuzzedInvariantUtil.is_var(vars.get(0)))
      o1 = FuzzedInvariantUtil.get_random_value_for_variable(vars.get(0));

    if (vars.size() == 1)
      ExpressionEvaluator.eval(fuzzed_spec, o1);

    if (vars.size() == 2)
      ExpressionEvaluator.eval(fuzzed_spec, o1, FuzzedInvariantUtil.get_random_value_for_variable(vars.get(1)));

    if (vars.size() == 3)
      ExpressionEvaluator.eval(fuzzed_spec, o1, FuzzedInvariantUtil.get_random_value_for_variable(vars.get(1)), FuzzedInvariantUtil.get_random_value_for_variable(vars.get(2)));
  }

  @Test
  public void fuzz_list_invs() {
    // Prepare List
    List l = new List();
    l.insert(2);
    l.insert(3);
    // Fuzz invariants
    String grammar_file = System.getProperty("user.dir") + "/grammars/ListGrammar.json";
    BasicFuzzer fuzzer = new BasicFuzzer(grammar_file);
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = fuzzer.fuzz();
      System.out.println("Evaluating spec: " + fuzzed_spec);
      java.util.List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, List.class);
      try {
        eval(fuzzed_spec, l, vars);
      } catch (expression.NonEvaluableExpressionException ignored) { }
    }
  }

  @Test
  public void fuzz_avltreelist_invs() {
    // Prepare AvlTreeList
    AvlTreeList<Integer> avl = new AvlTreeList<>();
    avl.add(5);
    avl.add(4);
    avl.add(1);
    // Fuzz invariants
    String grammar_file = System.getProperty("user.dir") + "/grammars/AvlTreeListGrammar.json";
    BasicFuzzer fuzzer = new BasicFuzzer(grammar_file);
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = fuzzer.fuzz();
      System.out.println("Evaluating spec: " + fuzzed_spec);
      java.util.List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, AvlTreeList.class);
      try {
        eval(fuzzed_spec, avl, vars);
      } catch (expression.NonEvaluableExpressionException ignored) { }
    }
  }

  @Test
  public void fuzz_map_wrapper_invs() {
    // Prepare MapWrapper
    MapWrapper wrapper = new MapWrapper();
    wrapper.add(1, 32);
    wrapper.add(2, 33);
    wrapper.add(3, 34);
    wrapper.add(4, 35);
    // Fuzz invariants
    String grammar_file = System.getProperty("user.dir") + "/grammars/MapWrapperGrammar.json";
    BasicFuzzer fuzzer = new BasicFuzzer(grammar_file);
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = fuzzer.fuzz();
      System.out.println("Evaluating spec: " + fuzzed_spec);
      java.util.List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, MapWrapper.class);
      try {
        eval(fuzzed_spec, wrapper, vars);
      } catch (expression.NonEvaluableExpressionException ignored) { }
    }
  }

  @Test
  public void fuzz_composite_invs() {
    // Prepare Composite
    Composite composite = new Composite(4);
    Composite c1 = new Composite(1);
    Composite c2 = new Composite(2);
    composite.add_child(c1);
    composite.add_child(c2);
    String grammar_file = System.getProperty("user.dir") + "/grammars/CompositeGrammar.json";
    BasicFuzzer fuzzer = new BasicFuzzer(grammar_file);
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = fuzzer.fuzz();
      System.out.println("Evaluating spec: " + fuzzed_spec);
      java.util.List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, Composite.class);
      try {
        eval(fuzzed_spec, composite, vars);
      } catch (expression.NonEvaluableExpressionException ignored) { }
    }
  }

  @Test
  public void fuzz_collectionattributes_invs() {
    // Prepare CollectionAttribute
    CollectionAttribute collectionAttribute = new CollectionAttribute();
    String grammar_file = System.getProperty("user.dir") + "/grammars/CollectionAttributeGrammar.json";
    BasicFuzzer fuzzer = new BasicFuzzer(grammar_file);
    for (int i = 0; i < invs_to_fuzz; i++) {
      String fuzzed_spec = fuzzer.fuzz();
      System.out.println("Evaluating spec: " + fuzzed_spec);
      java.util.List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, CollectionAttribute.class);
      try {
        eval(fuzzed_spec, collectionAttribute, vars);
      } catch (expression.NonEvaluableExpressionException ignored) { }
    }
  }

}
