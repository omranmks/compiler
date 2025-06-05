package Angular.classes;

/*
Rule:
parameter: value;
 */
public class Parameter {
    Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nParameter{" +
                "\nvalue=" + value.toString() +
                "\n}";
    }
}
