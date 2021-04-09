package invariant;

import daikon.Daikon;
import daikon.PptSlice;
import daikon.PptSlice2;
import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import daikon.tools.InvariantChecker;
import expression.ExpressionEvaluator;
import expression.NonApplicableExpressionException;
import expression.NonEvaluableExpressionException;
import expression.QuantifiedExpressionEvaluator;
import fuzzer.BasicFuzzer;
import fuzzer.GrammarBasedFuzzer;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.Prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  // Represents quantified expr
  private boolean represents_quantified = false;

  // Grammar-Based Fuzzer
  private GrammarBasedFuzzer fuzzer;

  // Cache of already evaluated hashcode-ppt pairs.
  private Map<String, InvariantStatus> cached_evaluations = new HashMap<>();

  ///
  /// Required methods
  ///
  private FuzzedBinaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
    represents_quantified = FuzzedInvariantUtil.is_quantified(fuzzed_spec);
  }

  private @Prototype FuzzedBinaryInvariant() {
    super();
    get_fuzzed_spec();
  }

  private @Prototype FuzzedBinaryInvariant(String spec) {
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
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: <" + var1().name() + " , " + var2().name() + ">";
  }

  /**
   * Return the value that represents the object
   */
  private long getObject(long v1, long v2) {
    if (var1().file_rep_type.isObject())
      return v1;
    else
      return v2;
  }

  /**
   * Return the class name that represents the object
   */
  private String getClassOfObject() {
    if (var1().file_rep_type.isObject())
      return var1().type.toString();
    else
      return var2().type.toString();
  }

  /**
   * Return the value being compared with the object
   */
  private Object getValueForVariable(PptTupleInfo tuple, VarInfo var) {
    String var_name = var.name();
    Object varValue;
    if (var_name.startsWith("this")) {
      // Represents a field that can be obtained from the this object.
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace("this", tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else if (var_name.startsWith(tuple.getThisObject().getClass().getCanonicalName()) &&
              !var_name.contains("$")) {
      // Represents a static field
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace(tuple.getThisObject().getClass().getCanonicalName(), tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else {
      varValue = tuple.getVariableValue(var_name);
    }
    return varValue;
  }

  /**
   * Return the VarInfo corresponding to the variable  being compared with the object
   */
  private VarInfo getVariable(PptSlice2 ppt_slice2) {
    if (ppt_slice2.var_infos[0].file_rep_type.isPrimitive())
      return ppt_slice2.var_infos[0];
    else
      return ppt_slice2.var_infos[1];
  }

  // Default status for situations in which the invariant can't be evaluated.
  // Should be FALSIFIED when inferring invariants, i.e, when using Daikon.
  // Should be NO_CHANGE when filtering invariants, i.e, when using InvariantChecker
  private InvariantStatus default_status = InvariantStatus.FALSIFIED;

  @Override
  public InvariantStatus check_modified(long v1, long v2, int count) {
    // Recover the object
    int i = (int) getObject(v1, v2);
    String key = i+"-"+ppt.parent.name;
    VarInfo curr_var = getVariable((PptSlice2)this.ppt);
    String cached_key = key+curr_var.name();

    // Check if already evaluated
    if (cached_evaluations.containsKey(cached_key))
      return cached_evaluations.get(cached_key);

    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null) {
      // First check if the fuzzed spec can be instantiated from the object type
      // This check is done here since it may be the case that the given hashcode i
      // corresponds to an object of an invalid type for the current fuzzed_spec
      String type_str = getClassOfObject();
      String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();

      if (!ExpressionEvaluator.is_valid(fuzzed_spec,class_name)) {
        cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
        return InvariantStatus.FALSIFIED;
      } else {
        cached_evaluations.put(cached_key, InvariantStatus.NO_CHANGE);
        return InvariantStatus.NO_CHANGE;
      }
    }

    try {
      // Evaluate
      boolean qt_discard_anyways = true;
      for (PptTupleInfo tuple : l) {
        Object varValue = getValueForVariable(tuple, curr_var);
        if (varValue==null) {
          cached_evaluations.put(cached_key, getDefault());
          return getDefault();
        }
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject(), varValue);
        if (!b) {
          cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
          return InvariantStatus.FALSIFIED;
        }
        if (represents_quantified && qt_discard_anyways) {
          qt_discard_anyways = QuantifiedExpressionEvaluator.last_set_size==0;
        }
      }
      if (represents_quantified && qt_discard_anyways) {
        // Quantified and the set was never evaluated to a non-empty set, should be discarded.
        cached_evaluations.put(cached_key, getDefault());
        return getDefault();
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    }
    cached_evaluations.put(cached_key, InvariantStatus.NO_CHANGE);
    return InvariantStatus.NO_CHANGE;
  }

  private InvariantStatus getDefault() {
    if (InvariantChecker.serialiazed_objects_file_name!=null)
      return InvariantStatus.NO_CHANGE;
    else
      return InvariantStatus.FALSIFIED;
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

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof FuzzedBinaryInvariant))
      return false;
    return isSameFormula((FuzzedBinaryInvariant)other);
  }

  /**
   * Eval this invariant on every instance saved for the given ppt
   */
  public boolean eval_on_all_instances_ppt(PptSlice ppt) {
    assert ppt.name().contains(":::ENTER");
    String ppt_name = ppt.name().split(":::ENTER")[0];
    List<PptTupleInfo> tuples = ObjectsLoader.get_tuples_that_match_ppt(ppt_name);
    try {
      for (PptTupleInfo tuple : tuples) {
        // The unary invariant is only evaluated on the this object of the tuple
        Object varValue = getValueForVariable(tuple,getVariable((PptSlice2) ppt));
        if (varValue==null)
          return false;
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject(), varValue);
        if (!b)
          return false;
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      return false;
    }
    return true;
  }

}
