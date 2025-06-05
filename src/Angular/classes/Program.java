package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<ImportStatement> importStatementList = new ArrayList<>();
    List<Component> componentList = new ArrayList<>();

    ExportClass exportClass;
    Class aClass;
    Export export;

    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public ExportClass getExportClass() {
        return exportClass;
    }

    public Class getaClass() {
        return aClass;
    }

    public Export getExport() {
        return export;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public void setExportClass(ExportClass exportClass) {
        this.exportClass = exportClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public void setExport(Export export) {
        this.export = export;
    }

    public void addImportStatement(ImportStatement importStatement) {
        this.importStatementList.add(importStatement);
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nProgram {";
        if (!importStatementList.isEmpty()) {
            for (ImportStatement importStatement : importStatementList) {
                finalString += "\n";
                finalString += importStatement.toString();
            }
        }
        if (!componentList.isEmpty()) {
            for (Component component : componentList) {
                finalString += "\n";
                finalString += component.toString();
            }
        }
        finalString += "\n";
        if (exportClass != null) {
            finalString += exportClass.toString();
        } else {
            finalString += aClass.toString();
            finalString += export.toString();
        }
        finalString += "\n}";
        return finalString;
    }
}
