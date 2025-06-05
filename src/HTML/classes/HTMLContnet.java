package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
content: (WhiteSpace | CONTENT | WORD)+;

 */
public class HTMLContnet {
    List<String> strings = new ArrayList<>();
    List<String> words = new ArrayList<>();



    public List<String> getStrings() {
        return strings;
    }

    public List<String> getWords() {
        return words;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void addString(String string) {
        this.strings.add(string);
    }
    public void addWord(String word) {
        this.words.add(word);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\ncontent {";
        if (!strings.isEmpty()) {
            finalString += "\nstring =";
            for (int i = 0; i < strings.size(); i++) {
                finalString += strings.get(i).toString();
                finalString += "\n ,";
            }
        }
        if (!words.isEmpty()) {
            finalString += "\nword =";
            for (int i = 0; i < words.size(); i++) {
                finalString += words.get(i).toString();
                finalString += "\n ,";
            }
        }
        finalString += "\n}";
        return finalString;
    }


}
