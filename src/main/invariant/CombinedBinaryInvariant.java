package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.binary.BinaryInvariant;
import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.dataflow.qual.Pure;
import typequals.prototype.qual.Prototype;
import utils.JavaTypesUtil;

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

    // Discard serial field.
    if (vis[0].name().contains("serialVersionUID") || vis[1].name().contains("serialVersionUID"))
      return false;

    // Discard variables with the same name.
    if (vis[0].name().equals(vis[1].name()))
      return false;

    if (vis[0].file_rep_type.isObject() || vis[1].file_rep_type.isObject()) {
      // At least one var is an object or collection
      return  ((vis[0].file_rep_type.isObject() && vis[1].file_rep_type.isPrimitive() && is_this_or_collection(vis[0])))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isObject() && is_this_or_collection(vis[1]));
    } else {
      // Both vars must be primitive
      return vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive();
    }
  }

  @Override
  public final boolean valid_types(VarInfo[] vis) {
    if (vis.length != 2)
      return false;
    orig_fst_var = vis[0].name();
    return valid_types_static(vis) && extra_check(vis);
  }

  /** Returns true iff the given VarInfo is either the this object or a collection object */
  private boolean is_this_or_collection(VarInfo vi) {
    return "this".equals(vi.name()) || JavaTypesUtil.is_collection(vi.type.toString());
  }

  /** To add extra checking steps for valid types*/
  public abstract boolean extra_check(VarInfo[] vis);

  /**
   * Since the order is determined from the vars and the sequence is always first, this is
   * essentially symmetric. Subclasses can override if necessary.
   */
  @Pure
  @Override
  public boolean is_symmetric() {
    return true;
  }

  /** Order is determined from the vars, so first variable order is preserved to avoid problems when transferring the invariant */
  private String orig_fst_var;

  /**
   * Since the order is determined from the vars and the sequence is always first, no permute is necessary.
   */
  @Override
  protected Invariant resurrect_done(int[] permutation) {
    assert permutation.length == 2;
    return this;
  }

  /**
   * Check if the first variable in the ppt is the same 'first' original variable from which the invariant was instantiated.
   */
  protected final boolean fst_is_orig_fst(@GuardSatisfied CombinedBinaryInvariant this) {
    return ppt.var_infos[0].name().equals(orig_fst_var) || ppt.var_infos[0].name().equals("orig("+orig_fst_var+")");
  }

  /**
   * Returns the index of the first variable.
   */
  protected final int fst_index(@GuardSatisfied CombinedBinaryInvariant this) {
    return fst_is_orig_fst() ? 0 : 1;
  }

  /**
   * Returns the infex of the second variable.
   */
  protected final int snd_index(@GuardSatisfied CombinedBinaryInvariant this) {
    return fst_is_orig_fst() ? 1 : 0;
  }

  /**
   * Returns the first variable. This is the only mechanism by which subclasses should access variables.
   */
  public VarInfo var1(@GuardSatisfied CombinedBinaryInvariant this) { return ppt.var_infos[fst_index()]; }

  /**
   * Returns the second variable. This is the only mechanism by which subclasses should access variables.
   */
  public VarInfo var2(@GuardSatisfied CombinedBinaryInvariant this) { return ppt.var_infos[snd_index()]; }

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
