package HTML.classes;
/*
Rule:
attributeName: EventClick | EventFocus;

 */
public class HTMLAttributeName {
    String eventClick;
    String eventFocus;

    public String getEventClick() {
        return eventClick;
    }

    public String getEventFocus() {
        return eventFocus;
    }

    public void setEventClick(String eventClick) {
        this.eventClick = eventClick;
    }

    public void setEventFocus(String eventFocus) {
        this.eventFocus = eventFocus;
    }

    @Override
    public String toString() {
        if(eventClick!=null){
            return "\nAttributeName{" +
                    "eventClick='" + eventClick + '\'' +
                    '}';
        }
        return "\nAttributeName{" +
                ", eventFocus='" + eventFocus + '\'' +
                '}';
    }
}
