package expression;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.AlloyExprGrammarParser.NameContext;
import grammar.Constants;

/**
 * This class provides methods to evaluate name expressions (name).
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class NameExpressionEvaluator {

  /**
   * Evaluate the given name on the given object
   */
  public static Object eval(NameContext name_ctx, Object o) {
    if (name_ctx == null)
      throw new IllegalArgumentException("The name can't be null!");
    Object curr = eval(name_ctx.ID(), o);
    NameContext fields = name_ctx.name();

    if (fields == null) // No fields to apply
      return curr;

    if (curr == null)
      throw new NonEvaluableExpressionException(
          "Can't continue evaluating fields " + fields.getText());

    return eval(fields, curr);
  }

  /**
   * Evaluate the given ID on the given object
   */
  public static Object eval(TerminalNode ID, Object o) {
    return eval(ID.getText(), o);
  }

  /**
   * Evaluate the given string access field on the given object
   */
  public static Object eval(String access_field, Object o) {
    if (o != null) {
      if (access_field.equals(o.getClass().getSimpleName()))
        return o;
    }
    if (ExpressionEvaluator.vars.containsKey(access_field))
      return ExpressionEvaluator.vars.get(access_field);
    if (access_field.equals(QuantifiedExpressionEvaluator.QT_VAR_NAME))
      return o;
    if (access_field.equals(Constants.NULL))
      return null;
    if (access_field.equals(Constants.MAP_KEY_SET) && o instanceof java.util.Map)
      return eval_method(access_field, o);
    if (access_field.equals(Constants.MAP_VALUES) && o instanceof java.util.Map)
      return eval_method(access_field, o);
    try {
      // Get the field and evaluate it, o continue evaluating
      Field field = get_field(o.getClass(), access_field);
      field.setAccessible(true);
      return field.get(o);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("The expression " + access_field
              + " can't be evaluated on object of type " + o.getClass().getSimpleName()
              + "due to a IllegalAccessException: " + e.getMessage());
    }
  }

  /**
   * Search for the field fieldName even in the superclass
   */
  private static Field get_field(Class<?> clazz, String fieldName) {
    Class<?> tmpClass = clazz;
    do {
      try {
        Field f = tmpClass.getDeclaredField(fieldName);
        return f;
      } catch (NoSuchFieldException e) {
        tmpClass = tmpClass.getSuperclass();
      }
    } while (tmpClass != null && tmpClass != Object.class);

    throw new RuntimeException("Field '" + fieldName + "' not found on class " + clazz);
  }

  /**
   * Search for the given method name and apply it to the given object
   */
  private static Object eval_method(String method_name, Object o) {
    try {
      Method method = get_method(o.getClass(), method_name);
      method.setAccessible(true);
      return method.invoke(o);
    } catch (Exception e) {
      throw new IllegalStateException(
          "The method " + method_name + " can't be evaluated on object of type "
              + o.getClass().getSimpleName() + "due to an exception: " + e.getMessage());
    }

  }

  /**
   * Search for the field fieldName even in the superclass
   */
  private static Method get_method(Class<?> clazz, String method_name) {
    Class<?> tmpClass = clazz;
    do {
      try {
        Method m = tmpClass.getDeclaredMethod(method_name);
        return m;
      } catch (NoSuchMethodException e) {
        tmpClass = tmpClass.getSuperclass();
      }
    } while (tmpClass != null && tmpClass != Object.class);

    throw new RuntimeException("Method '" + method_name + "' not found on class " + clazz);
  }

}
