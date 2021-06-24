package invariant;

import daikon.VarInfo;
import daikon.chicory.PptTupleInfo;
import daikon.tools.InvariantChecker;
import expression.*;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import typequals.prototype.qual.Prototype;
import utils.JavaTypesUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a candidate invariant over one variable which is obtained by fuzzing a grammar
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class FuzzedUnaryInvariant extends CombinedUnaryInvariant {

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

  // Cache of already evaluated hashcode-ppt pairs.
  private Map<String, InvariantStatus> cached_evaluations = new HashMap<>();

  ///
  /// Required methods
  ///
  private FuzzedUnaryInvariant(PptSlice ppt, String spec) {
    super(ppt);
    fuzzed_spec = spec;
  }

  private @Prototype FuzzedUnaryInvariant() {
    super();
  }

  private @Prototype FuzzedUnaryInvariant(String spec) {
    super();
    fuzzed_spec = spec;
    System.out.println("Fuzzed spec: " + fuzzed_spec);
  }

  @Override
  public boolean extra_check(VarInfo[] vis) {
    String type_str = vis[0].type.toString();
    String class_name = type_str;
    if (!JavaTypesUtil.is_collection(type_str))
      class_name = JavaTypesUtil.get_simple_name(type_str);
    return ExpressionValidator.is_valid(fuzzed_spec, class_name);
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
    if (ppt_name.contains(";condition")) {
      return ppt_name.split(";condition")[0];
    }
    return ppt_name;
  }

  /**
   * Get the variable value in the type expected by the expression
   */
  private Object get_var_value(long v) {
    List<String> vars = FuzzedInvariantUtil.get_vars(fuzzed_spec, Object.class);
    Class<?> clazz = FuzzedInvariantUtil.get_class_for_variable(vars.get(0));
    if (Integer.class.isAssignableFrom(clazz))
      return (int) v;
    throw new IllegalArgumentException("Unexpected variable type: " + clazz.getSimpleName() + " with value " + v);
  }

  /**
   * Evaluate the current fuzzed spec on the given variable value
   */
  private InvariantStatus check_modified_on_vars(Object value1) {
    try {
      if (!ExpressionEvaluator.eval(fuzzed_spec, value1))
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
  private InvariantStatus check_modified_on_tuples(List<PptTupleInfo> list, String key) {
    try {
      for (PptTupleInfo tuple : list) {
        // The unary invariant is only evaluated on the this object of the tuple
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject());
        if (!b) {
          cached_evaluations.put(key, InvariantStatus.FALSIFIED);
          return InvariantStatus.FALSIFIED;
        }
      }
    } catch (NonApplicableExpressionException| NonEvaluableExpressionException ex) {
      // The fuzzed spec can't be applied to the type of o, assume that is falsified
      cached_evaluations.put(key, InvariantStatus.FALSIFIED);
      return InvariantStatus.FALSIFIED;
    }
    cached_evaluations.put(key, InvariantStatus.NO_CHANGE);
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  public InvariantStatus check_modified(long v, int count) {
    // When the var is not an object, it can be evaluated directly on v
    if (!FuzzedInvariantUtil.var_is_object(var()))
      return check_modified_on_vars(get_var_value(v));

    if (!FuzzedInvariantUtil.var_is_this_object(var()))
      throw new IllegalStateException("Need to implement single collection evaluation, spec: " + format());

    // Recover the object and build key
    int i = (int) v;
    String key = i+"-"+get_ppt_key(ppt.parent.name);

    // Check if already evaluated
    if (cached_evaluations.containsKey(key))
      return cached_evaluations.get(key);

    // Evaluate the key
    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null)
      return FuzzedInvariantUtil.handle_missing_key(cached_evaluations, fuzzed_spec, key, var().type.toString());

    return check_modified_on_tuples(l, key);
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

    // The formula should be the same.
    FuzzedUnaryInvariant unary = (FuzzedUnaryInvariant) other;
    if (!isSameFormula(unary))
      return false;

    // The variables should be the same.
    if (ppt!=null && unary.ppt!=null) {
      return ppt.var_infos[0].name().equals(unary.ppt.var_infos[0].name());
    } else {
      return ppt==null && unary.ppt==null;
    }
  }

  /**
   * Eval this invariant on every instance saved for the given ppt
   */
  public boolean eval_on_all_instances_ppt(PptSlice ppt) {
    String ppt_name = FuzzedInvariantUtil.get_ppt_name_prefix(ppt.name());
    List<PptTupleInfo> tuples = ObjectsLoader.get_tuples_that_match_ppt(ppt_name);
    VarInfo var = ppt.var_infos[0];
    for (PptTupleInfo tuple : tuples) {
      // The unary invariant is only evaluated on the this object of the tuple
      try {
        Object o1;
        if (FuzzedInvariantUtil.var_is_object(var)) {
          if (!FuzzedInvariantUtil.var_is_this_object(var)) {
            throw new IllegalArgumentException("Do not know how to get var: "+var.name());
          }
          o1 = tuple.getThisObject();
        } else {
          o1 = FuzzedInvariantUtil.get_value_for_variable(tuple, var);
          if (o1==null) return false;
        }
        boolean b = ExpressionEvaluator.eval(fuzzed_spec, o1);
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
