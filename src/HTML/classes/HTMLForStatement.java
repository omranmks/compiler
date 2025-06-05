package HTML.classes;


/*
Rule:
forStatment:    variableDeclaration
                WhiteSpace+
                Of
                WhiteSpace+
                (variableAccessing | Index);
 */
public class HTMLForStatement {

    HTMLVariableDeclaration variableDeclaration;
    HTMLVariableAccessing variableAccessing;

    String index;


    public HTMLVariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public HTMLVariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public String getIndex() {
        return index;
    }

    public void setVariableAccessing(HTMLVariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    public void setVariableDeclaration(HTMLVariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nForStatment {";
            finalString += "\n" + variableDeclaration.toString();
            finalString += "\n of";
            if(index!=null)
            finalString += "\n" + index;
            finalString += "\n" + variableAccessing.toString();
            finalString += "\n}";
        return finalString;
    }
}
