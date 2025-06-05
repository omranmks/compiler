package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
conditions: (
                condition
                WhiteSpace*
                combiningOperator
                WhiteSpace*
            )*
            condition;
 */
public class HTMLConditions {
    List<HTMLCondition> conditionList = new ArrayList<>();
    List<HTMLCombiningOperator> combiningOperatorList = new ArrayList<>();

    public List<HTMLCondition> getConditionList() {
        return conditionList;
    }

    public List<HTMLCombiningOperator> getCombiningOperatorList() {
        return combiningOperatorList;
    }

    public void setConditionList(List<HTMLCondition> conditionList) {
        this.conditionList = conditionList;
    }

    public void setCombiningOperatorList(List<HTMLCombiningOperator> combiningOperatorList) {
        this.combiningOperatorList = combiningOperatorList;
    }

    public void addCondition(HTMLCondition condition) {
        this.conditionList.add(condition);
    }

    public void addCombiningOperator(HTMLCombiningOperator combiningOperator) {
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
            for (HTMLCombiningOperator combiningOperator : combiningOperatorList) {
                finalString += combiningOperator.toString();
            }
        }
        finalString += "\n}";
        return finalString;
    }
}
