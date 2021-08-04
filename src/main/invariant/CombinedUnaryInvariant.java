package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.inv.InvariantStatus;
import daikon.inv.unary.UnaryInvariant;
import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import typequals.prototype.qual.Prototype;
import utils.VarInfoUtil;

/**
 * Abstract base class for combined unary invariants. A CombinedUnaryInvariant may represent:
 * - a unary invariant over one object (pointer) variable, such as {@code x != null}.
 * - a unary invariant over a primitive variable, such as {@code i > 0}
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class CombinedUnaryInvariant extends UnaryInvariant {
  
  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20200612L;

  protected CombinedUnaryInvariant(PptSlice ppt) {
    super(ppt);
  }

  protected @Prototype CombinedUnaryInvariant() {
    super();
  }

  public VarInfo var(@GuardSatisfied @UnknownInitialization(CombinedUnaryInvariant.class)CombinedUnaryInvariant this) {
    return ppt.var_infos[0];
  }

  /**
   * Returns whether or not the specified types are valid for unary object. (Static version of
   * method.)
   */
  public boolean valid_types_static(VarInfo[] vis) {
    // Unary pointer invariants must the this object or a primitive supported type
    if (vis.length!=1)
      return false;

    // Discard serial field
    if (VarInfoUtil.var_is_serial_field(vis[0]))
      return false;

    if (VarInfoUtil.var_is_object(vis[0]))
      return VarInfoUtil.var_is_this_or_collection(vis[0]);

    return VarInfoUtil.var_is_primitive_or_integer(vis[0]);
  }

  /** Returns whether or not the specified types are valid for unary object. */
  @Override
  public final boolean valid_types(VarInfo[] vis) {
    return valid_types_static(vis) && extra_check(vis);
  }

  /** To add extra checking steps for valid types*/
  public abstract boolean extra_check(VarInfo[] vis);

  // Should never be called with modified == ValueTuple.MISSING_NONSENSICAL.
  // Subclasses need not override this except in special cases;
  // just implement @link{add_modified(Object,int)}.
  @Override
  public InvariantStatus add(@Interned Object val, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 2);

    if (val instanceof Long) {
      // Long values represents object hashcode
      long value = ((Long) val);
      return mod_index==0 ? add_unmodified(value, count) : add_modified(value, count);
    }
    if (val instanceof Double) {
      double value = ((Double)val);
      return mod_index==0? add_unmodified(value, count) : add_modified(value, count);
    }
    return InvariantStatus.FALSIFIED;
  }

  @Override
  public InvariantStatus check(@Interned Object val, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 2);
    if (val instanceof Long) {
      // Long values represents object hashcode
      long value = ((Long) val);
      return mod_index == 0 ? check_unmodified(value, count) : check_modified(value, count);
    }
    if (val instanceof Double) {
      double value = ((Double) val);
      return mod_index == 0 ? check_unmodified(value, count) : check_modified(value, count);
    }
    return InvariantStatus.FALSIFIED;
  }

  /**
   * Similar to {@link #check_modified} except that it can change the state of the invariant if
   * necessary. If the invariant doesn't have any state, then the implementation should simply call
   * {@link #check_modified}. This method need not check for falsification; that is done by the
   * caller.
   */
  public abstract InvariantStatus add_modified(long value, int count);
  public abstract InvariantStatus add_modified(double value, int count);

  /** By default, do nothing if the value hasn't been seen yet. Subclasses can override this. */
  public InvariantStatus add_unmodified(long value, int count) {
    return InvariantStatus.NO_CHANGE;
  }
  public InvariantStatus add_unmodified(double value, int count) {
    return InvariantStatus.NO_CHANGE;
  }

  /**
   * Presents a sample to the invariant. Returns whether the sample is consistent with the
   * invariant. Does not change the state of the invariant.
   *
   * @param count how many identical samples were observed in a row. For example, three calls to
   *     check_modified with a count parameter of 1 is equivalent to one call to check_modified with
   *     a count parameter of 3.
   * @return whether or not the sample is consistent with the invariant
   */
  public abstract InvariantStatus check_modified(long value, int count);
  public abstract InvariantStatus check_modified(double value, int count);

  public InvariantStatus check_unmodified(long value, int count) {
    return InvariantStatus.NO_CHANGE;
  }
  public InvariantStatus check_unmodified(double value, int count) {
    return InvariantStatus.NO_CHANGE;
  }

}

