package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.inv.InvariantStatus;
import daikon.inv.ternary.TernaryInvariant;
import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import typequals.prototype.qual.Prototype;

/**
 * Abstract base class for combined ternary invariants. A CombinedTernaryInvariant may represent:
 * - a ternary invariant over an object and and two variables of a basic type (boolean, float, int), such as {@code x.value = i + j}
 * - a ternary invariant over three variables of a basic type, such as {@code i = j * k}
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class CombinedTernaryInvariant extends TernaryInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 202101513L;

  protected CombinedTernaryInvariant(PptSlice ppt) { super(ppt); }

  protected @Prototype CombinedTernaryInvariant() { super(); }

  public static boolean valid_types_static(VarInfo[] vis) {
    if (vis.length != 3)
      return false;

    // Discard serial field
    if (vis[0].name().contains("serialVersionUID") || vis[1].name().contains("serialVersionUID") || vis[2].name().contains("serialVersionUID"))
      return false;

    if (vis[0].file_rep_type.isObject() || vis[1].file_rep_type.isObject() || vis[2].file_rep_type.isObject()) {
      // At least one var is an object
      return  ((vis[0].file_rep_type.isObject() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isPrimitive() && "this".equals(vis[0].name()))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isObject() && vis[2].file_rep_type.isPrimitive() && "this".equals(vis[1].name()))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isObject() && "this".equals(vis[2].name())));
    } else {
      // All vars must be primitive
      return vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isPrimitive();
    }
  }

  @Override
  public final boolean valid_types(VarInfo[] vis) {
    return valid_types_static(vis) && extra_check(vis);
  }

  /** To add extra checking steps for valid types*/
  public abstract boolean extra_check(VarInfo[] vis);

  /**
   * Returns the first variable.
   */
  public VarInfo var1(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[0];
  }

  /**
   * Returns the second variable.
   */
  public VarInfo var2(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[1];
  }

  /**
   * Returns the third variable.
   */
  public VarInfo var3(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[2];
  }

  @Override
  public InvariantStatus add(@Interned Object o, @Interned Object o1, @Interned Object o2, int i, int i1) {
    return null;
  }

  @Override
  public InvariantStatus check(@Interned Object o, @Interned Object o1, @Interned Object o2, int i, int i1) {
    return null;
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
  public abstract InvariantStatus check_modified(long v1, long v2, long v3, int count);

  public InvariantStatus check_unmodified(long v1, long v2, long v3, int count) {
    return InvariantStatus.NO_CHANGE;
  }

  /**
   * Similar to {@link #check_modified} except that it can change the state of the invariant if
   * necessary. If the invariant doesn't have any state, then the implementation should simply call
   * {@link #check_modified}. This method need not check for falsification; that is done by the
   * caller.
   */
  public abstract InvariantStatus add_modified(long v1, long v2, long v3, int count);

  /** By default, do nothing if the value hasn't been seen yet. Subclasses can override this. */
  public InvariantStatus add_unmodified(long v1, long v2, long v3, int count) {
    return InvariantStatus.NO_CHANGE;
  }

}
