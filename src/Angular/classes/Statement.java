package Angular.classes;

public class Statement {
    VariableAccessing variableAccessing;
    FunctionAccessing functionAccessing;
    Value value;

    public VariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public FunctionAccessing getFunctionAccessing() {
        return functionAccessing;
    }

    public Value getValue() {
        return value;
    }

    public void setVariableAccessing(VariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    public void setFunctionAccessing(FunctionAccessing functionAccessing) {
        this.functionAccessing = functionAccessing;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (variableAccessing != null)
            return "Statement {" +
                    "\n" + variableAccessing +
                    "\n}";
        else if (functionAccessing != null)
            return "Statement {" +
                    "\n" + functionAccessing +
                    "\n}";
        else
            return "Statement {" +
                    "\n" + value +
                    "\n}";
    }
}
