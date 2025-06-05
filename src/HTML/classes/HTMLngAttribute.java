package HTML.classes;
/*
Rule:
ngAttribute: WhiteSpace+ Star (ngIf | ngFor);

 */
public class HTMLngAttribute {
HTMLngIf ngIf;
HTMLngFor ngFor;

    public HTMLngIf getNgIf() {
        return ngIf;
    }

    public HTMLngFor getNgFor() {
        return ngFor;
    }

    public void setNgIf(HTMLngIf ngIf) {
        this.ngIf = ngIf;
    }

    public void setNgFor(HTMLngFor ngFor) {
        this.ngFor = ngFor;
    }

    @Override
    public String toString() {
        if(ngFor!=null){
            return "\nngAttribute{" +
                    ngFor.toString() +
                    '}';
        }
        return "\nngAttribute{" +
                ngIf.toString() +
                '}';

    }
}
