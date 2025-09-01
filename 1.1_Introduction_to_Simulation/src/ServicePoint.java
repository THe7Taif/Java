// OrientationTask1_5.

import java.util.LinkedList;


public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>(); // List that picks customers from the queue
    private long totalServiceTime = 0;   // total of time served.
    private int totalServedCustomers = 0;     // total of the customers served.

    // adding a customer
    void addToQueueue(Customer c) {
        queue.addLast(c);
    }

    // remove a customer
    Customer removeFromQueueue() {
        if  (!queue.isEmpty()) {
            return queue.removeFirst();
        }
        return null;
    }

    // serve the customers
    public void serve() {
        while (!queue.isEmpty()) {
            try {
                Customer c = removeFromQueueue();

                // random serve time from 0 to 1000 ms
                int serviceTime = (int)(Math.random() * 1000);

                Thread.sleep(serviceTime); // for the serve

                c.setEndTime(System.currentTimeMillis());

                // saving the data of the serving time in variable.
                totalServiceTime  = totalServiceTime + serviceTime; // Task 6

                // saving the data of the serving amount of customers in variable.
                totalServedCustomers = totalServedCustomers + 1; // Task 6

                System.out.println("Customer served. Response time = "
                        + c.getTimeSpent() + " ms, "
                        + "Service time = " + serviceTime + " ms");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // after saving all data of total time and customers,
        // make our function to get and print the Average Service Time.
        if (totalServedCustomers > 0) {
            double averageServiceTime = (double) totalServiceTime / totalServedCustomers;
            System.out.println("\nAverage Service Time = " + averageServiceTime + " ms");
        } else {
            System.out.println("\nNo customers were served.");
        }
    }
}

