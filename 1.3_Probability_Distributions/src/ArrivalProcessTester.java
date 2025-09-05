import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrivalProcessTester {
    public static void main(String[] args) {

        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        // sending the data to the ArrivalProcess() Constructor:
        ArrivalProcess arrival = new ArrivalProcess("CustomerArrival", 0.5);
        // Task 7:
        //Customer customer = new Customer(12, 0);
        ServicePoint servicePoint = new ServicePoint();

        // Task 6:
        System.out.println("Initial Clock Time: " + clock.getTime());

        // Task 6, 7, Step 1: Generate 10 arrival events, 10 events are created to the event list
        for (int i = 0; i < 10; i++) {
            Event e = arrival.generateEvent();
            eventList.addEvent(e); // add directly to EventList
        }

        System.out.println("Final Event List:");
        eventList.printEvents();


        // Task 7, Step 2:  the clock displays the time of the last event created.
        System.out.println("Clock after arrivals: " + clock.getTime());


        // Task 7, Step 3: Process events and create customers in ServicePoint
        for (Event event : eventList.getEvents()) {
            // arrivalTime = event time, departureTime = 0 (not served yet)
            Customer customer = new Customer(event.eventTime, 0);
            servicePoint.addCustomer(customer);
            System.out.println("Customer created with arrival time: " + customer.getArrivalTime());
        }

        // Step 4: Move clock forward slightly
        clock.setTime(clock.getTime() + 5);
        System.out.println("Clock moved forward to: " + clock.getTime());

        // Step 5: Clear service point (serve customers)
        while (!servicePoint.isEmpty()) {
            Customer customer = servicePoint.poll(); // get first customer
            customer.setDepartureTime(clock.getTime()); // mark departure now
            System.out.println("Customer arrival: " + customer.getArrivalTime() +
                    ", departure: " + customer.getDepartureTime() +
                    ", spent in system: " + customer.getCustomerSpentTime());
        }



    }
}
