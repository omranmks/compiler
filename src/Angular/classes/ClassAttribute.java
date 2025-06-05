package Angular.classes;

public class ClassAttribute {
    AccessModifiers accessModifiers;
    Identifier identifier;
    Type type;
    AssigningOperator assigningOperator;
    Value value;

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public AssigningOperator getAssigningOperator() {
        return assigningOperator;
    }

    public Value getValue() {
        return value;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAssigningOperator(AssigningOperator assigningOperator) {
        this.assigningOperator = assigningOperator;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "ClassAttribute {";
        if (accessModifiers != null) {
            finalString += "\n";
            finalString += accessModifiers.toString();
        }
        finalString += "\n" + identifier.toString();
        if (type != null)
            finalString += "\n" + type.toString();
        if (value != null) {
            finalString += "\n" + assigningOperator.toString();
            finalString += "\n" + value.toString();
        }
        finalString += "\n ; }";
        return finalString;
    }
}
