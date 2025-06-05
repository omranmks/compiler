package HTML.classes;
/*
Rule:
eventAttribute: WhiteSpace+ LeftParenthesis WhiteSpace* attributeName WhiteSpace* RightParenthesis Equal
                DoubleQuotation WhiteSpace* functionAccessing WhiteSpace* DoubleQuotation;
 */
public class HTMLEventAttribute {
    HTMLAttributeName attributeName;
    HTMLFunctionAccessing functionAccessing;

    public HTMLAttributeName getAttributeName() {
        return attributeName;
    }

    public HTMLFunctionAccessing getFunctionAccessing() {
        return functionAccessing;
    }

    public void setAttributeName(HTMLAttributeName attributeName) {
        this.attributeName = attributeName;
    }

    public void setFunctionAccessing(HTMLFunctionAccessing functionAccessing) {
        this.functionAccessing = functionAccessing;
    }

    @Override
    public String toString() {
        return "\n EventAttribute{" +
                "\n ("+
                attributeName.toString() +
                "\n ) = \""+
                functionAccessing.toString() +
                "\n \" }";
    }
}
