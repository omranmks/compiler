package HTML.classes;
/*
Rule:
htmlTag: WhiteSpace* tag WhiteSpace*;
 */
public class HTMLhtmlTag {
    HTMLTag tag;

    public HTMLTag getTag() {
        return tag;
    }

    public void setTag(HTMLTag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return
                tag.toString()
               ;
    }
}

