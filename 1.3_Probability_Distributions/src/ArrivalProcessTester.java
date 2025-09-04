import java.util.ArrayList;

public class ArrivalProcessTester {
    public static void main(String[] args) {

        // sending the data to the ArrivalProcess() Constructor:
        ArrivalProcess arrival = new ArrivalProcess("CustomerArrival", 0.5);

        EventList eventList = new EventList();
        Clock clock = Clock.getInstance();

        System.out.println("Initial Clock Time: " + clock.getTime());

        // Generate 10 events
        for (int i = 0; i < 10; i++) {
            Event e = arrival.generateEvent();
            eventList.addEvent(e); // add directly to EventList
        }

        System.out.println("Final Event List:");
        eventList.printEvents();
    }
}
