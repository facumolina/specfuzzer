package invariant;

import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

import DataStructures.List;
import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import fuzzer.Fuzzer;
import typequals.prototype.qual.Prototype;

/**
 * Represents a candidate invariant which is obtained by fuzzing a grammar
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FuzzedInvariant extends PointerInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization. If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20200610L;

  // Variables starting with dkconfig_ should only be set via the
  // daikon.config.Configuration interface.
  /** Boolean. True iff Positive invariants should be considered. */
  public static boolean dkconfig_enabled = Invariant.invariantEnabledDefault;

  // Fuzzed spec represented by this invariant
  private static String fuzzed_spec;

  ///
  /// Required methods
  ///
  private FuzzedInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
  }

  private @Prototype FuzzedInvariant() {
    super();
    get_fuzzed_spec();
  }

  /** Fuzz the spec represented by this invariant */
  private void get_fuzzed_spec() {
    fuzzed_spec = Fuzzer
        .fuzz("/Users/fmolina/phd/software/fuzzing-specs/grammars/ListGrammar.json");
    System.out.println("Fuzzed spec is: " + fuzzed_spec);
  }

  private static @Prototype FuzzedInvariant proto = new @Prototype FuzzedInvariant();

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedInvariant get_proto() {
    return proto;
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedInvariant instantiate_dyn(@Prototype FuzzedInvariant this, PptSlice slice) {
    return new FuzzedInvariant(slice, fuzzed_spec);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedInvariant this, OutputFormat format) {
    return "FuzzedInvariant ( " + fuzzed_spec + ") holds for: " + var().name();
  }

  @Override
  public InvariantStatus check_modified(long v, int count) {
    // Recover the object
    int i = (int) v;
    Object o = ObjectsLoader.get_object(i);
    if (o == null) {
      return InvariantStatus.FALSIFIED;
    }
    if (o instanceof List) {
      List l = (List) o;
      // boolean b = ExpressionEvaluator.evaluateQuantifiedExpression("all","this . * next","n !in n
      // . ^ next",l);
      boolean b = true;
      if (!b) {
        return InvariantStatus.FALSIFIED;
      }
    }
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  public InvariantStatus add_modified(long v, int count) {
    return check_modified(v, count);
  }

  @Override
  protected double computeConfidence() {
    // Assume that every variable has a .5 chance of being positive by
    // chance. Then a set of n values have a have (.5)^n chance of all
    // being positive by chance.
    return 1 - Math.pow(.5, ppt.num_samples());
  }

  @Pure
  @Override
  public boolean isSameFormula(Invariant other) {
    assert other instanceof FuzzedInvariant;
    return true;
  }
}