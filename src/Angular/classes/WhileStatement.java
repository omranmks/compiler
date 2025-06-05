package Angular.classes;

/*
Rule:
whileStatement: While
               LeftParenthesis
               conditions?
               RightParenthesis;
 */

public class WhileStatement {
    Conditions conditions;

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        if (conditions != null)
            return "\nWhileStatement{" +
                    "\n while" +
                    "\n, {" +
                    "\n, " + conditions.toString() +
                    "\n, }" +
                    "\n}";
        else
            return "\nWhileStatement{" +
                    "\n while" +
                    "\n, {" +
                    "\n, }" +
                    "\n}";
    }
}
