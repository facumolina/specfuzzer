package expression;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.AlloyExprGrammarLexer;
import antlr.AlloyExprGrammarParser;
import antlr.AlloyExprGrammarParser.Closure_fieldContext;
import antlr.AlloyExprGrammarParser.Closure_opContext;
import antlr.AlloyExprGrammarParser.ExprContext;
import antlr.AlloyExprGrammarParser.NameContext;
import antlr.AlloyExprGrammarParser.Qt_exprContext;
import antlr.AlloyExprGrammarParser.Set_exprContext;

/**
 * This class represents an Expression Evaluator. Provides a method that given a Java object and an
 * expression (in the Alloy grammar) evaluates the expression on the object.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */

public class ExpressionEvaluator {

  private static AlloyExprGrammarParser parser; // Alloy Expressions Parser

  /**
   * Setup the parser
   */
  private static void setup(String alloy_expr) {
    AlloyExprGrammarLexer lexer = new AlloyExprGrammarLexer(CharStreams.fromString(alloy_expr));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new AlloyExprGrammarParser(tokens);
  }

  /**
   * Evaluate the given Alloy expression on the given object
   */
  public static boolean eval(String alloy_expr, Object o) {

    setup(alloy_expr);

    // Parse the expression and get the tree
    ParseTree tree = parser.parse();

    if (parser.getNumberOfSyntaxErrors() > 0)
      throw new IllegalArgumentException("The given expression contains syntax errors");

    // Evaluate the expression on the object
    return eval((AlloyExprGrammarParser.ParseContext) tree, o);

  }

  /**
   * Evaluate the given ParseTree on the given java Object
   */
  private static boolean eval(AlloyExprGrammarParser.ParseContext ctx, Object o) {
    // Get the expression
    ExprContext ectx = ctx.expr();

    Qt_exprContext qt_expr_ctx = ectx.qt_expr();
    if (qt_expr_ctx != null)
      return evalQtExpression(qt_expr_ctx, o);

    throw new IllegalStateException("Unable to evaluate the expression!");
  }

  /**
   * Evaluate the given quantified expression on the given java Object
   */
  private static boolean evalQtExpression(Qt_exprContext qt_expr, Object o) {
    Set<Object> set = computeSet(qt_expr.set_expr(), o);

    return true;
  }

  /**
   * Compute the given set context on the given object
   */
  private static Set<Object> computeSet(Set_exprContext set_expr_ctx, Object o) {
    // Get the base part (left to closure operator)
    NameContext left_part = set_expr_ctx.name();
    verifyTypes(left_part, o);

    // Get closure and fields
    Closure_opContext closure_op = set_expr_ctx.closure_op();
    Closure_fieldContext fields = set_expr_ctx.closure_field();

    // Start exploring applying the fields as indicated by the closure operation
    assert (left_part.ID().getText().equals(o.getClass().getSimpleName()));
    Object base_object = applyName(left_part, o);
    Set<Object> set = new HashSet<Object>();
    if (closure_op.getText().equals("*"))
      set.add(base_object);

    applyFields(base_object, fields, set);
    return null;
  }

  /**
   * Compute the base of a set expression (the base is the part just before applying the closure)
   */
  private static Object applyName(NameContext name_ctx, Object o) {
    NameContext fields = name_ctx.name();
    if (fields == null || o == null)
      // No fields to apply
      return o;

    try {
      // Get the field and evaluate it, o continue evaluating
      Field field = getField(o.getClass(), fields.ID().getText());
      field.setAccessible(true);
      Object curr = field.get(o);
      if (curr == null)
        return null;
      else
        return applyName(fields.name(), curr);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException("The expression " + name_ctx.getText()
          + " can't be evaluated due to a IllegalAccessException: " + e.getMessage());
    }
  }

  /**
   * Recursively apply the fields in order to compute a set
   */
  private static void applyFields(Object base, Closure_fieldContext fields, Set<Object> visited) {

  }

  /**
   * Verify if the given name can be compute on the object
   */
  private static void verifyTypes(NameContext name, Object o) {
    if (o != null) {
      if (!name.getText().contains(o.getClass().getSimpleName()))
        throw new IllegalArgumentException("Object class " + o.getClass().getSimpleName()
            + " is not compatible with name " + name.getText());
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