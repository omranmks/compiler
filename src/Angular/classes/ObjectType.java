package Angular.classes;

/*
Rule:
objectType: LeftCurlyBrace
            (
                propertyType
                Comma
            )*
            propertyType
            Comma?
            RightCurlyBrace;
 */

import java.util.ArrayList;
import java.util.List;

public class ObjectType {
    List<PropertyType> propertyList = new ArrayList<>();
    List<String> semiColonList = new ArrayList<>();

    public List<PropertyType> getPropertyList() {
        return propertyList;
    }

    public List<String> getCommaList() {
        return semiColonList;
    }

    public void setPropertyList(List<PropertyType> propertyList) {
        this.propertyList = propertyList;
    }

    public void setCommaList(List<String> semiColonList) {
        this.semiColonList = semiColonList;
    }

    public void addPropertyType(PropertyType propertyType) {
        this.propertyList.add(propertyType);
    }

    public void addComma(String comma) {
        this.semiColonList.add(comma);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nObjectType {";
        finalString += "\n {";
        if (!propertyList.isEmpty()) {
            finalString += "\n, Property List =";
            for (int i = 0; i < propertyList.size(); i++) {
                finalString += propertyList.get(i).toString();
                try {
                    finalString += semiColonList.get(i);
                } catch (Exception e) {
                }
            }
        }
        finalString += "\n, }";
        finalString += "\n}";
        return finalString;
    }
}
