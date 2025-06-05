package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement {
    List<ImportLibs> importLibsList = new ArrayList<>();
    TypeString typeString;

    public List<ImportLibs> getImportLibsList() {
        return importLibsList;
    }

    public TypeString getTypeString() {
        return typeString;
    }

    public void setImportLibsList(List<ImportLibs> importLibsList) {
        this.importLibsList = importLibsList;
    }

    public void setTypeString(TypeString typeString) {
        this.typeString = typeString;
    }

    public void addImportLips(ImportLibs importLibs) {
        this.importLibsList.add(importLibs);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "ImportStatement { ";
        finalString += "\nimport ";
        for (ImportLibs importLibs : importLibsList) {
            finalString += importLibs.toString();
        }
        finalString += "\nfrom ";
        finalString += typeString.toString();
        finalString += ";";
        finalString += "\n}";
        return finalString;
    }
}
