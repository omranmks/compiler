package HTML.classes;
/*
Rule:
conditionalOperator:  StrongConditionalEqual    |
                      StrongConditionalNotEqual |
                      ConditionalEqual          |
                      ConditionalNotEqual       |
                      RightAngleBracket         |
                      GreaterOrEqual            |
                      LeftAngleBracket          |
                      LessOrEqual               ;
 */
public class HTMLConditionalOperator {
    String strongConditionalEqual;
    String strongConditionalNotEqual;
    String conditionalEqual;
    String conditionalNotEqual;
    String RightAngleBracket;
    String greaterOrEqual;
    String LeftAngleBracket;
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

    public String getRightAngleBracket() {
        return RightAngleBracket;
    }

    public String getGreaterOrEqual() {
        return greaterOrEqual;
    }

    public String getLeftAngleBracket() {
        return LeftAngleBracket;
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

    public void setRightAngleBracket(String rightAngleBracket) {
        this.RightAngleBracket = rightAngleBracket;
    }

    public void setGreaterOrEqual(String greaterOrEqual) {
        this.greaterOrEqual = greaterOrEqual;
    }

    public void setLeftAngleBracket(String leftAngleBracket) {
        this.LeftAngleBracket = leftAngleBracket;
    }

    public void setLessOrEqual(String lessOrEqual) {
        this.lessOrEqual = lessOrEqual;
    }

    @Override
    public String toString() {
        if (strongConditionalEqual != null)
            return "\nConditionalOperator{" +
                    strongConditionalEqual + '\'' +
                    "\n}";
        else if (strongConditionalNotEqual != null)
            return "\nConditionalOperator{" +
                    strongConditionalNotEqual + '\'' +
                    "\n}";
        else if (conditionalEqual != null)
            return "\nConditionalOperator{" +
                    conditionalEqual + '\'' +
                    "\n}";
        else if (conditionalNotEqual != null)
            return "\nConditionalOperator{" +
                    conditionalNotEqual + '\'' +
                    "\n}";
        else if (RightAngleBracket != null)
            return "\nConditionalOperator{" +
                     RightAngleBracket + '\'' +
                    "\n}";
        else if (greaterOrEqual != null)
            return "\nConditionalOperator{" +
                     greaterOrEqual + '\'' +
                    "\n}";
        else if (LeftAngleBracket != null)
            return "\nConditionalOperator{" +
                    LeftAngleBracket + '\'' +
                    "\n}";
        else
            return "\nConditionalOperator{" +
                    lessOrEqual + '\'' +
                    "\n}";
    }
}
