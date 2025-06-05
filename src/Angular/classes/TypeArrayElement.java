package Angular.classes;

/*
Rule:
element: value;
 */

public class TypeArrayElement {
    Value value;
    VariableAccessing variableAccess;

    public Value getValue() {
        return value;
    }

    public VariableAccessing getVariableAccess() {
        return variableAccess;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setVariableAccess(VariableAccessing variableAccess) {
        this.variableAccess = variableAccess;
    }

    @Override
    public String toString() {
        if (value != null)
            return "Type Array Element { " +
                    value.toString() +
                    " }";
        return "Type Array Element { " +
                variableAccess.toString() +
                " }";
    }
}
