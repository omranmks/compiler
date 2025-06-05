package HTML.classes;
/*
Rule:
attributeValue: WORD | Sign | NUMBER | Dot;

 */
public class HTMLAttributeValue {
    String word;
    String sign;
    String number;
    String Dot;

    public String getWord() {
        return word;
    }

    public String getSign() {
        return sign;
    }

    public String getNumber() {
        return number;
    }

    public String getDot() {
        return Dot;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    @Override
    public String toString() {
        if(word!=null){
            return "\nAttributeValue{" +
                    "word='" + word + '\'' +
                    '}';
        } else if (sign!=null) {
            return "\nAttributeValue{" +
                    "sign='" + sign + '\'' +
                    '}';
        }else if (number!=null) {
            return "\nAttributeValue{" +
                    "number='" + number + '\'' +
                    '}';
        }
        return "\nHTMLAttributeValue{" +
                "Dot='" + Dot + '\'' +
                '}';
    }
}

