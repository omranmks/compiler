package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class ImportLibs {
    List<Identifier> identifierList = new ArrayList<>();
    List<String> commaList = new ArrayList<>();

    public List<Identifier> getIdentifierList() {
        return identifierList;
    }

    public List<String> getCommaList() {
        return commaList;
    }

    public void setIdentifierList(List<Identifier> identifierList) {
        this.identifierList = identifierList;
    }

    public void setCommaList(List<String> commaList) {
        this.commaList = commaList;
    }

    public void addIdentifier(Identifier identifier) {
        this.identifierList.add(identifier);
    }

    public void addComma(String comma) {
        this.commaList.add(comma);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "ImportLibs { ";
        finalString += "\n\t{";
        for (int i = 0; i < identifierList.size(); i++) {
            finalString += "\n";
            finalString += "\t\t";
            finalString += identifierList.get(i).toString();
            try {
                finalString += commaList.get(i);
            } catch (Exception e) {
            }
        }
        finalString += "\n\t}";
        finalString += "\n}";
        return finalString;
    }
}
