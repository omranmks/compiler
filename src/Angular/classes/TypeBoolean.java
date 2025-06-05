package Angular.classes;

/*
Rule:
boolean: True | False;
 */

public class TypeBoolean {
    String stringTrue;
    String stringFalse;

    public String getStringTrue() {
        return stringTrue;
    }

    public String getStringFalse() {
        return stringFalse;
    }

    public void setStringTrue(String stringTrue) {
        this.stringTrue = stringTrue;
    }

    public void setStringFalse(String stringFalse) {
        this.stringFalse = stringFalse;
    }

    @Override
    public String toString() {
        if (stringTrue != null)
            return "\nTypeBoolean { " + stringTrue + " }";
        else
            return "\nTypeBoolean { " + stringFalse + " }";
    }
}
