package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import daikon.tools.InvariantChecker;
import expression.ExpressionEvaluator;
import expression.ExpressionValidator;
import expression.NonApplicableExpressionException;
import expression.NonEvaluableExpressionException;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.Prototype;
import utils.JavaTypesUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a candidate ternary invariant which is obtained by fuzzing a grammar
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FuzzedTernaryInvariant extends CombinedTernaryInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization. If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20210513L;

  // Variables starting with dkconfig_ should only be set via the
  // daikon.config.Configuration interface.
  /** Boolean. True iff Positive invariants should be considered. */
  public static boolean dkconfig_enabled = Invariant.invariantEnabledDefault;

  // Fuzzed spec represented by this invariant
  private String fuzzed_spec;

  // Cache of already evaluated hashcode-ppt pairs.
  private Map<String, InvariantStatus> cached_evaluations = new HashMap<>();

  ///
  /// Required methods
  ///
  private FuzzedTernaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
  }

  private @Prototype FuzzedTernaryInvariant() {
    super();
  }

  private @Prototype FuzzedTernaryInvariant(String spec) {
    super();
    fuzzed_spec = spec;
    System.out.println("Fuzzed spec: " + fuzzed_spec);
  }

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedTernaryInvariant get_proto() {
    return new @Prototype FuzzedTernaryInvariant();
  }

  public static @Prototype FuzzedTernaryInvariant get_proto_from_spec(String spec) {
    return new @Prototype FuzzedTernaryInvariant(spec);
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedTernaryInvariant instantiate_dyn(@Prototype FuzzedTernaryInvariant this, PptSlice slice) {
    return new FuzzedTernaryInvariant(slice, fuzzed_spec);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedTernaryInvariant this, OutputFormat format) {
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: <" + var1().name() + " , " + var2().name() + " , " + var3().name() + ">";
  }

  @Override
  public boolean extra_check(VarInfo[] vis) {
    String type_str = vis[0].type.toString();
    String class_name_one = type_str;
    if (!JavaTypesUtil.is_collection(type_str))
      class_name_one = JavaTypesUtil.get_simple_name(type_str);
    type_str = vis[1].type.toString();
    String class_name_two = JavaTypesUtil.get_simple_name(type_str);
    type_str = vis[2].type.toString();
    String class_name_three = JavaTypesUtil.get_simple_name(type_str);
    return ExpressionValidator.is_valid(fuzzed_spec, class_name_one, class_name_two, class_name_three);
  }

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
   * Returns true iff one of the current variables is an object
   */
  private boolean object_present() {
    return var1().file_rep_type.isObject() || var2().file_rep_type.isObject() || var3().file_rep_type.isObject();
  }

  /**
   * Returns true iff the current variable is the this object
   */
  private boolean object_present_is_this() {
    return "this".equals(var1().name()) || "this".equals(var2().name()) || "this".equals(var3().name());
  }

  /**
   * Return the value that represents the object
   */
  private long getObject(long v1, long v2, long v3) {
    if (var1().file_rep_type.isObject())
      return v1;
    if (var2().file_rep_type.isObject())
      return v2;
    if (var3().file_rep_type.isObject())
      return v3;
    throw new IllegalStateException("Trying the get the object but the invariant has no object");
  }

  /**
   * Return the VarInfo corresponding to the variable  being compared with the object
   */
  private VarInfo[] get_variables() {
    VarInfo[] vars = new VarInfo[2];
    if (var1().file_rep_type.isObject()) {
      vars[0] = var2();
      vars[1] = var3();
    } else if (var2().file_rep_type.isObject()) {
      vars[0] = var1();
      vars[1] = var3();
    } else {
      vars[0] = var1();
      vars[1] = var2();
    }
    return vars;
  }

  /**
   * Return the class name that represents the object
   */
  private String getClassOfObject() {
    if (var1().file_rep_type.isObject())
      return var1().type.toString();
    else if (var2().file_rep_type.isObject())
      return var2().type.toString();
    else
      return var3().type.toString();
  }

  /**
   * Evaluate the current fuzzed spec on the given variable values
   */
  private InvariantStatus check_modified_on_vars(Object value1,Object value2, Object value3) {
    try {
      if (!ExpressionEvaluator.eval(fuzzed_spec, value1, value2, value3))
        return InvariantStatus.FALSIFIED;
      else
        return InvariantStatus.NO_CHANGE;
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      return InvariantStatus.FALSIFIED;
    }
  }

  /**
   * Evaluate the fuzzed spec on the given tuples list
   */
  private InvariantStatus check_modified_on_tuples(List<PptTupleInfo> list,VarInfo[] curr_vars, String cached_key) {
    try {
      // Evaluate
      for (PptTupleInfo tuple : list) {
        Object var_value_one = FuzzedInvariantUtil.get_value_for_variable(tuple, curr_vars[0]);
        Object var_value_two = FuzzedInvariantUtil.get_value_for_variable(tuple, curr_vars[1]);
        if (var_value_one == null || var_value_two == null) {
          cached_evaluations.put(cached_key, getDefault());
          return getDefault();
        }
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject(), var_value_one, var_value_two);
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
  public InvariantStatus check_modified(long v1, long v2, long v3, int count) {
    // If there is no object among variables, evaluate directly on v1 and v2
    if (!object_present())
      return check_modified_on_vars(FuzzedInvariantUtil.get_var_value(fuzzed_spec, v1, 0), FuzzedInvariantUtil.get_var_value(fuzzed_spec, v2, 1), FuzzedInvariantUtil.get_var_value(fuzzed_spec, v3, 2));

    // If the object present is not the this object, one of the inputs must represent a collection
    if (!object_present_is_this())
      throw new IllegalArgumentException("Dont know how to evaluate this yet");

    // Recover the object and build keys
    int i = (int) getObject(v1, v2, v3);
    String key = i+"-"+get_ppt_key(ppt.parent.name);
    VarInfo[] curr_vars = get_variables();
    String cached_key = key+curr_vars[0].name()+curr_vars[1].name();

    // Check if already evaluated
    if (cached_evaluations.containsKey(cached_key))
      return cached_evaluations.get(cached_key);

    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null)
      return FuzzedInvariantUtil.handle_missing_key(cached_evaluations, fuzzed_spec, cached_key, getClassOfObject());

    return check_modified_on_tuples(l, curr_vars, cached_key);
  }

  @Override
  public InvariantStatus add_modified(long v1, long v2, long v3, int count) {
    return check_modified(v1, v2, v3, count);
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
    assert invariant instanceof FuzzedTernaryInvariant;
    FuzzedTernaryInvariant fuzzed_inv = (FuzzedTernaryInvariant) invariant;
    assert (fuzzed_inv.fuzzed_spec != null);
    return fuzzed_spec.equals(fuzzed_inv.fuzzed_spec);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof FuzzedTernaryInvariant))
      return false;
    return isSameFormula((FuzzedTernaryInvariant)other);
  }

  private InvariantStatus getDefault() {
    if (InvariantChecker.serialiazed_objects_file_name!=null)
      return InvariantStatus.NO_CHANGE;
    else
      return InvariantStatus.FALSIFIED;
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
        Object o1;
        Object o2;
        Object o3;
        if (object_present() && object_present_is_this()) {
          // The first must be the this object, and the rest variables
          o1 = tuple.getThisObject();
          VarInfo[] curr_vars = get_variables();
          o2 = FuzzedInvariantUtil.get_value_for_variable(tuple, curr_vars[0]);
          o3 = FuzzedInvariantUtil.get_value_for_variable(tuple, curr_vars[1]);
          if (o2==null || o3==null) return false;
        } else {
          // All are vars
          o1 = FuzzedInvariantUtil.get_value_for_variable(tuple,var1());
          o2 = FuzzedInvariantUtil.get_value_for_variable(tuple,var2());
          o3 = FuzzedInvariantUtil.get_value_for_variable(tuple,var3());
          if (object_present()) {
            // o1 is a collection, null is allowed for o1
            if (o1 == null) continue;
            if (o2 == null || o3==null) return false;
          }  else // All are vars, none of them should be null
            if (o1==null || o2 == null || o3==null) return false;
        }
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, o1, o2, o3);
        if (!b)
          return false;
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      return false;
    }
    return true;
  }

}
