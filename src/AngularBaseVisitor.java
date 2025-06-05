import Angular.classes.*;
import Angular.classes.Class;
import Angular.gen.AngularParser;
import Angular.gen.AngularParserBaseVisitor;

public class AngularBaseVisitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable;

    public AngularBaseVisitor(SymbolTable sm) {
        this.symbolTable = sm;
    }

    int currentScope = 0;

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        if (!ctx.importStatement().isEmpty())
            for (AngularParser.ImportStatementContext importStatement : ctx.importStatement())
                program.addImportStatement(visitImportStatement(importStatement));
        if (!ctx.component().isEmpty()) for (AngularParser.ComponentContext component : ctx.component())
            program.addComponent(visitComponent(component));
        if (ctx.exportClass() != null) program.setExportClass(visitExportClass(ctx.exportClass()));
        else {
            program.setaClass(visitClass(ctx.class_()));
            program.setExport(visitExport(ctx.export()));
        }
        return program;
    }

    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        for (AngularParser.ImportLibsContext importLibsContext : ctx.importLibs())
            importStatement.addImportLips(visitImportLibs(importLibsContext));
        importStatement.setTypeString(visitString(ctx.string()));

        return importStatement;
    }

    @Override
    public ImportLibs visitImportLibs(AngularParser.ImportLibsContext ctx) {
        ImportLibs importLibs = new ImportLibs();
        for (AngularParser.IdentifierContext identifierContext : ctx.identifier()) {
            importLibs.addIdentifier(visitIdentifier(identifierContext));
        }
        if (!ctx.Comma().isEmpty()) {
            for (int i = 0; i < ctx.Comma().size(); i++) {
                importLibs.addComma(ctx.Comma(i).getText());
            }
        }

        for (Identifier id : importLibs.getIdentifierList()) {
            Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Module.toString(), id.getIdentifier(), "", "");
            this.symbolTable.addRow(row);
        }

        return importLibs;
    }

    @Override
    public Component visitComponent(AngularParser.ComponentContext ctx) {
        Component component = new Component();
        component.setAngularDecorator(ctx.AngularDecorator().getText());

        Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Decorator.toString(), ctx.AngularDecorator().getText(), "", "");
        symbolTable.addRow(row);

        if (!ctx.componentMetaData().isEmpty())
            for (AngularParser.ComponentMetaDataContext metaData : ctx.componentMetaData())
                component.addComponentMetaData(visitComponentMetaData(metaData));
        return component;
    }

    @Override
    public ComponentMetaData visitComponentMetaData(AngularParser.ComponentMetaDataContext ctx) {
        ComponentMetaData componentMetaData = new ComponentMetaData();
        componentMetaData.setComponentMetaDataKey(visitComponentMetaDataKey(ctx.componentMetaDataKey()));
        componentMetaData.setComponentMetaDataValue(visitComponentMetaDataValue(ctx.componentMetaDataValue()));
        return componentMetaData;
    }

    @Override
    public ComponentMetaDataKey visitComponentMetaDataKey(AngularParser.ComponentMetaDataKeyContext ctx) {
        ComponentMetaDataKey componentMetaDataKey = new ComponentMetaDataKey();
        componentMetaDataKey.setIdentifier(visitIdentifier(ctx.identifier()));
        return componentMetaDataKey;
    }

    @Override
    public ComponentMetaDataValue visitComponentMetaDataValue(AngularParser.ComponentMetaDataValueContext ctx) {
        ComponentMetaDataValue componentMetaDataValue = new ComponentMetaDataValue();
        if (ctx.value() != null) componentMetaDataValue.setValue(visitValue(ctx.value()));
        else componentMetaDataValue.setVariableAccess(visitVariableAccessing(ctx.variableAccessing()));
        return componentMetaDataValue;
    }

    @Override
    public ExportClass visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClass exportClass = new ExportClass();
        exportClass.setaClass(visitClass(ctx.class_()));
        return exportClass;
    }

    @Override
    public Angular.classes.Class visitClass(AngularParser.ClassContext ctx) {
        Angular.classes.Class aClass = new Class();
        aClass.setIdentifier(visitIdentifier(ctx.identifier()));
        aClass.setClassBody(visitClassBody(ctx.classBody()));

        Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Class.toString(), aClass.getIdentifier().getIdentifier(), "", "");
        this.symbolTable.addRow(row);
        currentScope++;

        for (int i = 0; i < aClass.getClassBody().getClassAttributeList().size(); i++) {
            Row tempRow = new Row(
                    currentScope,
                    ctx.classBody().classAttribute().get(i).getStart().getLine(),
                    RowType.Attribute.toString(),
                    aClass.getClassBody().getClassAttributeList().get(i).getIdentifier().getIdentifier(),
                    aClass.getClassBody().getClassAttributeList().get(i).getType() != null ? aClass.getClassBody().getClassAttributeList().get(i).getType().getType() : "any",
                    "");
            this.symbolTable.addRow(tempRow);
        }

        for (int i = 0; i < aClass.getClassBody().getClassMethodList().size(); i++) {
            Row tempRow = new Row(currentScope, ctx.classBody().classMethod().get(i).getStart().getLine(), RowType.Function.toString(), aClass.getClassBody().getClassMethodList().get(i).getIdentifier() == null ? "constructor" : aClass.getClassBody().getClassMethodList().get(i).getIdentifier().getIdentifier(), aClass.getClassBody().getClassMethodList().get(i).getType().getType(), "");
            this.symbolTable.addRow(tempRow);
        }
        currentScope--;
        return aClass;
    }

    @Override
    public Export visitExport(AngularParser.ExportContext ctx) {
        Export export = new Export();
        export.setIdentifier(visitIdentifier(ctx.identifier()));
        return export;
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        if (!ctx.classAttribute().isEmpty())
            for (AngularParser.ClassAttributeContext classAttribute : ctx.classAttribute()) {
                classBody.addClassAttribute(visitClassAttribute(classAttribute));
            }
        if (!ctx.classMethod().isEmpty()) for (AngularParser.ClassMethodContext classMethod : ctx.classMethod()) {
            classBody.addClassMethod(visitClassMethod(classMethod));
        }
        return classBody;
    }

    @Override
    public ClassAttribute visitClassAttribute(AngularParser.ClassAttributeContext ctx) {
        ClassAttribute classAttribute = new ClassAttribute();
        if (ctx.accessModifiers() != null)
            classAttribute.setAccessModifiers(visitAccessModifiers(ctx.accessModifiers()));
        classAttribute.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.type() != null) classAttribute.setType(visitType(ctx.type()));
        if (ctx.assigningOperator() != null) {
            classAttribute.setAssigningOperator(visitAssigningOperator(ctx.assigningOperator()));
            classAttribute.setValue(visitValue(ctx.value()));
        }
        return classAttribute;
    }

    @Override
    public ClassMethod visitClassMethod(AngularParser.ClassMethodContext ctx) {
        ClassMethod classMethod = new ClassMethod();
        if (ctx.identifier() != null) {
            if (ctx.accessModifiers() != null) {
                classMethod.setAccessModifiers(visitAccessModifiers(ctx.accessModifiers()));
            }
            classMethod.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        classMethod.setArguments(visitArguments(ctx.arguments()));
        if (ctx.type() != null) classMethod.setType(visitType(ctx.type()));
        classMethod.setBlock(visitBlock(ctx.block()));
        return classMethod;
    }

    @Override
    public Block visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();
        if (!ctx.blockContent().isEmpty()) {
            for (AngularParser.BlockContentContext blockContent : ctx.blockContent()) {
                block.addBlockContent(visitBlockContent(blockContent));
            }
        }
        return block;
    }

    @Override
    public BlockContent visitBlockContent(AngularParser.BlockContentContext ctx) {
        currentScope++;
        BlockContent blockContent = new BlockContent();
        if (ctx.variable() != null) blockContent.setVariable(visitVariable(ctx.variable()));
        else if (ctx.function() != null) blockContent.setFunction(visitFunction(ctx.function()));
        else if (ctx.ifElseBlock() != null) blockContent.setIfElseBlock(visitIfElseBlock(ctx.ifElseBlock()));
        else if (ctx.forBlock() != null) blockContent.setForBlock(visitForBlock(ctx.forBlock()));
        else if (ctx.whileBlock() != null) blockContent.setWhileBlock(visitWhileBlock(ctx.whileBlock()));
        else blockContent.setaReturn(visitReturn(ctx.return_()));

        currentScope--;
        return blockContent;
    }

    @Override
    public Variable visitVariable(AngularParser.VariableContext ctx) {
        Variable variable = new Variable();

        if (ctx.variableDeclaration() != null)
            variable.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        else variable.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));

        if (ctx.variableAssigning() != null)
            variable.setVariableAssigning(visitVariableAssigning(ctx.variableAssigning()));

        Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Variable.toString(), variable.getVariableDeclaration().getIdentifier().getIdentifier(), variable.getVariableDeclaration().getType() != null ? variable.getVariableDeclaration().getType().getType() : "any", variable.getVariableAssigning() != null ? variable.getVariableAssigning().getStatementList().get(0).getValue().getValue() : "");
        this.symbolTable.addRow(row);
        return variable;
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.declaration() != null) variableDeclaration.setDeclaration(visitDeclaration(ctx.declaration()));
        variableDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.type() != null) variableDeclaration.setType(visitType(ctx.type()));
        return variableDeclaration;
    }

    @Override
    public VariableAccessing visitVariableAccessing(AngularParser.VariableAccessingContext ctx) {
        VariableAccessing variableAccessing = new VariableAccessing();
        if (ctx.chainingOperator(0) != null)
            variableAccessing.setFirstChainingOperator(visitChainingOperator(ctx.chainingOperator(0)));

        if (ctx.This() != null) variableAccessing.setKeyWordThis(ctx.This().getText());

        variableAccessing.setIdentifier(visitIdentifier(ctx.identifier()));

        if (!ctx.variableChaining().isEmpty())
            for (AngularParser.VariableChainingContext chaining : ctx.variableChaining())
                variableAccessing.addVariableChaining(visitVariableChaining(chaining));

        if (ctx.chainingOperator(1) != null)
            variableAccessing.setSecondChainingOperator(visitChainingOperator(ctx.chainingOperator(1)));

        Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Variable.toString(), (variableAccessing.getKeyWordThis() != null ? (variableAccessing.getKeyWordThis() + ".") : "") + variableAccessing.getIdentifier().getIdentifier(), "", "");
        symbolTable.addRow(row);

        return variableAccessing;
    }

    @Override
    public VariableChaining visitVariableChaining(AngularParser.VariableChainingContext ctx) {
        VariableChaining variableChaining = new VariableChaining();
        if (ctx.arrayElementAccessing() != null)
            variableChaining.setArrayElementAccess(visitArrayElementAccessing(ctx.arrayElementAccessing()));
        else if (ctx.functionCall() != null) variableChaining.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        else variableChaining.setPropertyAccess(visitPropertyAccessing(ctx.propertyAccessing()));
        return variableChaining;
    }

    @Override
    public VariableAssigning visitVariableAssigning(AngularParser.VariableAssigningContext ctx) {
        VariableAssigning variableAssigning = new VariableAssigning();
        variableAssigning.setAssigningOperator(visitAssigningOperator(ctx.assigningOperator()));
        if (!ctx.MathOperator().isEmpty()) for (int i = 0; i < ctx.MathOperator().size(); i++)
            variableAssigning.addMathOperator(ctx.MathOperator(i).getText());

        for (AngularParser.StatementContext statement : ctx.statement())
            variableAssigning.addStatement(visitStatement(statement));
        return variableAssigning;
    }

    @Override
    public PropertyAccessing visitPropertyAccessing(AngularParser.PropertyAccessingContext ctx) {
        PropertyAccessing propertyAccessing = new PropertyAccessing();
        propertyAccessing.setIdentifier(visitIdentifier(ctx.identifier()));
        return propertyAccessing;
    }

    @Override
    public ArrayElementAccessing visitArrayElementAccessing(AngularParser.ArrayElementAccessingContext ctx) {
        ArrayElementAccessing arrayElementAccessing = new ArrayElementAccessing();
        if (ctx.string() != null) arrayElementAccessing.setTypeString(visitString(ctx.string()));
        else arrayElementAccessing.setTypeNumber(visitNumber(ctx.number()));
        return arrayElementAccessing;
    }

    @Override
    public Function visitFunction(AngularParser.FunctionContext ctx) {
        Function function = new Function();
        if (ctx.functionDeclaration() != null)
            function.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        else function.setFunctionAccessing(visitFunctionAccessing(ctx.functionAccessing()));
        return function;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
        functionDeclaration.setArguments(visitArguments(ctx.arguments()));
        if (ctx.type() != null) functionDeclaration.setType(visitType(ctx.type()));

        Row row = new Row(currentScope, ctx.getStart().getLine(), RowType.Function.toString(), functionDeclaration.getIdentifier().getIdentifier(), "", "");
        this.symbolTable.addRow(row);

        functionDeclaration.setBlock(visitBlock(ctx.block()));
        return functionDeclaration;
    }

    @Override
    public FunctionAccessing visitFunctionAccessing(AngularParser.FunctionAccessingContext ctx) {
        FunctionAccessing functionAccessing = new FunctionAccessing();
        if (ctx.This() != null) {
            functionAccessing.setKeyWordThis(ctx.This().getText());
        }
        functionAccessing.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        if (!ctx.variableChaining().isEmpty()) {
            for (AngularParser.VariableChainingContext chaining : ctx.variableChaining()) {
                functionAccessing.addVariableChaining(visitVariableChaining(chaining));
            }
        }
        return functionAccessing;
    }

    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        functionCall.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.parameters() != null) functionCall.setParameters(visitParameters(ctx.parameters()));
        return functionCall;
    }

    @Override
    public IfElseBlock visitIfElseBlock(AngularParser.IfElseBlockContext ctx) {
        IfElseBlock ifElseBlock = new IfElseBlock();

        ifElseBlock.setIfStatement(visitIfStatement(ctx.ifStatement()));

        if (!ctx.ifElseStatement().isEmpty())
            for (AngularParser.IfElseStatementContext ifElseStatementContext : ctx.ifElseStatement())
                ifElseBlock.addIfElseStatement(visitIfElseStatement(ifElseStatementContext));

        if (ctx.elseStatement() != null) ifElseBlock.setElseStatement(visitElseStatement(ctx.elseStatement()));

        return ifElseBlock;
    }

    @Override
    public IfStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatement ifStatement = new IfStatement();
        ifStatement.setConditions(visitConditions(ctx.conditions()));
        ifStatement.setBlock(visitBlock(ctx.block()));
        return ifStatement;
    }

    @Override
    public IfElseStatement visitIfElseStatement(AngularParser.IfElseStatementContext ctx) {
        IfElseStatement ifElseStatement = new IfElseStatement();
        ifElseStatement.setConditions(visitConditions(ctx.conditions()));
        ifElseStatement.setBlock(visitBlock(ctx.block()));
        return ifElseStatement;
    }

    @Override
    public ElseStatement visitElseStatement(AngularParser.ElseStatementContext ctx) {
        ElseStatement elseStatement = new ElseStatement();
        elseStatement.setBlock(visitBlock(ctx.block()));
        return elseStatement;
    }

    @Override
    public ForBlock visitForBlock(AngularParser.ForBlockContext ctx) {
        ForBlock forBlock = new ForBlock();
        forBlock.setForStatment(visitForStatment(ctx.forStatment()));
        forBlock.setBlock(visitBlock(ctx.block()));
        return forBlock;
    }

    @Override
    public ForStatment visitForStatment(AngularParser.ForStatmentContext ctx) {
        ForStatment forStatment = new ForStatment();
        if (ctx.variable() != null) {
            forStatment.setVariable(visitVariable(ctx.variable()));
            forStatment.setConditions(visitConditions(ctx.conditions()));
            forStatment.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        } else {
            forStatment.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
            forStatment.setSecondVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        }
        return forStatment;
    }

    @Override
    public WhileBlock visitWhileBlock(AngularParser.WhileBlockContext ctx) {
        WhileBlock whileBlock = new WhileBlock();
        whileBlock.setWhileStatement(visitWhileStatement(ctx.whileStatement()));
        whileBlock.setBlock(visitBlock(ctx.block()));
        return whileBlock;
    }

    @Override
    public WhileStatement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        WhileStatement whileStatement = new WhileStatement();
        if (ctx.conditions() != null) whileStatement.setConditions(visitConditions(ctx.conditions()));
        return whileStatement;
    }

    @Override
    public Conditions visitConditions(AngularParser.ConditionsContext ctx) {
        Conditions conditions = new Conditions();
        if (!ctx.combiningOperator().isEmpty())
            for (AngularParser.CombiningOperatorContext combiningOperator : ctx.combiningOperator())
                conditions.addCombiningOperator(visitCombiningOperator(combiningOperator));

        for (AngularParser.ConditionContext condition : ctx.condition())
            conditions.addCondition(visitCondition(condition));

        return conditions;
    }

    @Override
    public Condition visitCondition(AngularParser.ConditionContext ctx) {
        Condition condition = new Condition();
        condition.setFirstStatement(visitStatement(ctx.statement(0)));
        condition.setConditionOperator(visitConditionalOperator(ctx.conditionalOperator()));
        condition.setSecondStatement(visitStatement(ctx.statement(1)));
        return condition;
    }

    @Override
    public Statement visitStatement(AngularParser.StatementContext ctx) {
        Statement statement = new Statement();
        if (ctx.variableAccessing() != null)
            statement.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        else if (ctx.functionAccessing() != null)
            statement.setFunctionAccessing(visitFunctionAccessing(ctx.functionAccessing()));
        else statement.setValue(visitValue(ctx.value()));
        return statement;
    }

    @Override
    public CombiningOperator visitCombiningOperator(AngularParser.CombiningOperatorContext ctx) {
        CombiningOperator combiningOperator = new CombiningOperator();
        if (ctx.AndOperator() != null) combiningOperator.setAndOperator(ctx.AndOperator().getText());
        else combiningOperator.setOrOperator(ctx.OrOperator().getText());
        return combiningOperator;
    }

    @Override
    public ConditionalOperator visitConditionalOperator(AngularParser.ConditionalOperatorContext ctx) {
        ConditionalOperator conditionalOperator = new ConditionalOperator();
        if (ctx.StrongConditionalEqual() != null)
            conditionalOperator.setStrongConditionalEqual(ctx.StrongConditionalEqual().getText());
        else if (ctx.StrongConditionalNotEqual() != null)
            conditionalOperator.setStrongConditionalNotEqual(ctx.StrongConditionalNotEqual().getText());
        else if (ctx.ConditionalEqual() != null)
            conditionalOperator.setConditionalEqual(ctx.ConditionalEqual().getText());
        else if (ctx.ConditionalNotEqual() != null)
            conditionalOperator.setConditionalNotEqual(ctx.ConditionalNotEqual().getText());
        else if (ctx.GreaterThan() != null) conditionalOperator.setGreaterThan(ctx.GreaterThan().getText());
        else if (ctx.GreaterOrEqual() != null) conditionalOperator.setGreaterOrEqual(ctx.GreaterOrEqual().getText());
        else if (ctx.LessThan() != null) conditionalOperator.setLessThan(ctx.LessThan().getText());
        else conditionalOperator.setLessOrEqual(ctx.LessOrEqual().getText());
        return conditionalOperator;
    }

    @Override
    public AssigningOperator visitAssigningOperator(AngularParser.AssigningOperatorContext ctx) {
        AssigningOperator assigningOperator = new AssigningOperator();
        if (ctx.Equal() != null) assigningOperator.setEqual(ctx.Equal().getText());
        else if (ctx.PlusEqual() != null) assigningOperator.setPlusEqual(ctx.PlusEqual().getText());
        else assigningOperator.setMinusEqual(ctx.MinusEqual().getText());
        return assigningOperator;
    }

    @Override
    public ChainingOperator visitChainingOperator(AngularParser.ChainingOperatorContext ctx) {
        ChainingOperator chainingOperator = new ChainingOperator();
        if (ctx.Increment() != null) chainingOperator.setIncrement(ctx.Increment().getText());
        else chainingOperator.setDecrement(ctx.Decrement().getText());
        return chainingOperator;
    }

    @Override
    public Arguments visitArguments(AngularParser.ArgumentsContext ctx) {
        Arguments arguments = new Arguments();
        if (!ctx.argument().isEmpty()) for (AngularParser.ArgumentContext argumentContext : ctx.argument())
            arguments.addArgument(visitArgument(argumentContext));
        return arguments;
    }

    @Override
    public Argument visitArgument(AngularParser.ArgumentContext ctx) {
        Argument argument = new Argument();
        if (ctx.accessModifiers() != null) argument.setAccessModifier(visitAccessModifiers(ctx.accessModifiers()));
        argument.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.QuestionMark() != null) argument.setQuestionMark(ctx.QuestionMark().getText());
        if (ctx.type() != null) argument.setType(visitType(ctx.type()));
        return argument;
    }

    @Override
    public Parameters visitParameters(AngularParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        for (AngularParser.ParameterContext parameterContext : ctx.parameter())
            parameters.addParameter(visitParameter(parameterContext));
        return parameters;

    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setValue(visitValue(ctx.value()));
        return parameter;
    }

    @Override
    public Declaration visitDeclaration(AngularParser.DeclarationContext ctx) {
        Declaration declaration = new Declaration();
        if (ctx.Let() != null) declaration.setDeclarationLet(ctx.Let().getText());
        else if (ctx.Const() != null) declaration.setDeclarationConst(ctx.Const().getText());
        else declaration.setDeclarationVar(ctx.Var().getText());
        return declaration;
    }

    @Override
    public AccessModifiers visitAccessModifiers(AngularParser.AccessModifiersContext ctx) {
        AccessModifiers modifiers = new AccessModifiers();
        if (ctx.Private() != null) modifiers.setModifierPrivate(ctx.Private().getText());
        else if (ctx.Public() != null) modifiers.setModifierPublic(ctx.Public().getText());
        else modifiers.setModifierProtected(ctx.Private().getText());
        return modifiers;
    }

    @Override
    public Type visitType(AngularParser.TypeContext ctx) {
        Type type = new Type();
        if (ctx.String() != null) type.setTypeString(ctx.String().getText());
        else if (ctx.Number() != null) type.setTypeNumber(ctx.Number().getText());
        else if (ctx.Boolean() != null) type.setTypeBoolean(ctx.Boolean().getText());
        else if (ctx.Any() != null) type.setTypeAny(ctx.Any().getText());
        else if (ctx.identifier() != null) type.setTypeIdentifier(visitIdentifier(ctx.identifier()));
        else if (ctx.objectType() != null) type.setTypeObject(visitObjectType(ctx.objectType()));
        else type.setTypeVoid(ctx.Void().getText());

        if (ctx.LeftSquareBracket() != null) {
            type.setLeftSquareBracket(ctx.LeftSquareBracket().getText());
            type.setRightSquareBracket(ctx.RightSquareBracket().getText());
        }

        return type;
    }

    @Override
    public Identifier visitIdentifier(AngularParser.IdentifierContext ctx) {
        Identifier identifier = new Identifier();
        identifier.setIdentifier(ctx.IDENTIFIER().getText());
        return identifier;
    }

    @Override
    public ObjectType visitObjectType(AngularParser.ObjectTypeContext ctx) {
        ObjectType objectType = new ObjectType();
        if (!ctx.propertyType().isEmpty()) {
            for (AngularParser.PropertyTypeContext propertyTypeContext : ctx.propertyType()) {
                objectType.addPropertyType(visitPropertyType(propertyTypeContext));
            }
        }
        if (!ctx.SemiColon().isEmpty()) {
            for (int i = 0; i < ctx.SemiColon().size(); i++) {
                objectType.addComma(ctx.SemiColon(i).getText());
            }
        }
        return objectType;
    }

    @Override
    public PropertyType visitPropertyType(AngularParser.PropertyTypeContext ctx) {
        PropertyType propertyType = new PropertyType();
        propertyType.setIdentifier(visitIdentifier(ctx.identifier()));
        propertyType.setType(visitType(ctx.type()));
        return propertyType;
    }

    @Override
    public Return visitReturn(AngularParser.ReturnContext ctx) {
        Return returnValue = new Return();
        if (ctx.statement() != null) returnValue.setStatement(visitStatement(ctx.statement()));
        return returnValue;
    }

    @Override
    public Value visitValue(AngularParser.ValueContext ctx) {
        Value value = new Value();
        if (ctx.string() != null) value.setTypeString(visitString(ctx.string()));
        else if (ctx.number() != null) value.setTypeNumber(visitNumber(ctx.number()));
        else if (ctx.boolean_() != null) value.setTypeBoolean(visitBoolean(ctx.boolean_()));
        else if (ctx.array() != null) value.setTypeArray(visitArray(ctx.array()));
        else if (ctx.object() != null) value.setTypeObject(visitObject(ctx.object()));
        else value.setAnonymousFunction(visitAnonymousFunction(ctx.anonymousFunction()));
        return value;
    }

    @Override
    public TypeString visitString(AngularParser.StringContext ctx) {
        TypeString typeString = new TypeString();
        if (ctx.SingleQuotationString() != null)
            typeString.setSingleQuotationString(ctx.SingleQuotationString().getText());
        else if (ctx.DoubleQuotationString() != null)
            typeString.setDoubleQuotationString(ctx.DoubleQuotationString().getText());
        else typeString.setMultiLinesString(ctx.MultiLinesString().getText());
        return typeString;
    }

    @Override
    public TypeNumber visitNumber(AngularParser.NumberContext ctx) {
        TypeNumber typeNumber = new TypeNumber();
        typeNumber.setNumber(ctx.NUMBER().getText());
        return typeNumber;
    }

    @Override
    public TypeBoolean visitBoolean(AngularParser.BooleanContext ctx) {
        TypeBoolean typeBoolean = new TypeBoolean();
        if (ctx.True() != null) typeBoolean.setStringTrue(ctx.True().getText());
        else typeBoolean.setStringFalse(ctx.False().getText());
        return typeBoolean;
    }

    @Override
    public TypeArray visitArray(AngularParser.ArrayContext ctx) {
        TypeArray typeArray = new TypeArray();
        if (!ctx.element().isEmpty()) {
            for (AngularParser.ElementContext elementContext : ctx.element()) {
                typeArray.addElementList(visitElement(elementContext));
            }
        }
        if (!ctx.Comma().isEmpty()) for (int i = 0; i < ctx.Comma().size(); i++)
            typeArray.addCommaList(ctx.Comma(i).getText());
        return typeArray;
    }

    @Override
    public TypeArrayElement visitElement(AngularParser.ElementContext ctx) {
        TypeArrayElement typeArrayElement = new TypeArrayElement();
        if (ctx.value() != null) typeArrayElement.setValue(visitValue(ctx.value()));
        else typeArrayElement.setVariableAccess(visitVariableAccessing(ctx.variableAccessing()));
        return typeArrayElement;
    }

    @Override
    public TypeObject visitObject(AngularParser.ObjectContext ctx) {
        TypeObject typeObject = new TypeObject();
        if (!ctx.property().isEmpty()) {
            for (AngularParser.PropertyContext propertyContext : ctx.property()) {
                typeObject.addObjectProperty(visitProperty(propertyContext));
            }
        }
        if (!ctx.Comma().isEmpty()) {
            for (int i = 0; i < ctx.Comma().size(); i++) {
                typeObject.addComma(ctx.Comma(i).getText());
            }
        }
        return typeObject;
    }

    @Override
    public TypeObjectProperty visitProperty(AngularParser.PropertyContext ctx) {
        TypeObjectProperty typeObjectProperty = new TypeObjectProperty();
        typeObjectProperty.setIdentifier(visitIdentifier(ctx.identifier()));
        typeObjectProperty.setValue(visitValue(ctx.value()));
        return typeObjectProperty;
    }

    @Override
    public AnonymousFunction visitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx) {
        AnonymousFunction anonymousFunction = new AnonymousFunction();
        anonymousFunction.setArguments(visitArguments(ctx.arguments()));
        if (ctx.type() != null) anonymousFunction.setType(visitType(ctx.type()));
        anonymousFunction.setBlock(visitBlock(ctx.block()));
        return anonymousFunction;
    }
}
