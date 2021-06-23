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
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.Prototype;
import utils.JavaTypesUtil;

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
    String class_name_one = type_str;
    if (!JavaTypesUtil.is_collection(type_str))
      class_name_one = JavaTypesUtil.get_simple_name(type_str);
    type_str = vis[1].type.toString();
    String class_name_two = JavaTypesUtil.get_simple_name(type_str);
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

  /** Returns whether or not the specified var types are valid for IntGreaterThan */
  @Override
  public boolean instantiate_ok(VarInfo[] vis) {
    return valid_types(vis);
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
    return "FuzzedInvariant ( " + fuzzed_spec + " ) holds for: <" + var1().name() + ", " + var2().name() + ">";
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
  private String get_class_of_object() {
    if (var1().file_rep_type.isObject())
      return var1().type.toString();
    else
      return var2().type.toString();
  }

  /**
   * Return the VarInfo corresponding to the variable being compared with the object
   */
  private VarInfo get_variable(PptSlice2 ppt_slice2) {
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
   * Returns true iff one of the current variables is an object
   */
  private boolean object_present(VarInfo v1, VarInfo v2) {
    return v1.file_rep_type.isObject() || v2.file_rep_type.isObject();
  }

  /**
   * Returns true iff one of the current variables is the this object
   */
  private boolean object_present_is_this(VarInfo v1,VarInfo v2) {
    return "this".equals(v1.name()) || "this".equals(v2.name()) || "orig(this)".equals(v1.name()) || "orig(this)".equals(v2.name());
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
   * Evaluate the current fuzzed spec on the given vars where one of them represents a collection
   */
  private InvariantStatus check_modified_on_collection_and_var() {
    VarInfo collection_var = var1().file_rep_type.isObject()?var1():var2();
    VarInfo primitive_var = var1().file_rep_type.isObject()?var2():var1();
    String ppt_key = get_ppt_key(ppt.parent.name);
    String cached_key = "collection-"+ppt_key;

    // Check if already evaluated
    if (cached_evaluations.containsKey(cached_key))
      return cached_evaluations.get(cached_key);

    List<PptTupleInfo> tuples = ObjectsLoader.get_tuples_that_match_ppt(ppt_key);
    try {
      // Evaluate
      boolean at_least_one_eval=false;
      for (PptTupleInfo tuple : tuples) {
        Object primitive_var_value = FuzzedInvariantUtil.get_value_for_variable(tuple, primitive_var);
        Object collection_var_value = FuzzedInvariantUtil.get_value_for_variable(tuple, collection_var);
        if (primitive_var_value!=null && collection_var_value!=null) {
          // Both vars are not null
          at_least_one_eval = true;
          boolean b = ExpressionEvaluator.eval(fuzzed_spec, collection_var_value, primitive_var_value);
          if (!b) {
            cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
            return InvariantStatus.FALSIFIED;
          }
        }
      }
      if (!at_least_one_eval) {
        // Never evaluated, thus it should be falsified
        cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
        return InvariantStatus.FALSIFIED;
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      cached_evaluations.put(cached_key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    }
    cached_evaluations.put(cached_key, InvariantStatus.NO_CHANGE);
    return InvariantStatus.NO_CHANGE;
  }

  /**
   * Evaluate the fuzzed spec on the given tuples list
   */
  private InvariantStatus check_modified_on_tuples(List<PptTupleInfo> list,VarInfo curr_var, String cached_key) {
    try {
      // Evaluate
      for (PptTupleInfo tuple : list) {
        Object varValue = FuzzedInvariantUtil.get_value_for_variable(tuple, curr_var);
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
    if (!object_present(var1(),var2()))
      return check_modified_on_vars(FuzzedInvariantUtil.get_var_value(fuzzed_spec, v1, 0), FuzzedInvariantUtil.get_var_value(fuzzed_spec, v2, 1));


    // If the object present is not the this object, one of v1 and v2 must represent a collection
    if (!object_present_is_this(var1(), var2()))
      return check_modified_on_collection_and_var();

    // Recover the object and build keys
    int i = (int) getObject(v1, v2);
    String key = i+"-"+get_ppt_key(ppt.parent.name);
    VarInfo curr_var = get_variable((PptSlice2)this.ppt);
    String cached_key = key+curr_var.name();

    // Check if already evaluated
    if (cached_evaluations.containsKey(cached_key))
      return cached_evaluations.get(cached_key);

    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null)
      return FuzzedInvariantUtil.handle_missing_key(cached_evaluations, fuzzed_spec, cached_key, get_class_of_object());

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
    String ppt_name = FuzzedInvariantUtil.get_ppt_name_prefix(ppt.name());
    List<PptTupleInfo> tuples = ObjectsLoader.get_tuples_that_match_ppt(ppt_name);
    try {
      VarInfo[] sorted_vars = FuzzedInvariantUtil.sort_lexicographically(ppt.var_infos);
      VarInfo v1 = sorted_vars[0];
      VarInfo v2 = sorted_vars[1];
      for (PptTupleInfo tuple : tuples) {
        Object o1;
        Object o2;
        if (object_present(v1, v2) && object_present_is_this(v1, v2)) {
          // The first must be the this object, and the second the variable
          o1 = tuple.getThisObject();
          o2 = FuzzedInvariantUtil.get_value_for_variable(tuple, v1.file_rep_type.isPrimitive()?v1:v2);
          if (o2==null) return false;
        } else {
          // Both are vars
          o1 = FuzzedInvariantUtil.get_value_for_variable(tuple,v1);
          o2 = FuzzedInvariantUtil.get_value_for_variable(tuple,v2);
          if (object_present(v1, v2)) {
            // o1 is a collection, null is allowed for o1
            if (o1 == null) continue;
            if (o2 == null) return false;
          }  else // Both are vars, none of them should be null
            if (o1==null || o2 == null) return false;
        }
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, o1, o2);
        if (!b)
          return false;
      }
    } catch (NonApplicableExpressionException | NonEvaluableExpressionException ex) {
      return false;
    }
    return true;
  }

}
