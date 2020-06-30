package expression;

import java.util.HashSet;
import java.util.Set;

import antlr.AlloyExprGrammarParser.Closure_fieldContext;
import antlr.AlloyExprGrammarParser.Closure_opContext;
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
    NameContext left_part = set_expr_ctx.name();
    verifyTypes(left_part, o);

    // Get closure and fields
    Closure_opContext closure_op = set_expr_ctx.closure_op();
    Closure_fieldContext fields = set_expr_ctx.closure_field();

    // Start exploring applying the fields as indicated by the closure operation
    assert (left_part.ID().getText().equals(o.getClass().getSimpleName()));
    Object base_object = NameExpressionEvaluator.eval(left_part, o);
    Set<Object> set = new HashSet<Object>();
    if (closure_op.getText().equals("*"))
      set.add(base_object);

    closureFromFields(base_object, fields, set);
    return set;
  }

  /**
   * Recursively apply the fields in order to compute a set
   */
  private static void closureFromFields(Object base, Closure_fieldContext fields,
      Set<Object> visited) {
    Object curr = NameExpressionEvaluator.eval(fields.ID(), base);
    if (curr != null) {
      visited.add(curr);
      closureFromFields(curr, fields, visited);
    }
    Closure_fieldContext extraFields = fields.closure_field();
    if (extraFields != null)
      closureFromFields(base, fields, visited);
  }

  /**
   * Verify if the given name can be computed on the object
   */
  private static void verifyTypes(NameContext name, Object o) {
    if (o != null) {
      if (!name.getText().contains(o.getClass().getSimpleName()))
        throw new IllegalArgumentException("Object class " + o.getClass().getSimpleName()
            + " is not compatible with name " + name.getText());
    }

  }
}
