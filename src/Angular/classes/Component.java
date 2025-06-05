package Angular.classes;

import java.util.ArrayList;
import java.util.List;

public class Component {
    List<ComponentMetaData> componentMetaDataList = new ArrayList<>();
    List<String> commaList = new ArrayList<>();
    String angularDecorator;

    public List<ComponentMetaData> getComponentMetaDataList() {
        return componentMetaDataList;
    }

    public List<String> getCommaList() {
        return commaList;
    }

    public String getAngularDecorator() {
        return angularDecorator;
    }

    public void setComponentMetaDataList(List<ComponentMetaData> componentMetaDataList) {
        this.componentMetaDataList = componentMetaDataList;
    }

    public void setCommaList(List<String> commaList) {
        this.commaList = commaList;
    }

    public void setAngularDecorator(String angularDecorator) {
        this.angularDecorator = angularDecorator;
    }

    public void addComponentMetaData(ComponentMetaData componentMetaData) {
        this.componentMetaDataList.add(componentMetaData);
    }

    public void addCommaList(String commaList) {
        this.commaList.add(commaList);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nComponent {";
        finalString += "\n" + angularDecorator;
        finalString += "(";
        finalString += "{";
        if (!componentMetaDataList.isEmpty()) {
            for (int i = 0; i < componentMetaDataList.size(); i++) {
                finalString += "\n";
                finalString += componentMetaDataList.get(i).toString();
                try {
                    finalString += commaList.get(i);
                } catch (Exception e) {
                }
            }
        }
        finalString += "}";
        finalString += ")";
        finalString += "\n}";
        return finalString;
    }
}
