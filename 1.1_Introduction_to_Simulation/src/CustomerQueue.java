// OrientationTask1_4.

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueue {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose an option:");
            System.out.println("1: Enqueue (Add customer)");
            System.out.println("2: Dequeue (Remove customer)");
            System.out.println("0: Exit");

            int input = scanner.nextInt();

            if (input == 1) {
                Customer customer = new Customer(System.nanoTime(), 0);
                queue.addFirst(customer);
                System.out.println("Added Customer ID: " + customer.getId());
            }
            else if (input == 2) {
                if (!queue.isEmpty()) {
                    Customer customer = queue.removeLast();
                    long timeSpent = System.nanoTime() - customer.getStartTime();
                    System.out.println("Removed Customer ID: " + customer.getId() + ", Time: " + timeSpent + " ns");
                } else {
                    System.out.println("Queue is empty!");
                }
            }
            else if (input == 0) {
                break;
            }
        }

        scanner.close();
    }
}