package HTML.classes;

import java.util.ArrayList;
import java.util.List;

/*
Rule:
selfClosedTag: HTMLOpenTag (htmlAttribute | ngAttribute | eventAttribute)* WhiteSpace* HTMLSelfCloseTag;

 */
public class HTMLSelfCloseTag {
String openTag;
List<HTMLhtmlAttribute> htmlAttributeList = new ArrayList<>();
List<HTMLngAttribute> ngAttributeList = new ArrayList<>();
List<HTMLEventAttribute> eventAttributeList = new ArrayList<>();
  String selfCloseTag;

    public String getOpenTag() {
        return openTag;
    }

    public List<HTMLhtmlAttribute> getHtmlAttributeList() {
        return htmlAttributeList;
    }

    public List<HTMLngAttribute> getNgAttributeList() {
        return ngAttributeList;
    }

    public List<HTMLEventAttribute> getEventAttributeList() {
        return eventAttributeList;
    }

    public String getSelfCloseTag() {
        return selfCloseTag;
    }

    public void setOpenTag(String openTag) {
        this.openTag = openTag;
    }

    public void setHtmlAttributeList(List<HTMLhtmlAttribute> htmlAttributeList) {
        this.htmlAttributeList = htmlAttributeList;
    }

    public void setNgAttributeList(List<HTMLngAttribute> ngAttributeList) {
        this.ngAttributeList = ngAttributeList;
    }

    public void setEventAttributeList(List<HTMLEventAttribute> eventAttributeList) {
        this.eventAttributeList = eventAttributeList;
    }

    public void setSelfCloseTag(String selfCloseTag) {
        this.selfCloseTag = selfCloseTag;
    }
    public void addHtmlAttribute(HTMLhtmlAttribute htmLhtmlAttribute) {
        this.htmlAttributeList.add(htmLhtmlAttribute);
    }
    public void addngAttribute(HTMLngAttribute htmLhtmlAttribute) {
        this.ngAttributeList.add(htmLhtmlAttribute);
    }
    public void addEventAttributw(HTMLEventAttribute htmLhtmlAttribute) {
        this.eventAttributeList.add(htmLhtmlAttribute);
    }

    @Override
    public String toString() {
        String finalString = "";
        finalString += "\nselfClosedTag {";
        finalString += "\nHTMLOpenTag {";
        finalString += openTag;
        if (!htmlAttributeList.isEmpty()) {
            finalString += "\nhtmlAttribute List =";
            for (int i = 0; i < htmlAttributeList.size(); i++) {
                finalString += htmlAttributeList.get(i).toString();
                finalString += "\n ,";
            }
        }
        if (!ngAttributeList.isEmpty()) {
            finalString += "\nngAttribute List =";
            for (int i = 0; i < ngAttributeList.size(); i++) {
                finalString += ngAttributeList.get(i).toString();
                finalString += "\n ,";
            }
        }
        if (!eventAttributeList.isEmpty()) {
            finalString += "\neventAttribute List =";
            for (int i = 0; i < eventAttributeList.size(); i++) {
                finalString += eventAttributeList.get(i).toString();
            }
        }
        finalString += "\nselfCloseTag {";
        finalString += selfCloseTag;
        finalString += "\n}";
        return finalString;
    }
}
