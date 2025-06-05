package Angular.classes;

/*
Rule:
return: Return
        statement?
        SemiColon;
 */

public class Return {
    Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        if (statement != null)
            return "Return {\n" +
                    "return " +
                    statement.toString() +
                    ";" +
                    "\n}";
        else
            return "Return {\n return; \n}";
    }
}
