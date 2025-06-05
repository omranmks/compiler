package Angular.classes;

/*
Rule:
chainingOperator: Increment | Decrement;
 */

public class ChainingOperator {
    String increment;
    String decrement;

    public String getIncrement() {
        return increment;
    }

    public String getDecrement() {
        return decrement;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public void setDecrement(String decrement) {
        this.decrement = decrement;
    }

    @Override
    public String toString() {
        if (increment != null)
            return "\nChainingOperator{" +
                    "\nincrement='" + increment + '\'' +
                    "\n}";
        else
            return "\nChainingOperator{" +
                    "\ndecrement='" + decrement + '\'' +
                    "\n}";
    }
}
