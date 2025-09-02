


public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();


        //  a) generate a list of events:
        eventList.addEvent(new Event(10.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(5.0, EventType.SERVICE_START));
        eventList.addEvent(new Event(7.5, EventType.SERVICE_END));
        eventList.addEvent(new Event(8.0, EventType.EXIT));



        //  b) remove the first (=next to be processed) event from the list:
        System.out.println("\nRemoved next event: " + eventList.getNextEvent());



        //  c) print the contents of the EventList, ordered by event time:
        System.out.println("\nRemaining events in order:");
        eventList.printEventsInOrder();

    }
}
