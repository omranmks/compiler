package Angular.classes;

/*
Rule:
assigningOperator:  Equal       |
                    PlusEqual  |
                    MinusEqual;
 */
public class AssigningOperator {
    String equal;
    String plusEqual;
    String minusEqual;

    public String getEqual() {
        return equal;
    }

    public String getPlusEqual() {
        return plusEqual;
    }

    public String getMinusEqual() {
        return minusEqual;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public void setPlusEqual(String plusEqual) {
        this.plusEqual = plusEqual;
    }

    public void setMinusEqual(String minusEqual) {
        this.minusEqual = minusEqual;
    }

    @Override
    public String toString() {
        if (equal != null)
            return "AssigningOperator { " + equal + " }";
        else if (plusEqual != null)
            return "AssigningOperator { " + plusEqual + " }";
        else
            return "AssigningOperator {" + minusEqual + " }";
    }
}
