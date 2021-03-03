package expression;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import antlr.AlloyExprGrammarParser.Closure_fieldContext;
import antlr.AlloyExprGrammarParser.Closure_opContext;
import antlr.AlloyExprGrammarParser.CollectionContext;
import antlr.AlloyExprGrammarParser.NameContext;
import antlr.AlloyExprGrammarParser.Set_exprContext;

/**
 * This class provides methods to evaluate set expressions.
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class SetExpressionEvaluator {

  /**
   * Evaluate the given set context on the given object
   */
  public static Set<Object> eval(Set_exprContext set_expr_ctx, Object o) {
    // Get the base part (left to closure operator)
    // Name at 0 is the part of the expression that starts from the object
    NameContext left_part = set_expr_ctx.name(0);
    verifyTypes(left_part, o);

    // Get closure and fields
    Closure_opContext closure_op = set_expr_ctx.closure_op();
    Closure_fieldContext fields = set_expr_ctx.closure_field();

    // Start exploring applying the fields as indicated by the closure operation
    Object base_object = NameExpressionEvaluator.eval(left_part, o);
    Set<Object> set = new HashSet<Object>();

    if (base_object!=null) {
      if (closure_op.getText().equals("*"))
        set.add(base_object);
      closureFromFields(base_object, fields, set);
    }

    NameContext after_closure = set_expr_ctx.name(1);
    // If the name after closure is null, then the set has been computed
    if (after_closure==null)
      return set;

    Set<Object> after_closure_set = new HashSet<>();
    set.forEach(elem -> {
      after_closure_set.add(NameExpressionEvaluator.eval(after_closure, elem));
    });

    return after_closure_set;
  }

  /**
   * Evaluate the given collection context on the given object
   */
  public static Set<Object> eval(CollectionContext collection_ctx, Object o) {
    // Get the name
    NameContext set_expr = collection_ctx.name();
    Object set_field_res = NameExpressionEvaluator.eval(set_expr, o);
    assert (set_field_res instanceof Collection);
    Collection<?> col = (Collection<?>) set_field_res;
    if (col==null)
      return new HashSet<>();
    return new HashSet<>(col);
  }

  /**
   * Recursively apply the fields in order to compute a set
   */
  private static void closureFromFields(Object base, Closure_fieldContext fields,
      Set<Object> visited) {
    Object curr = NameExpressionEvaluator.eval(fields.ID(), base);
    if (curr != null) {
      if (visited.add(curr))
        closureFromFields(curr, fields, visited);
    }
    Closure_fieldContext extraFields = fields.closure_field();
    if (extraFields != null)
      closureFromFields(base, extraFields, visited);
  }

  /**
   * Verify if the given name can be computed on the object
   */
  private static void verifyTypes(NameContext name, Object o) {
    if (o != null) {
      if (!name.getText().contains(o.getClass().getSimpleName())
          && !name.getText().equals(QuantifiedExpressionEvaluator.QT_VAR_NAME))
        throw new IllegalArgumentException("Object class " + o.getClass().getSimpleName()
            + " is not compatible with name " + name.getText());
    }

  }
}
