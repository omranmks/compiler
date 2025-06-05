package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class IfElseBlock {
    IfStatement ifStatement;
    List<IfElseStatement> ifElseStatementList = new ArrayList<>();
    ElseStatement elseStatement;

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public List<IfElseStatement> getIfElseStatementList() {
        return ifElseStatementList;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public void setIfElseStatementList(List<IfElseStatement> ifElseStatementList) {
        this.ifElseStatementList = ifElseStatementList;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public void addIfElseStatement(IfElseStatement ifElseStatement) {
        ifElseStatementList.add(ifElseStatement);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nIfElseBlock{" +
                "\nifStatement=" + ifStatement.toString();
        if (!ifElseStatementList.isEmpty()) {
            finalString += "\n, ifElseStatementList=";
            for (IfElseStatement ifElseStatement : ifElseStatementList) {
                finalString += ifElseStatement.toString();
            }
        }
        if (elseStatement != null) {
            finalString += "\n, elseStatement=" + elseStatement.toString();
        }
        finalString += "\n}";
        return finalString;
    }
}
