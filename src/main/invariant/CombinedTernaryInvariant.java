package invariant;

import daikon.PptSlice;
import daikon.VarInfo;
import daikon.inv.Invariant;
import daikon.inv.InvariantStatus;
import daikon.inv.ternary.TernaryInvariant;
import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import typequals.prototype.qual.Prototype;

import java.util.Arrays;

/**
 * Abstract base class for combined ternary invariants. A CombinedTernaryInvariant may represent:
 * - a ternary invariant over an object and two variables of a basic type (boolean, float, int), such as {@code x.value = i + j}
 * - a ternary invariant over three variables of a basic type, such as {@code i = j * k}
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public abstract class CombinedTernaryInvariant extends TernaryInvariant {

  // We are Serializable, so we specify a version to allow changes to
  // method signatures without breaking serialization.  If you add or
  // remove fields, you should change this number to the current date.
  static final long serialVersionUID = 202101513L;

  // Allows to keep track of the variables order.
  // Took from daikon.inv.ternary.threeScalar.FunctionBinary
  static final int[][] var_indices;
  static {
    var_indices = new int[7][];
    var_indices[1] = new int[] { 0, 1, 2 };
    var_indices[2] = new int[] { 1, 0, 2 };
    var_indices[3] = new int[] { 2, 0, 1 };
    var_indices[4] = new int[] { 0, 2, 1 };
    var_indices[5] = new int[] { 1, 2, 0 };
    var_indices[6] = new int[] { 2, 1, 0 };
  }
  private int var_order = 1;

  protected CombinedTernaryInvariant(PptSlice ppt) { super(ppt); }

  protected @Prototype CombinedTernaryInvariant() { super(); }

  public boolean valid_types_static(VarInfo[] vis) {
    if (vis.length != 3)
      return false;

    // Discard serial field
    if (vis[0].name().contains("serialVersionUID") || vis[1].name().contains("serialVersionUID") || vis[2].name().contains("serialVersionUID"))
      return false;

    // Discard when variables with same name are present
    //if (vis[0].name().equals(vis[1].name()) || vis[0].name().equals(vis[2].name()) || vis[1].name().equals(vis[2].name()))
    //  return false;

    // Discard variables when two variables are sizes
    if ((vis[0].is_size() && vis[1].is_size()) || (vis[1].is_size() && vis[2].is_size()) || (vis[0].is_size() && vis[2].is_size()))
      return false;

    if (vis[0].file_rep_type.isObject() || vis[1].file_rep_type.isObject() || vis[2].file_rep_type.isObject()) {
      // At least one var is an object or a collection
      return  ((vis[0].file_rep_type.isObject() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isPrimitive() && FuzzedInvariantUtil.is_this_or_collection(vis[0]))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isObject() && vis[2].file_rep_type.isPrimitive() && FuzzedInvariantUtil.is_this_or_collection(vis[1]))
              || (vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isObject() && FuzzedInvariantUtil.is_this_or_collection(vis[2])));
    } else {
      // All vars must be primitive
      return vis[0].file_rep_type.isPrimitive() && vis[1].file_rep_type.isPrimitive() && vis[2].file_rep_type.isPrimitive();
    }
  }

  @Override
  public final boolean valid_types(VarInfo[] vis) {
    if (vis.length != 3)
      return false;
    return valid_types_static(vis) && extra_check(vis);
  }

  /** To add extra checking steps for valid types*/
  public abstract boolean extra_check(VarInfo[] vis);

  /** Return the var order*/
  public int get_var_order(@GuardSatisfied CombinedTernaryInvariant this) { return var_order; }

  /**
   * Since the order is determined from the vars and the sequence is always first, no permute is necessary.
   */
  @Override
  protected Invariant resurrect_done(int[] permutation) {
    assert permutation.length == 3;
    int[] new_order = new int[3];
    int[] old_order = var_indices[get_var_order()];

    // "permutation" is a permutation on the var_info array. old_order
    // was the permutation that took the formatted invariant to the
    // var_info array, so old_order^-1 is the permutation from the
    // var_info array to the old formatted invariant. We want to find
    // a new_order so that when we first do "permutation", then
    // apply the new permutation from the var_info array to the
    // formatted invariant, we get the same formatted invariant.
    // What we want, then. is:
    //    new_order^-1 o permutation = old_order^-1
    // rearranging, this is equivalent to
    //    new_order = permutation o old_order
    new_order[0] = permutation[old_order[0]];
    new_order[1] = permutation[old_order[1]];
    new_order[2] = permutation[old_order[2]];

    // Look for the new order in the list of possible orders.
    var_order = -1;
    for (int i = 0; i < var_indices.length; i++) {
      if (Arrays.equals(new_order, var_indices[i])) {
        var_order = i;
        break;
      }
    }
    assert var_order != -1;

    // The invariant to return is this, but with a new order.
    return this;
  }

  /**
   * Returns the first variable.
   */
  public VarInfo var1(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[var_indices[get_var_order()][0]];
  }

  /**
   * Returns the second variable.
   */
  public VarInfo var2(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[var_indices[get_var_order()][1]];
  }

  /**
   * Returns the third variable.
   */
  public VarInfo var3(@GuardSatisfied CombinedTernaryInvariant this) {
    return ppt.var_infos[var_indices[get_var_order()][2]];
  }

  @Override
  public InvariantStatus add(@Interned Object val1, @Interned Object val2, @Interned Object val3, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 8);
    if (val1 instanceof  Long && val2 instanceof Long && val3 instanceof Long) {
      // All values have to be instance of Long
      long v1 = ((Long) val1);
      long v2 = ((Long) val2);
      long v3 = ((Long) val3);
      long[] sorted = sort_values_by_order(v1, v2, v3);
      if (mod_index == 0) {
        return add_unmodified(sorted[0], sorted[1], sorted[2], count);
      } else {
        return add_modified(sorted[0], sorted[1], sorted[2], count);
      }
    }
    return InvariantStatus.FALSIFIED;
  }

  @Override
  public InvariantStatus check(@Interned Object val1, @Interned Object val2, @Interned Object val3, int mod_index, int count) {
    assert !falsified;
    assert (mod_index >= 0) && (mod_index < 8);
    if (val1 instanceof  Long && val2 instanceof Long) {
      // All values have to be instance of Long
      long v1 = ((Long) val1);
      long v2 = ((Long) val2);
      long v3 = ((Long) val3);
      long[] sorted = sort_values_by_order(v1, v2, v3);
      if (mod_index == 0) {
        return check_unmodified(sorted[0], sorted[1], sorted[2], count);
      } else {
        return check_modified(sorted[0], sorted[1], sorted[2], count);
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

  /**
   * Returns an array containing the given long values in the corresponding order to be evaluated properly.
   * The order is determined by the variable var_order.
   */
  private long[] sort_values_by_order(long v1, long v2, long v3) {
    if (var_order==1) {
      return new long[] {v1, v2, v3};
    } else if (var_order==2) {
      return new long[] {v2, v1, v3};
    } else if (var_order==3) {
      return new long[] {v3, v1, v2};
    } else if (var_order==4) {
      return new long[] {v1, v3, v2};
    } else if (var_order==5) {
      return new long[] {v2, v3, v1};
    } else if (var_order==6) {
      return new long[] {v3, v2, v1};
    }
    throw new IllegalStateException("The variable var_order has an illegal value: "+var_order);
  }

  /**
   * Returns an array containing the given VarInfo in the corresponding order to be evaluated properly.
   * The order is determined by the variable var_order.
   */
  protected VarInfo[] sort_var_info_by_order(VarInfo v1, VarInfo v2, VarInfo v3) {
    if (var_order==1) {
      return new VarInfo[] {v1, v2, v3};
    } else if (var_order==2) {
      return new VarInfo[] {v2, v1, v3};
    } else if (var_order==3) {
      return new VarInfo[] {v3, v1, v2};
    } else if (var_order==4) {
      return new VarInfo[] {v1, v3, v2};
    } else if (var_order==5) {
      return new VarInfo[] {v2, v3, v1};
    } else if (var_order==6) {
      return new VarInfo[] {v3, v2, v1};
    }
    throw new IllegalStateException("The variable var_order has an illegal value: "+var_order);
  }

}
