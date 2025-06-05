package Angular.classes;

/*
Rule:
number: NUMBER;
 */
public class TypeNumber {
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nTypeNumber { " +
                "Number = " + number +
                " }";
    }
}
