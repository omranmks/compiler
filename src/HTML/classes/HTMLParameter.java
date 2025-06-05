package HTML.classes;
/*
Rule:
parameter: value | variableAccessing;
 */
public class HTMLParameter {
HTMLValue value;
    HTMLVariableAccessing variableAccessing;

    public HTMLValue getValue() {
        return value;
    }

    public HTMLVariableAccessing getVariableAccessing() {
        return variableAccessing;
    }

    public void setValue(HTMLValue value) {
        this.value = value;
    }

    public void setVariableAccessing(HTMLVariableAccessing variableAccessing) {
        this.variableAccessing = variableAccessing;
    }

    @Override
    public String toString() {
        if(value!=null){
            return "\nParameter{" +
                    value.toString() +
                    "\n}";
        }
        return "Parameter{" +
                variableAccessing.toString() +
                "\n}";
    }
}
