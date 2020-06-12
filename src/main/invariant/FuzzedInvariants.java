package invariant;

import daikon.PptSlice;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.OutputFormat;
import daikon.inv.unary.scalar.SingleScalar;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import typequals.prototype.qual.Prototype;


/**
 * Represents a set of invariants generating by fuzzing a grammar
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
//public class FuzzedInvariants extends SingleScalar {
public class FuzzedInvariants extends PointerInvariant {
  
  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20200610L;

  // Variables starting with dkconfig_ should only be set via the
  // daikon.config.Configuration interface.
  /** Boolean. True iff Positive invariants should be considered. */
  public static boolean dkconfig_enabled = Invariant.invariantEnabledDefault;

  ///
  /// Required methods
  ///

  private FuzzedInvariants(PptSlice ppt) {
    super(ppt);
  }

  private @Prototype FuzzedInvariants() {
    super();
  }

  private static @Prototype FuzzedInvariants proto = new @Prototype FuzzedInvariants();

  /** Returns the prototype invariant. */
  public static @Prototype FuzzedInvariants get_proto() {
    return proto;
  }

  /** returns whether or not this invariant is enabled */
  @Override
  public boolean enabled() {
    return dkconfig_enabled;
  }

  /** instantiate an invariant on the specified slice */
  @Override
  public FuzzedInvariants instantiate_dyn(@Prototype FuzzedInvariants this, PptSlice slice) {
    return new FuzzedInvariants(slice);
  }

  // A printed representation for user output
  @SideEffectFree
  @Override
  public String format_using(@GuardSatisfied FuzzedInvariants this, OutputFormat format) {
    return "FuzzedInvariants holds for: " + var().name();
  }

  @Override
  //public InvariantStatus check_modified(long v, int count) {
  public InvariantStatus check_modified(Object v, int count) {  
    System.out.println(v == null? "is null":v.getClass().getSimpleName());
    System.out.println(v == null? "":v.toString());
    //System.out.println("Hey! This is the FuzzedInvariants being evaluated");
    //if (v <= 0) {
    //  return InvariantStatus.FALSIFIED;
    //}
    return InvariantStatus.NO_CHANGE;
  }

  @Override
  //public InvariantStatus add_modified(long v, int count) {
  public InvariantStatus add_modified(Object v, int count) {  
    return check_modified(v, count);
  }

  @Override
  protected double computeConfidence() {
    // Assume that every variable has a .5 chance of being positive by
    // chance.  Then a set of n values have a have (.5)^n chance of all
    // being positive by chance.
    return 1 - Math.pow(.5, ppt.num_samples());
  }

  @Pure
  @Override
  public boolean isSameFormula(Invariant other) {
    assert other instanceof FuzzedInvariants;
    return true;
  }
}

