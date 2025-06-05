package Angular.classes;

/*
Rule:
variableChaining:   (
                        Dot propertyAccessing
                    )   |
                    (
                        Dot functionCall
                    )   |
                    arrayElementAccessing;
 */
public class VariableChaining {
    PropertyAccessing propertyAccess;
    FunctionCall functionCall;
    ArrayElementAccessing arrayElementAccess;

    public PropertyAccessing getPropertyAccess() {
        return propertyAccess;
    }


    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public ArrayElementAccessing getArrayElementAccess() {
        return arrayElementAccess;
    }

    public void setPropertyAccess(PropertyAccessing propertyAccess) {
        this.propertyAccess = propertyAccess;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public void setArrayElementAccess(ArrayElementAccessing arrayElementAccess) {
        this.arrayElementAccess = arrayElementAccess;
    }

    @Override
    public String toString() {
        if (propertyAccess != null)
            return "\nVariableChaining {" +
                    "\n, ." +
                    "\n, " + propertyAccess +
                    "\n}";
        else if (functionCall != null)
            return "\nVariableChaining{" +
                    "\n, ." +
                    "\n, " + functionCall +
                    "\n}";
        else
            return "\nVariableChaining{" +
                    "\narrayElementAccess=" + arrayElementAccess +
                    "\n}";
    }
}
