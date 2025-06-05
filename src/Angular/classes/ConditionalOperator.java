package Angular.classes;

/*
Rule:
conditionalOperator:  StrongConditionalEqual    |
                      StrongConditionalNotEqual |
                      ConditionalEqual          |
                      ConditionalNotEqual       |
                      GreaterThan               |
                      GreaterOrEqual            |
                      LessThan                  |
                      LessOrEqual               ;
 */
public class ConditionalOperator {
    String strongConditionalEqual;
    String strongConditionalNotEqual;
    String conditionalEqual;
    String conditionalNotEqual;
    String greaterThan;
    String greaterOrEqual;
    String lessThan;
    String lessOrEqual;

    public String getStrongConditionalEqual() {
        return strongConditionalEqual;
    }

    public String getStrongConditionalNotEqual() {
        return strongConditionalNotEqual;
    }

    public String getConditionalEqual() {
        return conditionalEqual;
    }

    public String getConditionalNotEqual() {
        return conditionalNotEqual;
    }

    public String getGreaterThan() {
        return greaterThan;
    }

    public String getGreaterOrEqual() {
        return greaterOrEqual;
    }

    public String getLessThan() {
        return lessThan;
    }

    public String getLessOrEqual() {
        return lessOrEqual;
    }

    public void setStrongConditionalEqual(String strongConditionalEqual) {
        this.strongConditionalEqual = strongConditionalEqual;
    }

    public void setStrongConditionalNotEqual(String strongConditionalNotEqual) {
        this.strongConditionalNotEqual = strongConditionalNotEqual;
    }

    public void setConditionalEqual(String conditionalEqual) {
        this.conditionalEqual = conditionalEqual;
    }

    public void setConditionalNotEqual(String conditionalNotEqual) {
        this.conditionalNotEqual = conditionalNotEqual;
    }

    public void setGreaterThan(String greaterThan) {
        this.greaterThan = greaterThan;
    }

    public void setGreaterOrEqual(String greaterOrEqual) {
        this.greaterOrEqual = greaterOrEqual;
    }

    public void setLessThan(String lessThan) {
        this.lessThan = lessThan;
    }

    public void setLessOrEqual(String lessOrEqual) {
        this.lessOrEqual = lessOrEqual;
    }

    @Override
    public String toString() {
        if (strongConditionalEqual != null)
            return "\nConditionalOperator{" +
                    "\nstrongConditionalEqual='" + strongConditionalEqual + '\'' +
                    "\n}";
        else if (strongConditionalNotEqual != null)
            return "\nConditionalOperator{" +
                    "\nstrongConditionalNotEqual='" + strongConditionalNotEqual + '\'' +
                    "\n}";
        else if (conditionalEqual != null)
            return "\nConditionalOperator{" +
                    "\nconditionalEqual='" + conditionalEqual + '\'' +
                    "\n}";
        else if (conditionalNotEqual != null)
            return "\nConditionalOperator{" +
                    "\nconditionalNotEqual='" + conditionalNotEqual + '\'' +
                    "\n}";
        else if (greaterThan != null)
            return "\nConditionalOperator{" +
                    "\ngreaterThan='" + greaterThan + '\'' +
                    "\n}";
        else if (greaterOrEqual != null)
            return "\nConditionalOperator{" +
                    "\ngreaterOrEqual='" + greaterOrEqual + '\'' +
                    "\n}";
        else if (lessThan != null)
            return "\nConditionalOperator{" +
                    "\nlessThan='" + lessThan + '\'' +
                    "\n}";
        else
            return "\nConditionalOperator{" +
                    "\nlessOrEqual='" + lessOrEqual + '\'' +
                    "\n}";
    }
}
