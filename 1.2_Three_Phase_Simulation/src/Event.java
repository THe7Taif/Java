enum EventType{
    ARRIVAL,
    SERVICE_START,
    SERVICE_END,
    EXIT
}

public class Event implements Comparable<Event> {
    private double eventTime;
    private EventType eventType;

    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }


    // Getters
    public double getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    // Compare the events by the time
    @Override
    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    // to display the events
    @Override
    public String toString() {
        return "Event " + "{time=" + eventTime + ", type =" + eventType + "}";
    }
}
