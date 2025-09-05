import java.util.PriorityQueue;
import java.util.Queue;

public class ServicePoint {
    private Queue<Customer> queue = new PriorityQueue<>();

    //  Add new customer to queue
    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    // Serve and remove first customer
    public Customer poll() {
        return queue.poll();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
