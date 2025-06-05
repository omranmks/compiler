package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
statement:  (
                dataAccessing
                WhiteSpace*
                (Sign | Star | Slash)
                WhiteSpace*
            )*
            dataAccessing;
 */
public class HTMLStatement {
    List<HTMLDataAccessing> dataAccessingList = new ArrayList<>();
    List<String> sign = new ArrayList<>();
    List<String > star = new ArrayList<>();
    List<String> slash = new ArrayList<>();

    public List<HTMLDataAccessing> getDataAccessingList() {
        return dataAccessingList;
    }

    public List<String> getSign() {
        return sign;
    }

    public List<String> getStar() {
        return star;
    }

    public List<String> getSlash() {
        return slash;
    }

    public void setDataAccessingList(List<HTMLDataAccessing> dataAccessingList) {
        this.dataAccessingList = dataAccessingList;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }

    public void setStar(List<String> star) {
        this.star = star;
    }

    public void setSlash(List<String> slash) {
        this.slash = slash;
    }

    public void adddataAccessing(HTMLDataAccessing parameter) {
        this.dataAccessingList.add(parameter);
    }
    public void addstar(String htmltag) {
        this.star.add(htmltag);
    }
    public void addsign(String htmltag) {
        this.sign.add(htmltag);
    }
    public void addSlash(String htmltag) {
        this.slash.add(htmltag);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nStatement {";
        if (!dataAccessingList.isEmpty()) {
            finalString += "\ndataAccessing List =";
            for (int i = 0; i < dataAccessingList.size(); i++) {
                finalString += dataAccessingList.get(i).toString();
                if(sign!=null)
                    finalString += sign;
                if(star!=null)
                    finalString += star;
                if(slash!=null)
                    finalString += slash;            }
        }
        finalString += "\n}";
        return finalString;
    }
}
