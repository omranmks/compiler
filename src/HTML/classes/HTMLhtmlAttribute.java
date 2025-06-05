package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
htmlAttribute:  WhiteSpace+
                (
                    AttributeName
                    Equal DoubleQuotation attributeValue+ DoubleQuotation
                ) |
                (
                    LeftSquareBracket
                    AttributeName
                    RightSquareBracket
                    Equal DoubleQuotation dataAccessing DoubleQuotation
                );
 */
public class HTMLhtmlAttribute {
    String attributeName;
    String leftSquareBracket;
    List<HTMLAttributeValue> attributeValues = new ArrayList<>();
    HTMLDataAccessing dataAccessing;

    public String getAttributeName() {
        return attributeName;
    }

    public String getLeftSquareBracket() {
        return leftSquareBracket;
    }

    public List<HTMLAttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public HTMLDataAccessing getDataAccessing() {
        return dataAccessing;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setLeftSquareBracket(String leftSquareBracket) {
        this.leftSquareBracket = leftSquareBracket;
    }

    public void setAttributeValues(List<HTMLAttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public void addAttributeValue(HTMLAttributeValue parameter) {
        this.attributeValues.add(parameter);
    }

    public void setDataAccessing(HTMLDataAccessing dataAccessing) {
        this.dataAccessing = dataAccessing;
    }

    @Override
    public String toString() {
        String finalString = "";
        if (leftSquareBracket != null) {
            finalString += "\nhtmlAttribute{" +
                    "[ " +
                    attributeName.toString() + '\'' +
                    "]=\" ";
            finalString += dataAccessing.toString();
        } else {
            finalString += "\nhtmlAttribute{" +
                    attributeName.toString() + '\'';
            finalString += "=\" ";
            finalString += "\nParameter List =";
            for (int i = 0; i < attributeValues.size(); i++) {
                finalString += attributeValues.get(i).toString();
                finalString += "\n ,";
            }
            finalString += "\" ";
            finalString += '}';
        }
        return finalString;
    }
};
