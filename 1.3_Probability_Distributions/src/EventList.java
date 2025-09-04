import java.util.ArrayList;

// EventList class manages all events
class EventList {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    // Print all events
    public void printEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }
}