package HTML.classes;
//number: NUMBER;
public class HTMLNumber {
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nNumber{" +
                 number + '\'' +
                "}";
    }
}
