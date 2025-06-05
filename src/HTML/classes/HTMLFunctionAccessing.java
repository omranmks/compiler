package HTML.classes;


import java.util.ArrayList;
import java.util.List;

/*
Rule:
functionAccessing: (
                       This Dot
                   )?
                   functionCall
                   chaining*;
 */
public class HTMLFunctionAccessing {
    String keyWordThis;
    HTMLFunctionCall functionCall;
    List<HTMLChaining> variableChainingList = new ArrayList<>();


    public String getKeyWordThis() {
        return keyWordThis;
    }

    public HTMLFunctionCall getFunctionCall() {
        return functionCall;
    }

    public List<HTMLChaining> getVariableChainingList() {
        return variableChainingList;
    }

    public void setKeyWordThis(String keyWordThis) {
        this.keyWordThis = keyWordThis;
    }

    public void setFunctionCall(HTMLFunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public void setVariableChainingList(List<HTMLChaining> variableChainingList) {
        this.variableChainingList = variableChainingList;
    }

    public void addVariableChaining(HTMLChaining variableChaining) {
        variableChainingList.add(variableChaining);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "FunctionAccessing {";
        if (keyWordThis != null) {
            finalString += "\n" + keyWordThis;
            finalString += ". ";
        }
        finalString += functionCall.toString();
        if (!variableChainingList.isEmpty()) {
            for (HTMLChaining variableChaining : variableChainingList) {
                finalString += "\n";
                finalString += variableChaining.toString();
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
