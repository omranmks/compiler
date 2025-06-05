package HTML.classes;
/*
Rule:
closeTag: HTMLCloseTag WhiteSpace* RightAngleBracket;

 */
public class HTMLCloseTag {
    String closeTag;

    public String getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(String closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String toString() {
        return "\nCloseTag{" +
                 closeTag + ">" +
                '}';
    }
}
