package Angular.classes;

public class ComponentMetaData {
    ComponentMetaDataKey componentMetaDataKey;
    ComponentMetaDataValue componentMetaDataValue;

    public ComponentMetaDataKey getComponentMetaDataKey() {
        return componentMetaDataKey;
    }

    public ComponentMetaDataValue getComponentMetaDataValue() {
        return componentMetaDataValue;
    }

    public void setComponentMetaDataKey(ComponentMetaDataKey componentMetaDataKey) {
        this.componentMetaDataKey = componentMetaDataKey;
    }

    public void setComponentMetaDataValue(ComponentMetaDataValue componentMetaDataValue) {
        this.componentMetaDataValue = componentMetaDataValue;
    }

    @Override
    public String toString() {
        return "ComponentMetaData {\n" +
                componentMetaDataKey.toString() +
                "\n" +
                componentMetaDataValue.toString() +
                "\n}";
    }
}
