package utils;

import daikon.VarInfo;

/**
 * Class that contains utilities for VarInfo objects
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class VarInfoUtil {

  /** Returns true iff the given VarInfo represents an object */
  public static boolean var_is_object(VarInfo v1) {
    return v1.file_rep_type.isObject();
  }

  /** Returns true iff the given VarInfo represents the this object */
  public static boolean var_is_this_object(VarInfo v1) {
    return "this".equals(v1.name()) || "orig(this)".equals(v1.name());
  }

  /** Returns true iff the given VarInfo represents either the this object or a collection object */
  public static boolean var_is_this_or_collection(VarInfo vi) {
    return var_is_this_object(vi) || JavaTypesUtil.is_collection(vi.type.toString());
  }

  /** Returns true iff at least one of the given VarInfo represents an object */
  public static boolean some_is_object(VarInfo v1, VarInfo v2) {
    return VarInfoUtil.var_is_object(v1) || VarInfoUtil.var_is_object(v2);
  }

  /** Returns true iff at least one of the given VarInfo represents an object */
  public static boolean some_is_object(VarInfo v1, VarInfo v2, VarInfo v3) {
    return VarInfoUtil.var_is_object(v1) || VarInfoUtil.var_is_object(v2) || VarInfoUtil.var_is_object(v3);
  }

  /** Returns true iff at least one of the given VarInfo represents the this object */
  public static boolean some_is_this_object(VarInfo v1, VarInfo v2) {
    return VarInfoUtil.var_is_this_object(v1) || VarInfoUtil.var_is_this_object(v2);
  }

  /** Returns true iff at least one of the given VarInfo represents the this object */
  public static boolean some_is_this_object(VarInfo v1, VarInfo v2, VarInfo v3) {
    return VarInfoUtil.var_is_this_object(v1) || VarInfoUtil.var_is_this_object(v2) || VarInfoUtil.var_is_this_object(v3);
  }

}
