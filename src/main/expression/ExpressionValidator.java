package expression;

import grammar.GrammarSymbols;
import utils.JavaTypesUtil;

import java.util.Collection;

/**
 * This class represents an expression validator, and it provides routines to validate the correctness of expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExpressionValidator {

  /**
   * Get object class
   */
  private static String object_class(String str_expr, String class_one, String class_two, String class_three) {
    if (str_expr.contains(class_one+"."))
      return class_one;
    if (str_expr.contains(class_two+"."))
      return class_two;
    return class_three;
  }

  /**
   * Get var class
   */
  private static String var_class(String str_expr, String class_one, String class_two) {
    if (str_expr.contains(class_one+"."))
      return class_two;
    return class_one;
  }

  /**
   * Returns true iff the given expression allows to receive an object of the given class
   */
  private static boolean expr_allows_class(String str_expr, String class_name) {
    int idx = str_expr.indexOf(class_name);
    while (idx >= 0) {
      if (!(idx == 0 || str_expr.charAt(idx - 1) == ' ' || str_expr.charAt(idx - 1) == '('))
        return false;
      idx = str_expr.indexOf(class_name,idx+1);
    }
    return true;
  }

  /**
   * Returns true if the given expression is applicable to an object of the given class name
   */
  public static boolean is_valid(String str_expr, String class_name) {
    if (!str_expr.contains(class_name+".")) {
      // The expression does not contains the class, so it must be a variable or a set
      if (JavaTypesUtil.is_collection(class_name))
        return str_expr.contains("_Set_Variable_0");
      else {
        String formatted = JavaTypesUtil.format_type(class_name);
        String var_name = GrammarSymbols.get_special_identifier(formatted, 0);
        return str_expr.contains(var_name);
      }
    } else {
      return expr_allows_class(str_expr, class_name);
    }
  }

  /**
   * Returns true iff the given expression has two vars
   */
  private static boolean expr_has_two_vars(String str_expr, String class_name_one, String class_name_two) {
    String formatted = JavaTypesUtil.format_type(class_name_one);
    String var_name_one = GrammarSymbols.get_special_identifier(formatted, 0);
    String formatted_two = JavaTypesUtil.format_type(class_name_two);
    String var_name_two = GrammarSymbols.get_special_identifier(formatted_two, 1);
    return str_expr.contains(var_name_one) && str_expr.contains(var_name_two);
  }

  /**
   * Returns true iff the given expression has two vars
   */
  private static boolean expr_has_three_vars(String str_expr, String class_name_one, String class_name_two, String class_name_three) {
    String formatted = JavaTypesUtil.format_type(class_name_three);
    String var_name_three = GrammarSymbols.get_special_identifier(formatted, 2);
    return expr_has_two_vars(str_expr, class_name_one, class_name_two) && str_expr.contains(var_name_three);
  }

  /**
   * Returns true iff the given expression as a set var and a class var
   * Notice that we only check that the suffix for a set variable is present, since we don't
   * have a way of determining the type of the elements of a collection from its class name.
   */
  private static boolean expr_has_set_and_var(String str_expr, String var_class) {
    String formatted = JavaTypesUtil.format_type(var_class);
    String var_name = GrammarSymbols.get_special_identifier(formatted, 0);
    return str_expr.contains("_Set_Variable_0") && str_expr.contains(var_name);
  }

  /**
   * Returns true iff the given expression as a set var and a class var
   * Notice that we only check that the suffix for a set variable is present, since we don't
   * have a way of determining the type of the elements of a collection from its class name.
   */
  private static boolean expr_has_set_and_two_vars(String str_expr, String var_class) {
    String formatted = JavaTypesUtil.format_type(var_class);
    String var_name_two = GrammarSymbols.get_special_identifier(formatted, 1);
    return expr_has_set_and_var(str_expr, var_class) && str_expr.contains(var_name_two);
  }

  /**
   * Returns true iff the given expression is applicable to objects of the given classes
   */
  public static boolean is_valid(String str_expr, String class_name_one, String class_name_two) {
    if (!str_expr.contains(class_name_one+".") && !str_expr.contains(class_name_two+".")) {
      // Either the first is a collection and the second a variable, or both are variables
      if (JavaTypesUtil.is_collection(class_name_one))
        return expr_has_set_and_var(str_expr, class_name_two);
      else
        return expr_has_two_vars(str_expr, class_name_one, class_name_two);

    } else {
      // Check that the expression allows the object class
      String obj_class = str_expr.contains(class_name_one+".")?class_name_one:class_name_two;
      if (!expr_allows_class(str_expr, obj_class))
        return false;
      // Check that the expression contains a variable of the second class
      String var_class = str_expr.contains(class_name_one+".")?class_name_two:class_name_one;
      String formatted = JavaTypesUtil.format_type(var_class);
      String var_name = GrammarSymbols.get_special_identifier(formatted, 0);
      return str_expr.contains(var_name);
    }
  }

  /**
   * Returns true if the given expression is applicable to objects of the given classes
   */
  public static boolean is_valid(String str_expr, String class_name_one, String class_name_two, String class_name_three) {
    if (!str_expr.contains(class_name_one+".") && !str_expr.contains(class_name_two+".") && !str_expr.contains(class_name_three+".")) {
      // Either the first is a collection and the second a variable, or all are variables
      if (JavaTypesUtil.is_collection(class_name_one))
        return expr_has_set_and_two_vars(str_expr, class_name_two);
      else
        return expr_has_three_vars(str_expr, class_name_one, class_name_two, class_name_three);
    } else {
      // Check that the expression allows the object class
      String obj_class = object_class(str_expr, class_name_one, class_name_two, class_name_three);
      if (!expr_allows_class(str_expr, obj_class))
        return false;
      // Check that the expression contains variables of the remaining classes
      String var_class = var_class(str_expr, class_name_one, class_name_two);
      return expr_has_two_vars(str_expr, var_class, var_class);
    }
  }

  /**
   * Validate the presence of a variable
   */
  private static void validate_var(String str_expr, Class<?> var_type, String var_name) {
    if (!(str_expr.contains(var_name)))
      throw new NonApplicableExpressionException("The expression " + str_expr + " does not contains variable " + var_name + " of class " + var_type.getSimpleName());
  }
  
  /**
   * Validate that the given expression is applicable to the given object class
   */
  public static void validate(String str_expr, Class<?> cl, Class<?> cl2, Class<?> cl3) {
    if (Number.class.isAssignableFrom(cl)) {
      // All are numbers, thus just check the presence of all variables
      validate_var(str_expr, cl, GrammarSymbols.get_special_identifier(cl.getSimpleName(), 0));
      if (cl2!=null && (Number.class.isAssignableFrom(cl2)))
        validate_var(str_expr, cl2, GrammarSymbols.get_special_identifier(cl2.getSimpleName(), 1));
      if (cl3!=null && (Number.class.isAssignableFrom(cl3)))
        validate_var(str_expr, cl3, GrammarSymbols.get_special_identifier(cl3.getSimpleName(), 2));
      return;
    }

    // First class is not a number, check if it assignable from a collection
    if (Collection.class.isAssignableFrom(cl)) {
      // TODO Can't verify so far, think how to do it. We need a way to obtain the class that represents the elements of the collection.
      return;
    }

    // First class is not a collection, so it should be the target class
    String class_name = cl.getSimpleName();
    if (!str_expr.contains(class_name + "."))
      // Class name is not present, then ensure that all tokens are variable
      throw new NonApplicableExpressionException("The expression " + str_expr + " is not applicable to class: " + class_name);

    int idx = str_expr.indexOf(class_name);
    while (idx >= 0) {
      if (!(idx == 0 || str_expr.charAt(idx - 1) == ' ' || str_expr.charAt(idx - 1) == '('))
        throw new NonApplicableExpressionException("The expression " + str_expr + " is not applicable to class: " + class_name);
      idx = str_expr.indexOf(class_name, idx + 1);
    }
    if (cl2 != null) {
      // Either cl2.getSimpleName()_Variable string should exist or Object_Variable_0
      String var_name = GrammarSymbols.get_special_identifier(cl2.getSimpleName(), 0);
      if (!str_expr.contains(var_name) && !str_expr.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT, 0))) {
        throw new NonApplicableExpressionException("The expression " + str_expr + " is not applicable to var: " + var_name);
      }
    }
    if (cl3 != null) {
      // Either cl3.getSimpleName()_Variable string should exist or Object_Variable_1
      String var_name = GrammarSymbols.get_special_identifier(cl3.getSimpleName(), 1);
      if (!str_expr.contains(var_name) && !str_expr.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT, 1))) {
        throw new NonApplicableExpressionException("The expression " + str_expr + " is not applicable to var: " + var_name);
      }
    }

  }

}
