// Generated from AnnotatedAntlr4PropertiesParser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnnotatedAntlr4PropertiesParser}.
 */
public interface AnnotatedAntlr4PropertiesParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertiesBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesBlock(AnnotatedAntlr4PropertiesParser.PropertiesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertiesBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesBlock(AnnotatedAntlr4PropertiesParser.PropertiesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedProperty(AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedProperty(AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertySelector}.
	 * @param ctx the parse tree
	 */
	void enterPropertySelector(AnnotatedAntlr4PropertiesParser.PropertySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertySelector}.
	 * @param ctx the parse tree
	 */
	void exitPropertySelector(AnnotatedAntlr4PropertiesParser.PropertySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AnnotatedAntlr4PropertiesParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AnnotatedAntlr4PropertiesParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AnnotatedAntlr4PropertiesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AnnotatedAntlr4PropertiesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AnnotatedAntlr4PropertiesParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AnnotatedAntlr4PropertiesParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AnnotatedAntlr4PropertiesParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AnnotatedAntlr4PropertiesParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AnnotatedAntlr4PropertiesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AnnotatedAntlr4PropertiesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(AnnotatedAntlr4PropertiesParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(AnnotatedAntlr4PropertiesParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(AnnotatedAntlr4PropertiesParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(AnnotatedAntlr4PropertiesParser.NullLiteralContext ctx);
}