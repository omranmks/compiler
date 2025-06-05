package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class TypeObject {
    List<TypeObjectProperty> objectPropertyList = new ArrayList<>();
    List<String> commaList = new ArrayList<>();

    public List<TypeObjectProperty> getObjectPropertyList() {
        return objectPropertyList;
    }

    public List<String> getComma() {
        return commaList;
    }

    public void setObjectPropertyList(List<TypeObjectProperty> objectPropertyList) {
        this.objectPropertyList = objectPropertyList;
    }

    public void setComma(List<String> comma) {
        this.commaList = comma;
    }

    public void addObjectProperty(TypeObjectProperty objectProperty) {
        this.objectPropertyList.add(objectProperty);
    }

    public void addComma(String comma) {
        this.commaList.add(comma);
    }

    @Override
    public String toString() {
        String finalString = "TypeObject { {";
        if (!objectPropertyList.isEmpty()) {
            for (int i = 0; i < objectPropertyList.size(); i++) {
                finalString += "\n";
                finalString += objectPropertyList.get(i);
                try {
                    finalString += commaList.get(i);
                } catch (IndexOutOfBoundsException e) {
                }
            }
        }
        finalString += "\n} }";
        return finalString;
    }
}
