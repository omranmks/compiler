package HTML.classes;

/*
Rule:
value: string   |
       number   |
       boolean  ;

 */
public class HTMLValue {
    HTMLString string;
    HTMLNumber number;
    HTMLBoolean Boolean;

    public HTMLString getString() {
        return string;
    }

    public HTMLNumber getNumber() {
        return number;
    }

    public HTMLBoolean getTypeBoolean() {
        return Boolean;
    }

    public void setString(HTMLString string) {
        this.string = string;
    }

    public void setNumber(HTMLNumber number) {
        this.number = number;
    }

    public void setTypeBoolean(HTMLBoolean typeBoolean) {
        this.Boolean = typeBoolean;
    }

    @Override
    public String toString() {
        if (string != null)
            return "Value { " +
                    string.toString() +
                    " }";
        else if (number != null)
            return "Value { " +
                    number.toString() +
                    " }";
            return "Value { " +
                    Boolean.toString() +
                    " }";
    }
}
