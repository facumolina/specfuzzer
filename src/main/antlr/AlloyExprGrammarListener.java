// Generated from antlr/AlloyExprGrammar.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlloyExprGrammarParser}.
 */
public interface AlloyExprGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(AlloyExprGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(AlloyExprGrammarParser.ParseContext ctx);
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
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(AlloyExprGrammarParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(AlloyExprGrammarParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#num_binary_op}.
	 * @param ctx the parse tree
	 */
	void enterNum_binary_op(AlloyExprGrammarParser.Num_binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#num_binary_op}.
	 * @param ctx the parse tree
	 */
	void exitNum_binary_op(AlloyExprGrammarParser.Num_binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(AlloyExprGrammarParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(AlloyExprGrammarParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#set_binary_op}.
	 * @param ctx the parse tree
	 */
	void enterSet_binary_op(AlloyExprGrammarParser.Set_binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#set_binary_op}.
	 * @param ctx the parse tree
	 */
	void exitSet_binary_op(AlloyExprGrammarParser.Set_binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(AlloyExprGrammarParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(AlloyExprGrammarParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(AlloyExprGrammarParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(AlloyExprGrammarParser.Unary_opContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(AlloyExprGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(AlloyExprGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#closure_field}.
	 * @param ctx the parse tree
	 */
	void enterClosure_field(AlloyExprGrammarParser.Closure_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#closure_field}.
	 * @param ctx the parse tree
	 */
	void exitClosure_field(AlloyExprGrammarParser.Closure_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlloyExprGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AlloyExprGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlloyExprGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AlloyExprGrammarParser.NumberContext ctx);
}