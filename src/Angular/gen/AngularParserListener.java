// Generated from C:/Users/Omran/Documents/IntelliJ/Compiler/OmranProject/src/Angular/gen/AngularParser.g4 by ANTLR 4.13.2
package Angular.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importLibs}.
	 * @param ctx the parse tree
	 */
	void enterImportLibs(AngularParser.ImportLibsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importLibs}.
	 * @param ctx the parse tree
	 */
	void exitImportLibs(AngularParser.ImportLibsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentMetaData}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetaData(AngularParser.ComponentMetaDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentMetaData}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetaData(AngularParser.ComponentMetaDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentMetaDataKey}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetaDataKey(AngularParser.ComponentMetaDataKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentMetaDataKey}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetaDataKey(AngularParser.ComponentMetaDataKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentMetaDataValue}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetaDataValue(AngularParser.ComponentMetaDataValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentMetaDataValue}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetaDataValue(AngularParser.ComponentMetaDataValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 */
	void enterExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 */
	void exitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngularParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngularParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(AngularParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(AngularParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockContent(AngularParser.BlockContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockContent(AngularParser.BlockContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AngularParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AngularParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableAccessing}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccessing(AngularParser.VariableAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableAccessing}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccessing(AngularParser.VariableAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableChaining}.
	 * @param ctx the parse tree
	 */
	void enterVariableChaining(AngularParser.VariableChainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableChaining}.
	 * @param ctx the parse tree
	 */
	void exitVariableChaining(AngularParser.VariableChainingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableAssigning}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssigning(AngularParser.VariableAssigningContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableAssigning}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssigning(AngularParser.VariableAssigningContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAccessing}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAccessing}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementAccessing(AngularParser.ArrayElementAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementAccessing(AngularParser.ArrayElementAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngularParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionAccessing}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAccessing(AngularParser.FunctionAccessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionAccessing}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAccessing(AngularParser.FunctionAccessingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifElseBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlock(AngularParser.IfElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifElseBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlock(AngularParser.IfElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(AngularParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(AngularParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void enterForStatment(AngularParser.ForStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void exitForStatment(AngularParser.ForStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(AngularParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(AngularParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(AngularParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(AngularParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AngularParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#combiningOperator}.
	 * @param ctx the parse tree
	 */
	void enterCombiningOperator(AngularParser.CombiningOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#combiningOperator}.
	 * @param ctx the parse tree
	 */
	void exitCombiningOperator(AngularParser.CombiningOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(AngularParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(AngularParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assigningOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssigningOperator(AngularParser.AssigningOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assigningOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssigningOperator(AngularParser.AssigningOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#chainingOperator}.
	 * @param ctx the parse tree
	 */
	void enterChainingOperator(AngularParser.ChainingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#chainingOperator}.
	 * @param ctx the parse tree
	 */
	void exitChainingOperator(AngularParser.ChainingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyType}.
	 * @param ctx the parse tree
	 */
	void enterPropertyType(AngularParser.PropertyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyType}.
	 * @param ctx the parse tree
	 */
	void exitPropertyType(AngularParser.PropertyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngularParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngularParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AngularParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AngularParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AngularParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AngularParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(AngularParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(AngularParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(AngularParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(AngularParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
}