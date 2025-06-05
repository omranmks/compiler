package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
variableAssigning:  assigningOperator
                    (
                        statement
                        MathOperator
                    )*
                    statement;
 */

public class VariableAssigning {
    AssigningOperator assigningOperator;
    List<Statement> statementList = new ArrayList<>();
    List<String> mathOperatorList = new ArrayList<>();

    public AssigningOperator getAssigningOperator() {
        return assigningOperator;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public List<String> getMathOperatorList() {
        return mathOperatorList;
    }

    public void setAssigningOperator(AssigningOperator assigningOperator) {
        this.assigningOperator = assigningOperator;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public void setMathOperatorList(List<String> mathOperatorList) {
        this.mathOperatorList = mathOperatorList;
    }

    public void addStatement(Statement statement) {
        this.statementList.add(statement);
    }

    public void addMathOperator(String mathOperator) {
        this.mathOperatorList.add(mathOperator);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "VariableAssigning {";
        finalString += "\n" + assigningOperator.toString();
        for (int i = 0; i < statementList.size(); i++) {
            finalString += "\n";
            finalString += statementList.get(i).toString();
            try {
                finalString += mathOperatorList.get(i);
            } catch (Exception e) {
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
