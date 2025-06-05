// Generated from C:/Users/Omran/Documents/IntelliJ/Compiler/OmranProject/src/Angular/gen/AngularParser.g4 by ANTLR 4.13.2
package Angular.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importLibs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportLibs(AngularParser.ImportLibsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentMetaData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetaData(AngularParser.ComponentMetaDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentMetaDataKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetaDataKey(AngularParser.ComponentMetaDataKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentMetaDataValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetaDataValue(AngularParser.ComponentMetaDataValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(AngularParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#blockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContent(AngularParser.BlockContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AngularParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccessing(AngularParser.VariableAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableChaining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableChaining(AngularParser.VariableChainingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableAssigning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssigning(AngularParser.VariableAssigningContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayElementAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAccessing(AngularParser.ArrayElementAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionAccessing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAccessing(AngularParser.FunctionAccessingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifElseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBlock(AngularParser.IfElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(AngularParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(AngularParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatment(AngularParser.ForStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(AngularParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(AngularParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#combiningOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombiningOperator(AngularParser.CombiningOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditionalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperator(AngularParser.ConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assigningOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigningOperator(AngularParser.AssigningOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#chainingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainingOperator(AngularParser.ChainingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifiers(AngularParser.AccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(AngularParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyType(AngularParser.PropertyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngularParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AngularParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AngularParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(AngularParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AngularParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
}