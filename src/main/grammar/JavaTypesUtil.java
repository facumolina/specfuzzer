package grammar;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class that contains utilities for Java types
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class JavaTypesUtil {

  public static final String INTEGER = "Integer";
  public static final String FLOAT = "Float";
  public static final String DOUBLE = "Double";
  public static final String BOOLEAN = "Boolean";
  public static final String OBJECT = "Object";

  public static final List<String> BASIC_JAVA_TYPES = Arrays.asList("int", "float", "double",
      "boolean");

  /**
   * Returns true if the given type is a reference
   */
  public static boolean is_reference(String type_name) {
    return !BASIC_JAVA_TYPES.contains(type_name);
  }

  /**
   * Format the given type name
   */
  public static String format_type(String java_type_name) {
    if ("int".equals(java_type_name))
      return INTEGER;
    if ("float".equals(java_type_name))
      return FLOAT;
    if ("double".equals(java_type_name))
      return DOUBLE;
    if ("boolean".equals(java_type_name))
      return BOOLEAN;
    return java_type_name;
  }

  /**
   * Returns true if the given formatted type is numeric or not
   */
  public static boolean is_numeric(String formatted_type_name) {
    return INTEGER.equals(formatted_type_name) || FLOAT.equals(formatted_type_name)
        || DOUBLE.equals(formatted_type_name);
  }

  /**
   * Returns true if the given formatted type is integer
   */
  public static boolean is_integer(String formatted_type_name) {
    return INTEGER.equals(formatted_type_name);
  }


  /**
   * Returns the set of types present in the argument's types of all methods of the CUT combined
   */
  public static Set<String> all_arguments_types(Class<?> cut) {
    Set<String> arg_types = new HashSet<String>();
    Method[] methods = cut.getDeclaredMethods();
    for (Method m : methods) {
      Parameter[] params = m.getParameters();
      for (Parameter p : params)
        arg_types.add(format_type(p.getType().getSimpleName()));
    }
    return arg_types;
  }

}
