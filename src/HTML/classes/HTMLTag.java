package HTML.classes;
/*
Rule:
tag: regularTag | selfClosedTag;

 */
public class HTMLTag {
    HTMLRegularTag regularTag;
    HTMLSelfCloseTag selfCloseTag;

    public HTMLRegularTag getRegularTag() {
        return regularTag;
    }

    public HTMLSelfCloseTag getSelfCloseTag() {
        return selfCloseTag;
    }

    public void setRegularTag(HTMLRegularTag regularTag) {
        this.regularTag = regularTag;
    }

    public void setSelfCloseTag(HTMLSelfCloseTag selfCloseTag) {
        this.selfCloseTag = selfCloseTag;
    }

    @Override
    public String toString() {
        if(regularTag!=null){
            return "Tag{" +
                    regularTag.toString()+
                    '}';
        }
        return "Tag{" +
                selfCloseTag.toString()+
                '}';
    }
}

