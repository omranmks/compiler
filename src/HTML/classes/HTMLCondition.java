package HTML.classes;

/*
Rule:
condition:  statement
            WhiteSpace*
            conditionalOperator
            WhiteSpace*
            statement;
 */

public class HTMLCondition {
    HTMLStatement firstStatement;
    HTMLConditionalOperator conditionOperator;
    HTMLStatement secondStatement;

    public HTMLStatement getFirstStatement() {
        return firstStatement;
    }

    public HTMLConditionalOperator getConditionOperator() {
        return conditionOperator;
    }

    public HTMLStatement getSecondStatement() {
        return secondStatement;
    }

    public void setFirstStatement(HTMLStatement firstStatement) {
        this.firstStatement = firstStatement;
    }

    public void setConditionOperator(HTMLConditionalOperator conditionOperator) {
        this.conditionOperator = conditionOperator;
    }

    public void setSecondStatement(HTMLStatement secondStatement) {
        this.secondStatement = secondStatement;
    }

    @Override
    public String toString() {
        return "\nCondition{" +
                firstStatement.toString() +
                conditionOperator.toString() +
                secondStatement.toString() +
                "\n}";
    }
}
