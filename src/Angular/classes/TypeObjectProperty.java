package Angular.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
property: identifier
          Colon
          value;
 */
public class TypeObjectProperty {
    Identifier identifier;
    Value value;

    public Identifier getIdentifier() {
        return identifier;
    }

    public Value getValue() {
        return value;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TypeObjectProperty { \n" +
                identifier.toString() +
                ":" +
                "\n" + value.toString() +
                " }";
    }
}
