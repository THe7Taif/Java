import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events;

    public EventList(){
        events = new PriorityQueue<>();
    }

    // Setters
    public void addEvent(Event event) {
        events.add(event);
    }

    // Getter
    public Event getNextEvent() {
        return events.poll(); // The poll () method retrieve and remove the head (front) element of the queue.
    }

    // The isEmpty() method in Java is used to check whether a string is empty or not.
    // It returns true if the string has a length of 0, and false otherwise.
    public boolean isEmpty() {
        return events.isEmpty();
    }

    // Print the Events of the EventList, ordered by event time:
    // Can not print them with for each only, becuz the PriorityQueue List
    // put the items from small till the large one, so for each can not see them in the Sorted way.
    // thats wey we make new ArrayList to save them again then we Cokkect them in Sorted way by ArrayList method "Collections.sort"
    public void printEventsInOrder() {
        ArrayList<Event> sortedEvents = new ArrayList<>(events);
        Collections.sort(sortedEvents);
        for (Event event : sortedEvents) {
            System.out.println(event);
        }
    }
}
