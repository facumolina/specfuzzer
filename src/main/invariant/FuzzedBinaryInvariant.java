package invariant;

import daikon.Daikon;
import daikon.PptSlice;
import daikon.PptSlice2;
import daikon.chicory.PptTupleInfo;
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
  private Object getValueForVariable(PptTupleInfo tuple, String var_name) {
    Object varValue;
    if (var_name.startsWith("this")) {
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace("this", tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else if (var_name.startsWith(tuple.getThisObject().getClass().getCanonicalName())) {
      varValue = ExpressionEvaluator.evalAnyExpr(var_name.replace(tuple.getThisObject().getClass().getCanonicalName(), tuple.getThisObject().getClass().getSimpleName()), tuple.getThisObject());
    } else {
      varValue = tuple.getVariableValue(var_name);
    }
    return varValue;
  }

  /**
   * Return the name of the variable being compared with the object
   */
  private String getVariableName(PptSlice2 ppt_slice2) {
    if (ppt_slice2.var_infos[0].file_rep_type.isPrimitive())
      return ppt_slice2.var_infos[0].name();
    else
      return ppt_slice2.var_infos[1].name();
  }

  @Override
  public InvariantStatus check_modified(long v1, long v2, int count) {
    // Recover the object
    int i = (int) getObject(v1, v2);
    String key = i+"-"+ppt.parent.name;
    List<PptTupleInfo> l = ObjectsLoader.get_object(key);
    if (l == null) {
      // First check if the fuzzed spec can be instantiated from the object type
      // This check is done here since it may be the case that the given hashcode i
      // corresponds to an object of an invalid type for the current fuzzed_spec
      String type_str = getClassOfObject();
      String class_name = type_str.substring(type_str.lastIndexOf('.') + 1).trim();
      if (!ExpressionEvaluator.is_valid(fuzzed_spec,class_name))
        return InvariantStatus.FALSIFIED;

      return InvariantStatus.NO_CHANGE;
    }
    try {
      for (PptTupleInfo tuple : l) {
        Object varValue = getValueForVariable(tuple,getVariableName((PptSlice2) this.ppt));
        if (varValue==null)
          return InvariantStatus.FALSIFIED;

        boolean b = ExpressionEvaluator.eval(fuzzed_spec, tuple.getThisObject(), varValue);
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
        String variable_name = getVariableName((PptSlice2) ppt);
        Object varValue = getValueForVariable(tuple,variable_name);
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
