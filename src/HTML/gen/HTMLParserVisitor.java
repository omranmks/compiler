// Generated from C:/Users/Omran/Documents/IntelliJ/Compiler/OmranProject/src/HTML/gen/HTMLParser.g4 by ANTLR 4.13.2
package HTML.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(HTMLParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(HTMLParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#regularTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularTag(HTMLParser.RegularTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(HTMLParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(HTMLParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selfClosedTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosedTag(HTMLParser.SelfClosedTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ngIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIf(HTMLParser.NgIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ngFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFor(HTMLParser.NgForContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatment(HTMLParser.ForStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HTMLParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#eventAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(HTMLParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(HTMLParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HTMLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#combiningOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombiningOperator(HTMLParser.CombiningOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#conditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperator(HTMLParser.ConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dataAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAccessing(HTMLParser.DataAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAccessing(HTMLParser.FunctionAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variableAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccessing(HTMLParser.VariableAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#chaining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChaining(HTMLParser.ChainingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HTMLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#propertyAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessing(HTMLParser.PropertyAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAccessing(HTMLParser.ArrayElementAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HTMLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(HTMLParser.BooleanContext ctx);
}