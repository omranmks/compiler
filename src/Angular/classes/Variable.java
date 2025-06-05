package Angular.classes;

/*
Rule:
variable:   (
                variableDeclaration |
                variableAccessing
            )
            variableAssigning?
            SemiColon;
 */

public class Variable {
    VariableDeclaration variableDeclaration;
    VariableAccessing variableAccessing;
    VariableAssigning variableAssigning;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public VariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public VariableAssigning getVariableAssigning() {
        return variableAssigning;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public void setVariableAccessing(VariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    public void setVariableAssigning(VariableAssigning variableAssigning) {
        this.variableAssigning = variableAssigning;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "Variable {";
        if (variableDeclaration != null)
            finalString += variableDeclaration.toString();
        else
            finalString += "\n" + variableAccessing.toString();
        if (variableAssigning != null)
            finalString += "\n" + variableAssigning.toString();
        finalString += "\n; }";
        return finalString;
    }
}
