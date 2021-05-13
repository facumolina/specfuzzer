package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.inv.InvariantStatus;
import daikon.inv.binary.BinaryInvariant;
import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import typequals.prototype.qual.Prototype;

/**
 * Abstract base class for combined binary invariants. A CombinedBinaryInvariant may represent:
 * - a binary invariant over an object and a variable of a basic type (boolean, float, int), such as {@code x.value > i}
 * - a binary invariant over two variables of a basic type, such as {@code i > j}
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class CombinedBinaryInvariant extends BinaryInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 20210124L;

  protected CombinedBinaryInvariant(PptSlice ppt) { super(ppt); }

  protected @Prototype CombinedBinaryInvariant() { super(); }

  public boolean valid_types_static(VarInfo[] vis) {
    if (vis.length != 2)
      return false;

    // Discard serial field
    if (vis[0].name().contains("serialVersionUID") || vis[1].name().contains("serialVersionUID"))
      return false;

    if (vis[0].file_rep_type.isObject() || vis[1].file_rep_type.isObject()) {
      // At least one var is an object
      return  ((vis[0].file_rep_type.isObject() && vis[1].file_rep_type.isPrimitive() && "this".equals(vis[0].name()))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isObject() && "this".equals(vis[1].name())));
    } else {
      // Both vars must be primitive
      return vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive();
    }
  }

  @Override
  public final boolean valid_types(VarInfo[] vis) {
    return valid_types_static(vis) && extra_check(vis);
  }

  /** To add extra checking steps for valid types*/
  public abstract boolean extra_check(VarInfo[] vis);

  /** Returns whether or not the variable order is currently swapped for this invariant. */
  @Override
  public boolean get_swap() {
    return false;
  }

  /**
   * Returns the first variable. This is the only mechanism by which subclasses should access
   * variables.
   */
  public VarInfo var1(@GuardSatisfied CombinedBinaryInvariant this) {
    return ppt.var_infos[0];
  }

  /**
   * Returns the first variable. This is the only mechanism by which subclasses should access
   * variables.
   */
  public VarInfo var2(@GuardSatisfied CombinedBinaryInvariant this) {
    return ppt.var_infos[1];
  }

  @Override
  public InvariantStatus check(@Interned Object val1, @Interned Object val2, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 4);
    if (val1 instanceof  Long && val2 instanceof Long) {
      // Both values have to be instance of Long
      long v1 = ((Long) val1);
      long v2 = ((Long) val2);
      if (mod_index == 0) {
        return check_unmodified(v1, v2, count);
      } else {
        return check_modified(v1, v2, count);
      }
    }
    return InvariantStatus.FALSIFIED;
  }

  @Override
  public InvariantStatus add(
          @Interned Object val1, @Interned Object val2, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 4);
    if (val1 instanceof  Long && val2 instanceof Long) {
      // Both values have to be instance of Long
      long v1 = ((Long) val1);
      long v2 = ((Long) val2);
      if (mod_index == 0) {
        return add_unmodified(v1, v2, count);
      } else {
        return add_modified(v1, v2, count);
      }
    }
    return InvariantStatus.FALSIFIED;
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
  public abstract InvariantStatus check_modified(long v1, long v2, int count);

  public InvariantStatus check_unmodified(long v1, long v2, int count) {
    return InvariantStatus.NO_CHANGE;
  }

  /**
   * Similar to {@link #check_modified} except that it can change the state of the invariant if
   * necessary. If the invariant doesn't have any state, then the implementation should simply call
   * {@link #check_modified}. This method need not check for falsification; that is done by the
   * caller.
   */
  public abstract InvariantStatus add_modified(long v1, long v2, int count);

  /** By default, do nothing if the value hasn't been seen yet. Subclasses can override this. */
  public InvariantStatus add_unmodified(long v1, long v2, int count) {
    return InvariantStatus.NO_CHANGE;
  }
}
