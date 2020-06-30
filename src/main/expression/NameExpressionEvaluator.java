package expression;

import java.lang.reflect.Field;

import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.AlloyExprGrammarParser.NameContext;

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
    if (o == null)
      return null;
    if (ID.getText().equals(o.getClass().getSimpleName()))
      return o;
    if (ID.getText().equals(QuantifiedExpressionEvaluator.QT_VAR_NAME))
      return o;
    try {
      // Get the field and evaluate it, o continue evaluating
      Field field = getField(o.getClass(), ID.getText());
      field.setAccessible(true);
      return field.get(o);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("The expression " + ID.getText()
          + " can't be evaluated on object of type " + o.getClass().getSimpleName()
          + "due to a IllegalAccessException: " + e.getMessage());
    }
  }

  /**
   * Search for the field fieldName even in the superclass
   */
  private static Field getField(Class<?> clazz, String fieldName) {
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

}
