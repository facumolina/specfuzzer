package invariant;

import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.tools.InvariantChecker;
import expression.NonEvaluableExpressionException;
import expression.QuantifiedExpressionEvaluator;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a candidate invariant over one variable which is obtained by fuzzing a grammar
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FuzzedUnaryInvariant extends PointerInvariant {

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

  // Represents quantified expr
  private boolean represents_quantified = false;

  // Grammar-Based Fuzzer
  private GrammarBasedFuzzer fuzzer;

  // Cache of already evaluated hashcode-ppt pairs.
  private Map<String, InvariantStatus> cached_evaluations = new HashMap<>();

  ///
  /// Required methods
  ///
  private FuzzedUnaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
    represents_quantified = FuzzedInvariantUtil.is_quantified(fuzzed_spec);
  }

  private @Prototype FuzzedUnaryInvariant() {
    super();
    get_fuzzed_spec();
  }

  private @Prototype FuzzedUnaryInvariant(String spec) {
    super();
    fuzzed_spec = spec;
    represents_quantified = FuzzedInvariantUtil.is_quantified(fuzzed_spec);
    System.out.println("Fuzzed spec: " + fuzzed_spec);
  }

  /** Fuzz the spec represented by this invariant */
  private void get_fuzzed_spec() {
    if (Daikon.grammar_to_fuzz == null)
      throw new Daikon.UserError("When using FuzzedInvariant, the grammar must be specified");
    if (fuzzer == null)
      fuzzer = new BasicFuzzer(Daikon.grammar_to_fuzz);
    fuzzed_spec = fuzzer.fuzz();
    represents_quantified = FuzzedInvariantUtil.is_quantified(fuzzed_spec);
    System.out.println("Fuzzed spec is: " + fuzzed_spec);
  }

  @Override
  public boolean extra_check(VarInfo[] vis) {
    String type_str = vis[0].type.toString();
    String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();
    return ExpressionEvaluator.is_valid(fuzzed_spec, class_name);
  }

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedUnaryInvariant get_proto() {
    return new FuzzedUnaryInvariant();
  }

  public static @Prototype FuzzedUnaryInvariant get_proto_from_spec(String spec) {
    return new FuzzedUnaryInvariant(spec);
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedUnaryInvariant instantiate_dyn(@Prototype FuzzedUnaryInvariant this, PptSlice slice) {
    return new FuzzedUnaryInvariant(slice, fuzzed_spec);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedUnaryInvariant this, OutputFormat format) {
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: " + var().name();
  }

  /**
   * Ignore conditions when using ppt as keys
   */
  private String get_ppt_key(String ppt_name) {
    String res = ppt_name;
    if (res.contains(";condition")) {
      return res.split(";condition")[0];
    }
    return res;
  }

  @Override
  public InvariantStatus check_modified(long v, int count) {
    // Recover the object
    int i = (int) v;
    String key = i+"-"+get_ppt_key(ppt.parent.name);

    // Check if already evaluated
    if (cached_evaluations.containsKey(key))
      return cached_evaluations.get(key);

    // Evaluate the key
    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null) {
      // First check if the fuzzed spec can be instantiated from the object type
      // This check is done here since it may be the case that the given hashcode i
      // corresponds to an object of an invalid type for the current fuzzed_spec
      String type_str = var().type.toString();
      String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();

      if (!ExpressionEvaluator.is_valid(fuzzed_spec,class_name)) {
        cached_evaluations.put(key, InvariantStatus.FALSIFIED);
        return InvariantStatus.FALSIFIED;
      } else {
        cached_evaluations.put(key, InvariantStatus.NO_CHANGE);
        return InvariantStatus.NO_CHANGE;
      }
    }

    try {
      boolean qt_discard_anyways = false;
      for (PptTupleInfo tuple : l) {
        // The unary invariant is only evaluated on the this object of the tuple
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject());
        if (!b) {
          cached_evaluations.put(key, InvariantStatus.FALSIFIED);
          return InvariantStatus.FALSIFIED;
        }
        //if (represents_quantified && qt_discard_anyways) {
        //qt_discard_anyways = QuantifiedExpressionEvaluator.last_set_size==0;
        //}
      }
      if (represents_quantified && qt_discard_anyways) {
        // Quantified and the set was never evaluated to a non-empty set, should be discarded.
        cached_evaluations.put(key, getDefault());
        return getDefault();
      }
    } catch (NonApplicableExpressionException| NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      cached_evaluations.put(key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    }
    cached_evaluations.put(key, InvariantStatus.NO_CHANGE);
    return InvariantStatus.NO_CHANGE;
  }

  private InvariantStatus getDefault() {
    if (InvariantChecker.serialiazed_objects_file_name!=null)
      return InvariantStatus.NO_CHANGE;
    else
      return InvariantStatus.FALSIFIED;
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
    assert other instanceof FuzzedUnaryInvariant;
    FuzzedUnaryInvariant fuzzed_inv = (FuzzedUnaryInvariant) other;
    assert (fuzzed_inv.fuzzed_spec != null);
    return fuzzed_spec.equals(fuzzed_inv.fuzzed_spec);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof FuzzedUnaryInvariant))
      return false;
    return isSameFormula((FuzzedUnaryInvariant)other);
  }

  /**
   * Eval this invariant on every instance saved for the given ppt
   */
  public boolean eval_on_all_instances_ppt(String ppt_name) {
    List<PptTupleInfo> tuples = ObjectsLoader.get_tuples_that_match_ppt(ppt_name);
    for (PptTupleInfo tuple : tuples) {
      // The unary invariant is only evaluated on the this object of the tuple
      try {
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject());
        if (!b) {
          return false;
        }
      } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
        return false;
      }
    }
    return true;
  }

}
