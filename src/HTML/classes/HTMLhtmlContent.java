package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
htmlContent:  (htmlTag | interpolation | content)* ;

 */
public class HTMLhtmlContent {
    List<HTMLhtmlTag> htmlTagList = new ArrayList<>();
    List<HTMLInterpolation> interpolationList = new ArrayList<>();
    List<HTMLContnet> contnetList = new ArrayList<>();

    public List<HTMLhtmlTag> getHtmlTagList() {
        return htmlTagList;
    }

    public List<HTMLInterpolation> getInterpolationList() {
        return interpolationList;
    }

    public List<HTMLContnet> getContnetList() {
        return contnetList;
    }

    public void setHtmlTagList(List<HTMLhtmlTag> htmlTagList) {
        this.htmlTagList = htmlTagList;
    }

    public void setInterpolationList(List<HTMLInterpolation> interpolationList) {
        this.interpolationList = interpolationList;
    }

    public void setContnetList(List<HTMLContnet> contnetList) {
        this.contnetList = contnetList;
    }

    public void addHtmlTag(HTMLhtmlTag htmltag) {
        this.htmlTagList.add(htmltag);
    }
    public void addInterpolation(HTMLInterpolation interpolation) {
        this.interpolationList.add(interpolation);
    }

    public void addContent(HTMLContnet contnet) {
        this.contnetList.add(contnet);
    }
    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nContent {";
        if (!htmlTagList.isEmpty()) {
            finalString += "\nTag List =";
            for (int i = 0; i < htmlTagList.size(); i++) {
                finalString += htmlTagList.get(i).toString();
                finalString += "\n ,";
            }
        }
        if (!interpolationList.isEmpty()) {
            finalString += "\ninterpolation List =";
            for (int i = 0; i < interpolationList.size(); i++) {
                finalString += interpolationList.get(i).toString();
                finalString += "\n ,";
            }
        }
        if (!contnetList.isEmpty()) {
            finalString += "\ncontnet List =";
            for (int i = 0; i < contnetList.size(); i++) {
                finalString += contnetList.get(i).toString();
                finalString += "\n ,";
            }
        }
        finalString += "\n}";
        return finalString;
    }

}
