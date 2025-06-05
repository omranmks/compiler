package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
variableAccessing:  chainingOperator?
                    (
                        This Dot
                    )?
                    identifier
                    variableChaining*
                    chainingOperator?;
 */

public class VariableAccessing {
    ChainingOperator firstChainingOperator;
    String keyWordThis;
    Identifier identifier;
    List<VariableChaining> variableChainingList = new ArrayList<>();
    ChainingOperator secondChainingOperator;

    public ChainingOperator getFirstChainingOperator() {
        return firstChainingOperator;
    }

    public String getKeyWordThis() {
        return keyWordThis;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public List<VariableChaining> getVariableChainingList() {
        return variableChainingList;
    }

    public ChainingOperator getSecondChainingOperator() {
        return secondChainingOperator;
    }

    public void setFirstChainingOperator(ChainingOperator firstChainingOperator) {
        this.firstChainingOperator = firstChainingOperator;
    }

    public void setKeyWordThis(String keyWordThis) {
        this.keyWordThis = keyWordThis;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setVariableChainingList(List<VariableChaining> variableChainingList) {
        this.variableChainingList = variableChainingList;
    }

    public void setSecondChainingOperator(ChainingOperator secondChainingOperator) {
        this.secondChainingOperator = secondChainingOperator;
    }

    public void addVariableChaining(VariableChaining variableChaining) {
        variableChainingList.add(variableChaining);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "VariableAccessing {";
        if (firstChainingOperator != null)
            finalString += "\n" + firstChainingOperator.toString();
        if (keyWordThis != null) {
            finalString += "\n" + keyWordThis;
            finalString += ". ";
        }
        finalString += identifier.toString();
        if (!variableChainingList.isEmpty()) {
            for (VariableChaining variableChaining : variableChainingList) {
                finalString += "\n";
                finalString += variableChaining.toString();
            }
        }
        if (secondChainingOperator != null)
            finalString += "\n, " + secondChainingOperator.toString();
        finalString += "\n}";
        return finalString;
    }
}
