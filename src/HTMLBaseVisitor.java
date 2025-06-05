import Angular.classes.CombiningOperator;
import Angular.gen.AngularParser;
import HTML.classes.*;
import HTML.gen.HTMLParser;
import HTML.gen.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HTMLBaseVisitor extends HTMLParserBaseVisitor {

    SymbolTable symbolTable;

    public HTMLBaseVisitor(SymbolTable sm) {
        this.symbolTable = sm;
    }

    @Override
    public HTMLhtmlTag visitHtmlTag(HTMLParser.HtmlTagContext ctx) {
        HTMLhtmlTag htmLhtmlTag = new HTMLhtmlTag();
        htmLhtmlTag.setTag(visitTag(ctx.tag()));
        return htmLhtmlTag;
    }

    @Override
    public HTMLTag visitTag(HTMLParser.TagContext ctx) {
        HTMLTag tag = new HTMLTag();
        if (ctx.regularTag() != null)
            tag.setRegularTag(visitRegularTag(ctx.regularTag()));
        else
            tag.setSelfCloseTag(visitSelfClosedTag(ctx.selfClosedTag()));
        return tag;
    }

    @Override
    public HTMLRegularTag visitRegularTag(HTMLParser.RegularTagContext ctx) {
        HTMLRegularTag regularTag = new HTMLRegularTag();
        regularTag.setOpenTag(visitOpenTag(ctx.openTag()));
        regularTag.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        regularTag.setCloseTag(visitCloseTag(ctx.closeTag()));
        return regularTag;
    }

    @Override
    public HTMLOpenTag visitOpenTag(HTMLParser.OpenTagContext ctx) {
        HTMLOpenTag openTag = new HTMLOpenTag();
        openTag.setOpenTag(ctx.HTMLOpenTag().getText());
        if (!ctx.htmlAttribute().isEmpty()) {
            for (HTMLParser.HtmlAttributeContext tagContext : ctx.htmlAttribute())
                openTag.addHtmlAttribute(visitHtmlAttribute(tagContext));
        } else if (!ctx.ngAttribute().isEmpty()) {
            for (HTMLParser.NgAttributeContext interpolationContext : ctx.ngAttribute())
                openTag.addngAttribute(visitNgAttribute(interpolationContext));
        } else {
            for (HTMLParser.EventAttributeContext contentContext : ctx.eventAttribute())
                openTag.addEventAttributw(visitEventAttribute(contentContext));
        }
        return openTag;
    }

    @Override
    public HTMLCloseTag visitCloseTag(HTMLParser.CloseTagContext ctx) {
        HTMLCloseTag closeTag = new HTMLCloseTag();
        closeTag.setCloseTag(ctx.HTMLCloseTag().getText());
        return closeTag;
    }

    @Override
    public HTMLSelfCloseTag visitSelfClosedTag(HTMLParser.SelfClosedTagContext ctx) {
        HTMLSelfCloseTag selfCloseTag = new HTMLSelfCloseTag();
        selfCloseTag.setOpenTag(ctx.HTMLOpenTag().getText());
        if (!ctx.htmlAttribute().isEmpty()) {
            for (HTMLParser.HtmlAttributeContext tagContext : ctx.htmlAttribute())
                selfCloseTag.addHtmlAttribute(visitHtmlAttribute(tagContext));
        } else if (!ctx.ngAttribute().isEmpty()) {
            for (HTMLParser.NgAttributeContext interpolationContext : ctx.ngAttribute())
                selfCloseTag.addngAttribute(visitNgAttribute(interpolationContext));
        } else {
            for (HTMLParser.EventAttributeContext contentContext : ctx.eventAttribute())
                selfCloseTag.addEventAttributw(visitEventAttribute(contentContext));
        }

        selfCloseTag.setSelfCloseTag(ctx.HTMLSelfCloseTag().getText());


        return selfCloseTag;
    }

    @Override
    public HTMLhtmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        HTMLhtmlContent htmLhtmlContent = new HTMLhtmlContent();
        if (!ctx.htmlTag().isEmpty()) {
            for (HTMLParser.HtmlTagContext tagContext : ctx.htmlTag())
                htmLhtmlContent.addHtmlTag(visitHtmlTag(tagContext));
        } else if (!ctx.interpolation().isEmpty()) {
            for (HTMLParser.InterpolationContext interpolationContext : ctx.interpolation())
                htmLhtmlContent.addInterpolation(visitInterpolation(interpolationContext));
        } else {
            for (HTMLParser.ContentContext contentContext : ctx.content())
                htmLhtmlContent.addContent(visitContent(contentContext));
        }

        return htmLhtmlContent;
    }

    @Override
    public HTMLContnet visitContent(HTMLParser.ContentContext ctx) {
        HTMLContnet contnet = new HTMLContnet();
        if (!ctx.CONTENT().isEmpty()) {
            for (TerminalNode contentContext : ctx.CONTENT())
                contnet.addString(contentContext.getText());
        }
        for (TerminalNode wordContext : ctx.WORD())
            contnet.addWord(wordContext.getText());
        return contnet;
    }

    @Override
    public HTMLhtmlAttribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        HTMLhtmlAttribute htmLhtmlAttribute = new HTMLhtmlAttribute();
        htmLhtmlAttribute.setAttributeName(ctx.AttributeName().getText());
        if (ctx.LeftSquareBracket() != null) {
            htmLhtmlAttribute.setLeftSquareBracket(ctx.LeftSquareBracket().getText());
            htmLhtmlAttribute.setDataAccessing(visitDataAccessing(ctx.dataAccessing()));
        } else
            for (HTMLParser.AttributeValueContext attributeContext : ctx.attributeValue())
                htmLhtmlAttribute.addAttributeValue(visitAttributeValue(attributeContext));
        return htmLhtmlAttribute;
    }

    @Override
    public HTMLAttributeValue visitAttributeValue(HTMLParser.AttributeValueContext ctx) {
        HTMLAttributeValue attributeValue = new HTMLAttributeValue();
        if (ctx.WORD() != null)
            attributeValue.setWord(ctx.WORD().getText());
        else if (ctx.Sign() != null) {
            attributeValue.setSign(ctx.Sign().getText());
        } else if (ctx.NUMBER() != null) {
            attributeValue.setNumber(ctx.NUMBER().getText());
        } else
            attributeValue.setDot(ctx.Dot().getText());
        return attributeValue;
    }

    @Override
    public HTMLngAttribute visitNgAttribute(HTMLParser.NgAttributeContext ctx) {
        HTMLngAttribute lngAttribute = new HTMLngAttribute();
        if (ctx.ngFor() != null)
            lngAttribute.setNgFor(visitNgFor(ctx.ngFor()));
        lngAttribute.setNgIf(visitNgIf(ctx.ngIf()));
        return lngAttribute;
    }

    @Override
    public HTMLngIf visitNgIf(HTMLParser.NgIfContext ctx) {
        HTMLngIf lngIf = new HTMLngIf();
        if (ctx.dataAccessing() != null)
            lngIf.setDataAccessing(visitDataAccessing(ctx.dataAccessing()));
        else
            lngIf.setCondition(visitConditions(ctx.conditions()));
        return lngIf;
    }

    @Override
    public HTMLngFor visitNgFor(HTMLParser.NgForContext ctx) {
        HTMLngFor ngFor = new HTMLngFor();
        if (ctx.forStatment(0) != null)
            ngFor.setForStatement(visitForStatment(ctx.forStatment(0)));
        if (ctx.forStatment(1) != null)
            ngFor.setSecondForStatement(visitForStatment(ctx.forStatment(1)));

        return ngFor;
    }

    @Override
    public HTMLForStatement visitForStatment(HTMLParser.ForStatmentContext ctx) {
        HTMLForStatement forStatement = new HTMLForStatement();
        forStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        if (ctx.variableAccessing() != null)
            forStatement.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        forStatement.setIndex(ctx.Index().getText());
        return forStatement;
    }

    @Override
    public HTMLVariableDeclaration visitVariableDeclaration(HTMLParser.VariableDeclarationContext ctx) {
        HTMLVariableDeclaration variableDeclaration = new HTMLVariableDeclaration();
        variableDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
        return variableDeclaration;
    }

    @Override
    public HTMLEventAttribute visitEventAttribute(HTMLParser.EventAttributeContext ctx) {
        HTMLEventAttribute eventAttribute = new HTMLEventAttribute();
        eventAttribute.setAttributeName(visitAttributeName(ctx.attributeName()));
        eventAttribute.setFunctionAccessing(visitFunctionAccessing(ctx.functionAccessing()));
        return eventAttribute;
    }

    @Override
    public HTMLAttributeName visitAttributeName(HTMLParser.AttributeNameContext ctx) {
        HTMLAttributeName attributeName = new HTMLAttributeName();
        if (ctx.EventClick() != null)
            attributeName.setEventClick(ctx.EventClick().getText());
        attributeName.setEventFocus(ctx.EventFocus().getText());
        return attributeName;
    }

    @Override
    public HTMLInterpolation visitInterpolation(HTMLParser.InterpolationContext ctx) {
        HTMLInterpolation interpolation = new HTMLInterpolation();
        interpolation.setStatement(visitStatement(ctx.statement()));

        Row row = new Row(
                0,
                ctx.getStart().getLine(),
                RowType.Html.toString(),
                interpolation.getStatement().getDataAccessingList().get(0).getVariableAccessing().getIdentifier().getWord(),
                "",
                ""
        );
        this.symbolTable.addRow(row);

        return interpolation;
    }

    @Override
    public HTMLConditions visitConditions(HTMLParser.ConditionsContext ctx) {
        HTMLConditions conditions = new HTMLConditions();
        if (!ctx.combiningOperator().isEmpty())
            for (HTMLParser.CombiningOperatorContext combiningOperator : ctx.combiningOperator())
                conditions.addCombiningOperator(visitCombiningOperator(combiningOperator));

        for (HTMLParser.ConditionContext condition : ctx.condition())
            conditions.addCondition(visitCondition(condition));

        return conditions;
    }

    @Override
    public HTMLCondition visitCondition(HTMLParser.ConditionContext ctx) {
        HTMLCondition condition = new HTMLCondition();
        condition.setFirstStatement(visitStatement(ctx.statement(0)));
        condition.setConditionOperator(visitConditionalOperator(ctx.conditionalOperator()));
        condition.setSecondStatement(visitStatement(ctx.statement(1)));

        return condition;
    }

    @Override
    public HTMLStatement visitStatement(HTMLParser.StatementContext ctx) {
        HTMLStatement statement = new HTMLStatement();
        if (!ctx.dataAccessing().isEmpty()) {
            for (HTMLParser.DataAccessingContext tagContext : ctx.dataAccessing())
                statement.adddataAccessing(visitDataAccessing(tagContext));
        }
        if (!ctx.Star().isEmpty()) {
            for (TerminalNode tagContext : ctx.Star())
                statement.addstar(tagContext.toString());
        } else if (!ctx.Sign().isEmpty()) {
            for (TerminalNode interpolationContext : ctx.Sign())
                statement.addsign(interpolationContext.getText());
        } else {
            for (TerminalNode interpolationContext : ctx.Slash())
                statement.addSlash(interpolationContext.getText());
        }
        return statement;
    }

    @Override
    public HTMLCombiningOperator visitCombiningOperator(HTMLParser.CombiningOperatorContext ctx) {
        HTMLCombiningOperator combiningOperator = new HTMLCombiningOperator();
        if (ctx.AndOperator() != null)
            combiningOperator.setAndOperator(ctx.AndOperator().getText());
        else
            combiningOperator.setOrOperator(ctx.OrOperator().getText());
        return combiningOperator;
    }

    @Override
    public HTMLConditionalOperator visitConditionalOperator(HTMLParser.ConditionalOperatorContext ctx) {
        HTMLConditionalOperator conditionalOperator = new HTMLConditionalOperator();
        if (ctx.StrongConditionalEqual() != null)
            conditionalOperator.setStrongConditionalEqual(ctx.StrongConditionalEqual().getText());
        else if (ctx.StrongConditionalNotEqual() != null)
            conditionalOperator.setStrongConditionalNotEqual(ctx.StrongConditionalNotEqual().getText());
        else if (ctx.ConditionalEqual() != null)
            conditionalOperator.setConditionalEqual(ctx.ConditionalEqual().getText());
        else if (ctx.ConditionalNotEqual() != null)
            conditionalOperator.setConditionalNotEqual(ctx.ConditionalNotEqual().getText());
        else if (ctx.RightAngleBracket() != null)
            conditionalOperator.setRightAngleBracket(ctx.RightAngleBracket().getText());
        else if (ctx.GreaterOrEqual() != null)
            conditionalOperator.setGreaterOrEqual(ctx.GreaterOrEqual().getText());
        else if (ctx.LeftAngleBracket() != null)
            conditionalOperator.setLeftAngleBracket(ctx.LeftAngleBracket().getText());
        else
            conditionalOperator.setLessOrEqual(ctx.LessOrEqual().getText());
        return conditionalOperator;
    }

    @Override
    public HTMLDataAccessing visitDataAccessing(HTMLParser.DataAccessingContext ctx) {
        HTMLDataAccessing dataAccessing = new HTMLDataAccessing();
        if (ctx.variableAccessing() != null)
            dataAccessing.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        else if (ctx.functionAccessing() != null) {
            dataAccessing.setFunctionAccessing(visitFunctionAccessing(ctx.functionAccessing()));
        } else
            dataAccessing.setValue(visitValue(ctx.value()));
        return dataAccessing;
    }

    @Override
    public HTMLFunctionAccessing visitFunctionAccessing(HTMLParser.FunctionAccessingContext ctx) {
        HTMLFunctionAccessing functionAccessing = new HTMLFunctionAccessing();
        if (ctx.This() != null)
            functionAccessing.setKeyWordThis(ctx.This().getText());
        functionAccessing.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        if (!ctx.chaining().isEmpty()) {
            for (HTMLParser.ChainingContext chaining : ctx.chaining())
                functionAccessing.addVariableChaining(visitChaining(chaining));
        }

        return functionAccessing;
    }

    @Override
    public HTMLVariableAccessing visitVariableAccessing(HTMLParser.VariableAccessingContext ctx) {
        HTMLVariableAccessing variableAccessing = new HTMLVariableAccessing();
        if (ctx.This() != null)
            variableAccessing.setKeyWordThis(ctx.This().getText());
        variableAccessing.setIdentifier(visitIdentifier(ctx.identifier()));
        if (!ctx.chaining().isEmpty()) {
            for (HTMLParser.ChainingContext chaining : ctx.chaining())
                variableAccessing.addVariableChaining(visitChaining(chaining));
        }

        return variableAccessing;
    }

    @Override
    public HTMLChaining visitChaining(HTMLParser.ChainingContext ctx) {
        HTMLChaining chaining = new HTMLChaining();
        if (ctx.propertyAccessing() != null)
            chaining.setPropertyAccess(visitPropertyAccessing(ctx.propertyAccessing()));
        else if (ctx.functionCall() != null) {
            chaining.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        } else
            chaining.setArrayElementAccess(visitArrayElementAccessing(ctx.arrayElementAccessing()));
        return chaining;
    }

    @Override
    public HTMLIdentifier visitIdentifier(HTMLParser.IdentifierContext ctx) {
        HTMLIdentifier identifier = new HTMLIdentifier();
        identifier.setWord(ctx.WORD().getText());
        return identifier;
    }

    @Override
    public HTMLPropertyAccessing visitPropertyAccessing(HTMLParser.PropertyAccessingContext ctx) {
        HTMLPropertyAccessing propertyAccessing = new HTMLPropertyAccessing();
        propertyAccessing.setIdentifier(visitIdentifier(ctx.identifier()));
        return propertyAccessing;
    }

    @Override
    public HTMLFunctionCall visitFunctionCall(HTMLParser.FunctionCallContext ctx) {
        HTMLFunctionCall functionCall = new HTMLFunctionCall();
        functionCall.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.parameters() != null)
            functionCall.setParameters(visitParameters(ctx.parameters()));
        return functionCall;
    }

    @Override
    public HTMLArrayElementAccessing visitArrayElementAccessing(HTMLParser.ArrayElementAccessingContext ctx) {
        HTMLArrayElementAccessing arrayElementAccessing = new HTMLArrayElementAccessing();

        if (ctx.string() != null)
            arrayElementAccessing.setTypeString(visitString(ctx.string()));
        else
            arrayElementAccessing.setTypeNumber(visitNumber(ctx.number()));
        return arrayElementAccessing;
    }

    @Override
    public HTMLParameters visitParameters(HTMLParser.ParametersContext ctx) {
        HTMLParameters parameters = new HTMLParameters();
        for (HTMLParser.ParameterContext parameterContext : ctx.parameter())
            parameters.addParameter(visitParameter(parameterContext));
        return parameters;
    }

    @Override
    public HTMLParameter visitParameter(HTMLParser.ParameterContext ctx) {
        HTMLParameter parameter = new HTMLParameter();

        if (ctx.value() != null)
            parameter.setValue(visitValue(ctx.value()));
        parameter.setVariableAccessing(visitVariableAccessing(ctx.variableAccessing()));
        return parameter;
    }

    @Override
    public HTMLValue visitValue(HTMLParser.ValueContext ctx) {
        HTMLValue value = new HTMLValue();

        if (ctx.string() != null) {
            value.setString(visitString(ctx.string()));
        } else if (ctx.number() != null) {
            value.setNumber(visitNumber(ctx.number()));
        }
        value.setTypeBoolean(visitBoolean(ctx.boolean_()));

        return value;
    }

    @Override
    public HTMLString visitString(HTMLParser.StringContext ctx) {
        HTMLString string = new HTMLString();

        if (ctx.SingleQuotation() != null)
            string.setSingleQuotation(ctx.SingleQuotation().toString());

        if (ctx.DoubleQuotation() != null)
            string.setDoubleQuotation(ctx.DoubleQuotation().toString());

        if (ctx.Backtick() != null)
            string.setBacktick(ctx.Backtick().toString());

        if (ctx.WORD() != null)
            string.setWord(ctx.WORD().getText());
        return string;
    }

    @Override
    public HTMLNumber visitNumber(HTMLParser.NumberContext ctx) {
        HTMLNumber number = new HTMLNumber();
        if (ctx.NUMBER() != null)
            number.setNumber(ctx.NUMBER().getText());
        return number;
    }

    @Override
    public HTMLBoolean visitBoolean(HTMLParser.BooleanContext ctx) {
        HTMLBoolean Boolean = new HTMLBoolean();
        if (ctx.True() != null)
            Boolean.setAtrue(ctx.True().getText());
        if (ctx.False() != null)
            Boolean.setAfalse(ctx.False().getText());
        return Boolean;
    }
}
