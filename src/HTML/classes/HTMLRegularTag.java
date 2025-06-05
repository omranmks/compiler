package HTML.classes;
/*
Rule:
regularTag: openTag WhiteSpace* htmlContent WhiteSpace* closeTag;

 */
public class HTMLRegularTag {
    HTMLOpenTag openTag;
    HTMLhtmlContent htmlContent;
    HTMLCloseTag closeTag;

    public HTMLOpenTag getOpenTag() {
        return openTag;
    }

    public HTMLhtmlContent getHtmlContent() {
        return htmlContent;
    }

    public HTMLCloseTag getCloseTag() {
        return closeTag;
    }

    public void setOpenTag(HTMLOpenTag openTag) {
        this.openTag = openTag;
    }

    public void setHtmlContent(HTMLhtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void setCloseTag(HTMLCloseTag closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String toString() {
        return "\nRegularTag{" +
                 openTag.toString() +
                htmlContent.toString() +
                closeTag.toString() +
                '}';
    }
}
