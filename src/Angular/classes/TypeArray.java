package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
array:  LeftSquareBracket
        (
            element
            Comma
        )*
        (
            element
            Comma?
        )?
        RightSquareBracket;
 */

public class TypeArray {
    List<TypeArrayElement> elementList = new ArrayList<>();
    List<String> commaList = new ArrayList<>();

    public List<TypeArrayElement> getElementList() {
        return elementList;
    }

    public List<String> getCommaList() {
        return commaList;
    }

    public void setElementList(List<TypeArrayElement> elementList) {
        this.elementList = elementList;
    }

    public void setCommaList(List<String> commaList) {
        this.commaList = commaList;
    }

    public void addElementList(TypeArrayElement element) {
        this.elementList.add(element);
    }

    public void addCommaList(String comma) {
        this.commaList.add(comma);
    }

    @Override
    public String toString() {
        String finalString = "TypeArray { \n";
        finalString += "\t[";
        if (!elementList.isEmpty()) {
            for (int i = 0; i < elementList.size(); i++) {
                finalString += "\n\t\t";
                finalString += elementList.get(i).toString();
                try {
                    finalString += commaList.get(i);
                } catch (IndexOutOfBoundsException e) {
                }
            }
        }
        finalString += "\n\t]";
        finalString += "\n}";
        return finalString;
    }
}
