package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
conditions: (
                condition
                combiningOperator
            )*
            condition;
 */
public class Conditions {
    List<Condition> conditionList = new ArrayList<>();
    List<CombiningOperator> combiningOperatorList = new ArrayList<>();

    public List<Condition> getConditionList() {
        return conditionList;
    }

    public List<CombiningOperator> getCombiningOperatorList() {
        return combiningOperatorList;
    }

    public void setConditionList(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }

    public void setCombiningOperatorList(List<CombiningOperator> combiningOperatorList) {
        this.combiningOperatorList = combiningOperatorList;
    }

    public void addCondition(Condition condition) {
        this.conditionList.add(condition);
    }

    public void addCombiningOperator(CombiningOperator combiningOperator) {
        this.combiningOperatorList.add(combiningOperator);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nConditions {";
        if (!conditionList.isEmpty()) {
            finalString += "\nCondition List =";
            for (int i = 0; i < conditionList.size(); i++) {
                finalString += conditionList.get(i).toString();
                try {
                    finalString += combiningOperatorList.get(i).toString();
                } catch (Exception e) {
                }
            }
            finalString += "\n, combiningOperatorList=";
            for (CombiningOperator combiningOperator : combiningOperatorList) {
                finalString += combiningOperator.toString();
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
