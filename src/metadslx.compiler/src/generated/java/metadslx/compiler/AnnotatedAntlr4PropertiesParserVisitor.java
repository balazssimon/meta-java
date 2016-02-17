// Generated from AnnotatedAntlr4PropertiesParser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnnotatedAntlr4PropertiesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnnotatedAntlr4PropertiesParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertiesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesBlock(AnnotatedAntlr4PropertiesParser.PropertiesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#qualifiedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedProperty(AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#propertySelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySelector(AnnotatedAntlr4PropertiesParser.PropertySelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AnnotatedAntlr4PropertiesParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AnnotatedAntlr4PropertiesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AnnotatedAntlr4PropertiesParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AnnotatedAntlr4PropertiesParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AnnotatedAntlr4PropertiesParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(AnnotatedAntlr4PropertiesParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4PropertiesParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(AnnotatedAntlr4PropertiesParser.NullLiteralContext ctx);
}