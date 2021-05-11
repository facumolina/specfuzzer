package expression;

import grammar.GrammarSymbols;
import grammar.JavaTypesUtil;
import invariant.FuzzedInvariantUtil;

import java.util.List;

/**
 * This class represents an expression validator, and it provides routines to validate the correctness of expressions.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ExpressionValidator {

  /**
   * Returns true if the given expression is applicable to an object of the given class name
   */
  public static boolean is_valid(String alloy_expr, String class_name) {
    if (!alloy_expr.contains(class_name+".")) {
      // Should be a number
      String formatted = JavaTypesUtil.format_type(class_name);
      String var_name = GrammarSymbols.get_special_identifier(formatted, 0);
      return alloy_expr.contains(var_name);
    } else {
      int idx = alloy_expr.indexOf(class_name);
      while (idx >= 0) {
        if (!(idx == 0 || alloy_expr.charAt(idx - 1) == ' ' || alloy_expr.charAt(idx - 1) == '('))
          return false;
        idx = alloy_expr.indexOf(class_name,idx+1);
      }
      return true;
    }
  }

  /**
   * Validate the presence of a variable
   */
  private static void validate_var(String alloy_expr, Class<?> var_type, String var_name) {
    if (!(alloy_expr.contains(var_name)))
      throw new NonApplicableExpressionException("The expression " + alloy_expr + " does not contains variable " + var_name + " of class " + var_type.getSimpleName());
  }

  /**
   * Validate that the given expression is applicable to the given object class
   */
  public static void validate(String alloy_expr, Class<?> cl, Class<?> cl2, Class<?> cl3) {
    if (Number.class.isAssignableFrom(cl)) {
      // All are numbers, thus just check the presence of all variables
      validate_var(alloy_expr, cl, GrammarSymbols.get_special_identifier(cl.getSimpleName(), 0));
      if (cl2!=null && (Number.class.isAssignableFrom(cl2)))
        validate_var(alloy_expr, cl2, GrammarSymbols.get_special_identifier(cl2.getSimpleName(), 1));
      if (cl3!=null && (Number.class.isAssignableFrom(cl3)))
        validate_var(alloy_expr, cl3, GrammarSymbols.get_special_identifier(cl3.getSimpleName(), 2));

    } else {
      // First class is not a number, so it should be the target class
      String class_name = cl.getSimpleName();
      if (!alloy_expr.contains(class_name + "."))
        // Class name is not present, then ensure that all tokens are variable
        throw new NonApplicableExpressionException("The expression " + alloy_expr + " is not applicable to class: " + class_name);

      int idx = alloy_expr.indexOf(class_name);
      while (idx >= 0) {
        if (!(idx == 0 || alloy_expr.charAt(idx - 1) == ' ' || alloy_expr.charAt(idx - 1) == '('))
          throw new NonApplicableExpressionException("The expression " + alloy_expr + " is not applicable to class: " + class_name);
        idx = alloy_expr.indexOf(class_name, idx + 1);
      }
      if (cl2 != null) {
        // Either cl2.getSimpleName()_Variable string should exist or Object_Variable_0
        String var_name = GrammarSymbols.get_special_identifier(cl2.getSimpleName(), 0);
        if (!alloy_expr.contains(var_name) && !alloy_expr.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT, 0))) {
          throw new NonApplicableExpressionException("The expression " + alloy_expr + " is not applicable to var: " + var_name);
        }
      }
      if (cl3 != null) {
        // Either cl3.getSimpleName()_Variable string should exist or Object_Variable_1
        String var_name = GrammarSymbols.get_special_identifier(cl3.getSimpleName(), 1);
        if (!alloy_expr.contains(var_name) && !alloy_expr.contains(GrammarSymbols.get_special_identifier(JavaTypesUtil.OBJECT, 1))) {
          throw new NonApplicableExpressionException("The expression " + alloy_expr + " is not applicable to var: " + var_name);
        }
      }
    }
  }

}
