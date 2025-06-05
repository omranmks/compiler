package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
variableAccessing:  (
                        This Dot
                    )?
                    identifier
                    chaining*;

*/
public class HTMLVariableAccessing {
    String keyWordThis;
    HTMLIdentifier identifier;
    List<HTMLChaining> variableChainingList = new ArrayList<>();


    public String getKeyWordThis() {
        return keyWordThis;
    }

    public HTMLIdentifier getIdentifier() {
        return identifier;
    }

    public List<HTMLChaining> getVariableChainingList() {
        return variableChainingList;
    }



    public void setKeyWordThis(String keyWordThis) {
        this.keyWordThis = keyWordThis;
    }

    public void setIdentifier(HTMLIdentifier identifier) {
        this.identifier = identifier;
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
        finalString += "VariableAccessing {";
         if (keyWordThis != null) {
            finalString += "\n" + keyWordThis;
            finalString += ". ";
        }
        finalString += identifier.toString();
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
