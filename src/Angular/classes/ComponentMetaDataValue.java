package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetaDataValue {
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
        if(value != null){
            String finalString = "";
            finalString += "ComponentMetaDataValue { \n";
            finalString += value.toString();
            finalString += "\n}";
            return finalString;
        }
        String finalString = "";
        finalString += "ComponentMetaDataValue { \n";
        finalString += variableAccess.toString();
        finalString += "\n}";
        return finalString;

    }
}
