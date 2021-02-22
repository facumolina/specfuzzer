package invariant;

import daikon.Daikon;
import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import expression.ExpressionEvaluator;
import expression.NonApplicableExpressionException;
import expression.NonEvaluableExpressionException;
import fuzzer.BasicFuzzer;
import fuzzer.GrammarBasedFuzzer;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.NonPrototype;
import typequals.prototype.qual.Prototype;

import java.util.List;

/**
 * Represents a candidate binary invariant which is obtained by fuzzing a grammar
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FuzzedBinaryInvariant extends VarPointerInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization. If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20210222L;

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
  private FuzzedBinaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
  }

  private @Prototype FuzzedBinaryInvariant() {
    super();
    get_fuzzed_spec();
  }

  private @Prototype FuzzedBinaryInvariant(String spec) {
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
  public static @Prototype FuzzedBinaryInvariant get_proto() {
    return new @Prototype FuzzedBinaryInvariant();
  }

  public static @Prototype FuzzedBinaryInvariant get_proto_from_spec(String spec) {
    return new @Prototype FuzzedBinaryInvariant(spec);
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedBinaryInvariant instantiate_dyn(@Prototype FuzzedBinaryInvariant this, PptSlice slice) {
    return new FuzzedBinaryInvariant(slice, fuzzed_spec);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedBinaryInvariant this, OutputFormat format) {
    if (format == OutputFormat.JAVA)
      return "FuzzedInvariant:" + fuzzed_spec;
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: <" + var1().name() + " , " + var2().name() + ">";
  }

  @Override
  public InvariantStatus check_modified(long v1, long v2, int count) {
    // Recover the object
    int i = (int) v2;
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
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      return InvariantStatus.FALSIFIED;
    }
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  public InvariantStatus add_modified(long v1, long v2, int count) {
    return check_modified(v1, v2, count);
  }

  @Override
  protected double computeConfidence() {
    // Assume that every variable has a .5 chance of being positive by
    // chance. Then a set of n values have a have (.5)^n chance of all
    // being positive by chance.
    return 1 - Math.pow(.5, ppt.num_samples());
  }

  @Override
  protected Invariant resurrect_done(int[] ints) {
    return this;
  }

  @Pure
  @Override
  public boolean isSameFormula(Invariant invariant) {
    assert invariant instanceof FuzzedBinaryInvariant;
    FuzzedBinaryInvariant fuzzed_inv = (FuzzedBinaryInvariant) invariant;
    assert (fuzzed_inv.fuzzed_spec != null);
    return fuzzed_spec.equals(fuzzed_inv.fuzzed_spec);
  }

}
