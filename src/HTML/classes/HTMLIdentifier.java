package HTML.classes;
/*
Rule:
identifier: WORD;
 */
public class HTMLIdentifier {
    String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Identifier{" + word + '\'' + '}';
    }
}
