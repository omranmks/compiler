package Angular.classes;

/*
Rule:
value: string   |
       number   |
       boolean  |
       array    |
       object   |
       anonymousFunction;

 */
public class Value {
    String value;
    TypeString typeString;
    TypeNumber typeNumber;
    TypeBoolean typeBoolean;
    TypeArray typeArray;
    TypeObject typeObject;
    AnonymousFunction anonymousFunction;

    public TypeString getTypeString() {
        return typeString;
    }

    public TypeNumber getTypeNumber() {
        return typeNumber;
    }

    public TypeBoolean getTypeBoolean() {
        return typeBoolean;
    }

    public TypeArray getTypeArray() {
        return typeArray;
    }

    public TypeObject getTypeObject() {
        return typeObject;
    }

    public AnonymousFunction getAnonymousFunction() {
        return anonymousFunction;
    }

    public void setTypeString(TypeString typeString) {
        this.typeString = typeString;
        this.value = "string";
    }

    public void setTypeNumber(TypeNumber typeNumber) {
        this.typeNumber = typeNumber;
        this.value = "number";
    }

    public void setTypeBoolean(TypeBoolean typeBoolean) {
        this.typeBoolean = typeBoolean;
        this.value = "boolean";
    }

    public void setTypeArray(TypeArray typeArray) {
        this.typeArray = typeArray;
        this.value = "array";
    }

    public void setTypeObject(TypeObject typeObject) {
        this.typeObject = typeObject;
        this.value = "object";
    }

    public void setAnonymousFunction(AnonymousFunction anonymousFunction) {
        this.anonymousFunction = anonymousFunction;
        this.value = "anonymousFunction";
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (typeString != null)
            return "Value { " +
                    typeString +
                    " }";
        else if (typeNumber != null)
            return "Value { " +
                    typeNumber +
                    " }";
        else if (typeBoolean != null)
            return "Value { " +
                    typeBoolean +
                    " }";
        else if (typeArray != null)
            return "Value { " +
                    typeArray +
                    " }";
        else if (typeObject != null)
            return "Value { " +
                    typeObject +
                    " }";
        else
            return "Value { " +
                    anonymousFunction +
                    " }";
    }
}
