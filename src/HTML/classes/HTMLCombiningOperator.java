package HTML.classes;

public class HTMLCombiningOperator {
    String andOperator;
    String orOperator;

    public String getAndOperator() {
        return andOperator;
    }

    public String getOrOperator() {
        return orOperator;
    }

    public void setAndOperator(String andOperator) {
        this.andOperator = andOperator;
    }

    public void setOrOperator(String orOperator) {
        this.orOperator = orOperator;
    }

    @Override
    public String toString() {
        if (andOperator != null)
            return "\nCombiningOperator{" +
                    "\nandOperator='" + andOperator + '\'' +
                    "\n}";
        else
            return "\nCombiningOperator{" +
                    "\norOperator='" + orOperator + '\'' +
                    "\n}";
    }
}
