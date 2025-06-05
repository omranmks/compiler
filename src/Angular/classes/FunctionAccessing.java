package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
functionAccessing: (
                       This Dot
                   )?
                   functionCall
                   variableChaining*;
 */
public class FunctionAccessing {
    String keyWordThis;
    FunctionCall functionCall;
    List<VariableChaining> variableChainingList = new ArrayList<>();

    public String getKeyWordThis() {
        return keyWordThis;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public List<VariableChaining> getVariableChainingList() {
        return variableChainingList;
    }

    public void setKeyWordThis(String keyWordThis) {
        this.keyWordThis = keyWordThis;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public void setVariableChainingList(List<VariableChaining> variableChainingList) {
        this.variableChainingList = variableChainingList;
    }

    public void addVariableChaining(VariableChaining variableChaining) {
        this.variableChainingList.add(variableChaining);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "FunctionAccessing {\n";
        if (keyWordThis != null){
            finalString += keyWordThis;
            finalString += ".";
        }
        finalString += "\n" + functionCall.toString();
        if(!variableChainingList.isEmpty()){
            for(VariableChaining variableChaining : variableChainingList){
                finalString += variableChaining.toString();
            }
        }
        return finalString;
    }
}
