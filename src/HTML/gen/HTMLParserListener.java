// Generated from C:/Users/Omran/Documents/IntelliJ/Compiler/OmranProject/src/HTML/gen/HTMLParser.g4 by ANTLR 4.13.2
package HTML.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(HTMLParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(HTMLParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(HTMLParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(HTMLParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#regularTag}.
	 * @param ctx the parse tree
	 */
	void enterRegularTag(HTMLParser.RegularTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#regularTag}.
	 * @param ctx the parse tree
	 */
	void exitRegularTag(HTMLParser.RegularTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(HTMLParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(HTMLParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(HTMLParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(HTMLParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selfClosedTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosedTag(HTMLParser.SelfClosedTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selfClosedTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosedTag(HTMLParser.SelfClosedTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(HTMLParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(HTMLParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void enterNgFor(HTMLParser.NgForContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void exitNgFor(HTMLParser.NgForContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void enterForStatment(HTMLParser.ForStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void exitForStatment(HTMLParser.ForStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(HTMLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(HTMLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(HTMLParser.EventAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(HTMLParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(HTMLParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(HTMLParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(HTMLParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(HTMLParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HTMLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HTMLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#combiningOperator}.
	 * @param ctx the parse tree
	 */
	void enterCombiningOperator(HTMLParser.CombiningOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#combiningOperator}.
	 * @param ctx the parse tree
	 */
	void exitCombiningOperator(HTMLParser.CombiningOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(HTMLParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(HTMLParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#dataAccessing}.
	 * @param ctx the parse tree
	 */
	void enterDataAccessing(HTMLParser.DataAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#dataAccessing}.
	 * @param ctx the parse tree
	 */
	void exitDataAccessing(HTMLParser.DataAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionAccessing}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAccessing(HTMLParser.FunctionAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionAccessing}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAccessing(HTMLParser.FunctionAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variableAccessing}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccessing(HTMLParser.VariableAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variableAccessing}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccessing(HTMLParser.VariableAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#chaining}.
	 * @param ctx the parse tree
	 */
	void enterChaining(HTMLParser.ChainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#chaining}.
	 * @param ctx the parse tree
	 */
	void exitChaining(HTMLParser.ChainingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HTMLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HTMLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propertyAccessing}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessing(HTMLParser.PropertyAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propertyAccessing}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessing(HTMLParser.PropertyAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementAccessing(HTMLParser.ArrayElementAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementAccessing(HTMLParser.ArrayElementAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HTMLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HTMLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HTMLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(HTMLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(HTMLParser.BooleanContext ctx);
}