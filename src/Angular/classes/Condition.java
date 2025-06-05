package Angular.classes;

/*
Rule:
condition:  statement
            conditionalOperator
            statement;
 */
public class Condition {
    Statement firstStatement;
    ConditionalOperator conditionOperator;
    Statement secondStatement;

    public Statement getFirstStatement() {
        return firstStatement;
    }

    public ConditionalOperator getConditionOperator() {
        return conditionOperator;
    }

    public Statement getSecondStatement() {
        return secondStatement;
    }

    public void setFirstStatement(Statement firstStatement) {
        this.firstStatement = firstStatement;
    }

    public void setConditionOperator(ConditionalOperator conditionOperator) {
        this.conditionOperator = conditionOperator;
    }

    public void setSecondStatement(Statement secondStatement) {
        this.secondStatement = secondStatement;
    }

    @Override
    public String toString() {
        return "\nCondition{" +
                "\nfirstStatement=" + firstStatement.toString() +
                "\n, conditionOperator=" + conditionOperator.toString() +
                "\n, secondStatement=" + secondStatement.toString() +
                "\n}";
    }
}
