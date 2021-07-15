package utils;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Class that contains utilities for Java types
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class JavaTypesUtil {

  public static final String INTEGER = "Integer";
  public static final String LONG = "Long";
  public static final String FLOAT = "Float";
  public static final String DOUBLE = "Double";
  public static final String BOOLEAN = "Boolean";
  public static final String OBJECT = "Object";
  public static final String SET = "Set";

  public static final List<String> BASIC_JAVA_TYPES = Arrays.asList("int", "long", "float", "double",
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
    if ("long".equals(java_type_name))
      return LONG;
    if ("float".equals(java_type_name))
      return FLOAT;
    if ("double".equals(java_type_name))
      return DOUBLE;
    if ("boolean".equals(java_type_name))
      return BOOLEAN;
    return java_type_name;
  }

  /**
   * Get formatted set type
   */
  public static String format_set_of_type(String java_type_name) {
    return java_type_name + "_" + SET;
  }

  /**
   * Returns true if the given formatted type is numeric or not
   */
  public static boolean is_numeric(String formatted_type_name) {
    return INTEGER.equals(formatted_type_name) || LONG.equals(formatted_type_name) || FLOAT.equals(formatted_type_name)
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
    Set<String> arg_types = new HashSet<>();
    Method[] methods = cut.getDeclaredMethods();
    for (Method m : methods) {
      Parameter[] params = m.getParameters();
      for (Parameter p : params) {
        if (java.util.Collection.class.isAssignableFrom(p.getType())) {
          // For Collection<C> types, the type is considered as C_Set or Object_Set
          Class<?> c = get_parameterized_class(p.getParameterizedType());
          arg_types.add(format_set_of_type(c.getSimpleName()));
        } else {
          // Non Collection types, just format the simple name
          arg_types.add(format_type(p.getType().getSimpleName()));
        }
      }
    }
    return arg_types;
  }

  /**
   * Returns the parameterized class of the given type. For instance, if for a collection type si C<K>, then returns K.
   */
  public static Class<?> get_parameterized_class(Type type) {
    Class<?> cl;
    if (type instanceof ParameterizedType) {
      ParameterizedType pt = (ParameterizedType)type;
      Type[] types = pt.getActualTypeArguments();
      assert types.length==1;
      try {
        cl = Class.forName(types[0].getTypeName());
      } catch (ClassNotFoundException e) { // We should be never be here
        throw new RuntimeException("Unable to load class: "+types[0].getTypeName()+". Is it in the classpath?");
      }
      return cl;
    } else {
      // Use object as the collection class, since it hasn't been specified
      return Object.class;
    }
  }

  /**
   * Returns the set classes that is part of a parameterized type
   */
  public static Class<?> get_types_of_parameterized_type(ParameterizedType pt) {
    Class<?> collection_class;
    Type[] types = pt.getActualTypeArguments();
    assert types.length==1;
    try {
        collection_class = Class.forName(types[0].getTypeName());
    } catch (ClassNotFoundException e) { // We should be never be here
      throw new RuntimeException("Unable to load class: "+types[0].getTypeName()+". Is it in the classpath?");
    }
    return collection_class;
  }

  /**
   * Returns true iff the given String corresponds to the name of a class that implements java.util.Collection
   */
  public static boolean is_collection(String class_name) {
    if (class_name==null)
      throw new IllegalArgumentException("Class name can't be null");
    if (class_name.startsWith("java.util")) {
      try {
        Class<?> cl = Class.forName(class_name);
        return (Collection.class.isAssignableFrom(cl));
      } catch (ClassNotFoundException e) {}
    }
    return false;
  }

  /**
   * Returns the simple name from a fully qualified name string
   */
  public static String get_simple_name(String fqname) {
    return fqname.substring(fqname.lastIndexOf('.') + 1).trim();
  }

}
