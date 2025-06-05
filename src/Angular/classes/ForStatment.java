package Angular.classes;

public class ForStatment {
    Variable variable;
    Conditions conditions;
    VariableAccessing variableAccessing;
    VariableDeclaration variableDeclaration;
    VariableAccessing secondVariableAccessing;

    public Variable getVariable() {
        return variable;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public VariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public VariableAccessing getSecondVariableAccessing() {
        return secondVariableAccessing;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public void setVariableAccessing(VariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public void setSecondVariableAccessing(VariableAccessing secondVariableAccessing) {
        this.secondVariableAccessing = secondVariableAccessing;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nForStatment {";
        finalString += "\n for";
        finalString += "\n (";
        if (variable != null) {
            finalString += "\n" + variable.toString();
            finalString += "\n" + conditions.toString();
            finalString += "\n ;";
            finalString += "\n" + variableAccessing.toString();
        } else {
            finalString += "\n" + variableDeclaration.toString();
            finalString += "\n of";
            finalString += "\n" + secondVariableAccessing.toString();
        }
        finalString += "\n )";
        finalString += "\n}";
        return finalString;
    }
}


