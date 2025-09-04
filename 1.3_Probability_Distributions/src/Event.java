import java.util.ArrayList;
import java.util.Random;

// Event class
class Event {
    String eventType;
    double eventTime;

    public Event(String eventType, double eventTime) {
        this.eventType = eventType;
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "Event: type=" + eventType + ", time=" + eventTime + "]";
    }
}