package HTML.classes;
/*
Rule :
string: (SingleQuotation WORD SingleQuotation) |
        (DoubleQuotation WORD DoubleQuotation) |
        (Backtick WORD Backtick);
 */
public class HTMLString {
String singleQuotation;
String doubleQuotation;
String backtick;

String word;

    public void setSingleQuotation(String singleQuotation) {
        this.singleQuotation = singleQuotation;
    }

    public void setDoubleQuotation(String doubleQuotation) {
        this.doubleQuotation = doubleQuotation;
    }

    public void setBacktick(String backtick) {
        this.backtick = backtick;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSingleQuotation() {
        return singleQuotation;
    }

    public String getDoubleQuotation() {
        return doubleQuotation;
    }

    public String getBacktick() {
        return backtick;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        if(singleQuotation!=null){
            return "\nString{" +
                     singleQuotation +
                     word +
                    singleQuotation +
                    "\n}";
        } else if (doubleQuotation!=null) {
            return "\nString{" +
                     doubleQuotation +
                     word +
                     doubleQuotation +
                    "\n}";
        }
        return "\nString{" +
               backtick +
                 word +
                 backtick +
                "\n}";
    }
}
