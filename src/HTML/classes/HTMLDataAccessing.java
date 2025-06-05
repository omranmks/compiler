package HTML.classes;
/*
Rule:
dataAccessing: variableAccessing | functionAccessing | value;

 */
public class HTMLDataAccessing {
    HTMLVariableAccessing variableAccessing;
    HTMLFunctionAccessing functionAccessing;
     HTMLValue value;

    public HTMLVariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public HTMLFunctionAccessing getFunctionAccessing() {
        return functionAccessing;
    }

    public HTMLValue getValue() {
        return value;
    }

    public void setVariableAccessing(HTMLVariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    public void setFunctionAccessing(HTMLFunctionAccessing functionAccessing) {
        this.functionAccessing = functionAccessing;
    }

    public void setValue(HTMLValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(variableAccessing!=null){
            return "\nDataAccessing{" +
                     variableAccessing.toString() +
                    '}';
        }
        if(functionAccessing!=null){
            return "\nDataAccessing{" +
                   functionAccessing.toString() +
                    '}';
        }
        return "\nDataAccessing{" +
                value.toString() +
                '}';
    }
}
