// Generated from c:/Users/alfon/ssl-antlr-calculator/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CalculatorParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CalculatorParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CalculatorParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CalculatorParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CalculatorParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CalculatorParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CalculatorParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CalculatorParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleStatement(CalculatorParser.ConsoleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#consoleStatement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleStatement(CalculatorParser.ConsoleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalculatorParser.TermContext ctx);
}