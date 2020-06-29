// Generated from antlr/AlloyExprGrammar.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlloyExprGrammarParser}.
 */
public interface AlloyExprGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AlloyExprGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AlloyExprGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#qt_expr}.
	 * @param ctx the parse tree
	 */
	void enterQt_expr(AlloyExprGrammarParser.Qt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#qt_expr}.
	 * @param ctx the parse tree
	 */
	void exitQt_expr(AlloyExprGrammarParser.Qt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void enterSet_expr(AlloyExprGrammarParser.Set_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#set_expr}.
	 * @param ctx the parse tree
	 */
	void exitSet_expr(AlloyExprGrammarParser.Set_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#qt_obj_cmp}.
	 * @param ctx the parse tree
	 */
	void enterQt_obj_cmp(AlloyExprGrammarParser.Qt_obj_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#qt_obj_cmp}.
	 * @param ctx the parse tree
	 */
	void exitQt_obj_cmp(AlloyExprGrammarParser.Qt_obj_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(AlloyExprGrammarParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(AlloyExprGrammarParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#field_id}.
	 * @param ctx the parse tree
	 */
	void enterField_id(AlloyExprGrammarParser.Field_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#field_id}.
	 * @param ctx the parse tree
	 */
	void exitField_id(AlloyExprGrammarParser.Field_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#closure_op}.
	 * @param ctx the parse tree
	 */
	void enterClosure_op(AlloyExprGrammarParser.Closure_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#closure_op}.
	 * @param ctx the parse tree
	 */
	void exitClosure_op(AlloyExprGrammarParser.Closure_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(AlloyExprGrammarParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(AlloyExprGrammarParser.QuantifierContext ctx);
}