package invariant;

import daikon.tools.InvariantChecker;
import expression.NonEvaluableExpressionException;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

import daikon.Daikon;
import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import expression.ExpressionEvaluator;
import expression.NonApplicableExpressionException;
import fuzzer.BasicFuzzer;
import fuzzer.GrammarBasedFuzzer;
import typequals.prototype.qual.Prototype;

import java.util.List;

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
  private String fuzzed_spec;

  // Grammar-Based Fuzzer
  private GrammarBasedFuzzer fuzzer;

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

  private @Prototype FuzzedInvariant(String spec) {
    super();
    fuzzed_spec = spec;
    System.out.println("Created from fuzzed spec: " + fuzzed_spec);
  }

  /** Fuzz the spec represented by this invariant */
  private void get_fuzzed_spec() {
    if (Daikon.grammar_to_fuzz == null)
      throw new Daikon.UserError("When using FuzzedInvariant, the grammar must be specified");
    if (fuzzer == null)
      fuzzer = new BasicFuzzer(Daikon.grammar_to_fuzz);
    fuzzed_spec = fuzzer.fuzz();
    System.out.println("Fuzzed spec is: " + fuzzed_spec);
  }

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedInvariant get_proto() {
    return new @Prototype FuzzedInvariant();
  }

  public static @Prototype FuzzedInvariant get_proto_from_spec(String spec) {
    return new @Prototype FuzzedInvariant(spec);
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
    if (format == OutputFormat.JAVA)
      return "FuzzedInvariant:" + fuzzed_spec;
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: " + var().name();
  }

  @Override
  public InvariantStatus check_modified(long v, int count) {
    // Recover the object
    int i = (int) v;
    String key = i+"-"+ppt.parent.name;
    List<Object> l = ObjectsLoader.get_object(key);
    if (l == null)
      return InvariantStatus.NO_CHANGE;

    try {
      for (Object o : l) {
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, o);
        if (!b) {
          return InvariantStatus.FALSIFIED;
        }
      }
    } catch (NonApplicableExpressionException| NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      return InvariantStatus.FALSIFIED;
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
    FuzzedInvariant fuzzed_inv = (FuzzedInvariant) other;
    assert (fuzzed_inv.fuzzed_spec != null);
    return fuzzed_spec.equals(fuzzed_inv.fuzzed_spec);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof FuzzedInvariant))
      return false;
    return isSameFormula((FuzzedInvariant)other);
  }

}
