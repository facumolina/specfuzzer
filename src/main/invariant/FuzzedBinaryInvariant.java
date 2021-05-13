package invariant;

import daikon.PptSlice;
import daikon.PptSlice2;
import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import daikon.tools.InvariantChecker;
import expression.*;
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
public class FuzzedBinaryInvariant extends CombinedBinaryInvariant {

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

  // Cache of already evaluated hashcode-ppt pairs.
  private Map<String, InvariantStatus> cached_evaluations = new HashMap<>();

  ///
  /// Required methods
  ///
  private FuzzedBinaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
  }

  private @Prototype FuzzedBinaryInvariant() {
    super();
  }

  private @Prototype FuzzedBinaryInvariant(String spec) {
    super();
    fuzzed_spec = spec;
    System.out.println("Fuzzed spec: " + fuzzed_spec);
  }

  @Override
  public boolean extra_check(VarInfo[] vis) {
    String type_str = vis[0].type.toString();
    String class_name_one = type_str.substring(type_str.lastIndexOf('.') + 1).trim();
    type_str = vis[1].type.toString();
    String class_name_two = type_str.substring(type_str.lastIndexOf('.') + 1).trim();
    return ExpressionValidator.is_valid(fuzzed_spec, class_name_one, class_name_two);
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
      if (var.isDerivedParam() && var_name.contains("orig")) {
        var_name = var_name.replace("orig(",""); // Remove orig(
        var_name  = var_name.substring(0, var_name.length() - 1); // Remove )
      }
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

  /**
   * Ignore conditions when using ppt as keys
   */
  private String get_ppt_key(String ppt_name) {
    if (ppt_name.contains(";condition")) {
      return ppt_name.split(";condition")[0];
    }
    return ppt_name;
  }

  /**
   * Returns true iff one of the current variables is the this object
   */
  private boolean object_present() {
    return "this".equals(var1().name()) || "this".equals(var2().name());
  }

  /**
   * Get the variable value in the type expected by the expression
   */
  private Object get_var_value(long v, int n) {
    List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, Object.class);
    Class<?> clazz = FuzzedInvariantUtil.get_class_for_variable(vars.get(n));
    if (Integer.class.isAssignableFrom(clazz))
      return (int)v;
    throw new IllegalArgumentException("Unexpected variable type: "+clazz.getSimpleName()+" with value "+v);
  }

  /**
   * Evaluate the current fuzzed spec on the given variable values
   */
  private InvariantStatus check_modified_on_vars(Object value1,Object value2) {
    try {
      if (!ExpressionEvaluator.eval(fuzzed_spec, value1, value2))
        return InvariantStatus.FALSIFIED;
      else
        return InvariantStatus.NO_CHANGE;
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      return InvariantStatus.FALSIFIED;
    }
  }

  /**
   * Handle missing key
   */
  private InvariantStatus handle_missing_key(String cached_key) {
    // First check if the fuzzed spec can be instantiated from the object type
    // This check is done here since it may be the case that the given hashcode i
    // corresponds to an object of an invalid type for the current fuzzed_spec
    String type_str = getClassOfObject();
    String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();

    if (!ExpressionValidator.is_valid(fuzzed_spec,class_name)) {
      cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    } else {
      cached_evaluations.put(cached_key, InvariantStatus.NO_CHANGE);
      return InvariantStatus.NO_CHANGE;
    }
  }

  /**
   * Evaluate the fuzzed spec on the given tuples list
   */
  private InvariantStatus check_modified_on_tuples(List<PptTupleInfo> list,VarInfo curr_var, String cached_key) {
    try {
      // Evaluate
      for (PptTupleInfo tuple : list) {
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
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    }
    cached_evaluations.put(cached_key, InvariantStatus.NO_CHANGE);
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  public InvariantStatus check_modified(long v1, long v2, int count) {
    // If there is no object among variables, evaluate directly on v1 and v2
    if (!object_present())
      return check_modified_on_vars(get_var_value(v1, 0), get_var_value(v2, 1));

    // Recover the object and build keys
    int i = (int) getObject(v1, v2);
    String key = i+"-"+get_ppt_key(ppt.parent.name);
    VarInfo curr_var = getVariable((PptSlice2)this.ppt);
    String cached_key = key+curr_var.name();

    // Check if already evaluated
    if (cached_evaluations.containsKey(cached_key))
      return cached_evaluations.get(cached_key);

    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null)
      return handle_missing_key(cached_key);

    return check_modified_on_tuples(l, curr_var, cached_key);
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
