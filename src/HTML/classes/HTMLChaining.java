package HTML.classes;


/*
Rule:
chaining:   (
                        Dot propertyAccessing
                    )   |
                    (
                        Dot functionCall
                    )   |
                    arrayElementAccessing;
 */
public class HTMLChaining {
    HTMLPropertyAccessing propertyAccess;
    HTMLFunctionCall functionCall;
    HTMLArrayElementAccessing arrayElementAccess;

    public HTMLPropertyAccessing getPropertyAccess() {
        return propertyAccess;
    }


    public HTMLFunctionCall getFunctionCall() {
        return functionCall;
    }

    public HTMLArrayElementAccessing getArrayElementAccess() {
        return arrayElementAccess;
    }

    public void setPropertyAccess(HTMLPropertyAccessing propertyAccess) {
        this.propertyAccess = propertyAccess;
    }

    public void setFunctionCall(HTMLFunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public void setArrayElementAccess(HTMLArrayElementAccessing arrayElementAccess) {
        this.arrayElementAccess = arrayElementAccess;
    }

    @Override
    public String toString() {
        if (propertyAccess != null)
            return "\nVariableChaining {" +
                    "\n, ." +
                     propertyAccess.toString() +
                    "\n}";
        else if (functionCall != null)
            return "\nVariableChaining{" +
                    "\n, ." +
                     functionCall.toString() +
                    "\n}";
        else
            return "\nVariableChaining{" +
                    arrayElementAccess.toString() +
                    "\n}";
    }
}
