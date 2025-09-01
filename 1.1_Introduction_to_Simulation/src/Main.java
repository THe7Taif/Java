// OrientationTask1_5.

public class Main {
    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator.createCustomers(5, sp); // 5 customers
        sp.serve(); // serveing the customers
    }
}
