// OrientationTask1_3

public class CustomerTester {

    public static void main(String[] args) {
        Customer customer = new Customer(67, 199);
        Customer customer_2 = new Customer(46, 100 );

        System.out.println("Customer ID: " + customer.getId());
        System.out.println(
                "Time Start: " + customer.getStartTime() + " ms.\n" +
                "Time End: " + customer.getEndTime() + " ms.\n" +
                "Time spent: " + customer.getTimeSpent() + " ms.\n");


        System.out.println("Customer ID: " + customer_2.getId());
        System.out.println(
                "Time Start: " + customer_2.getStartTime() + " ms.\n" +
                "Time End: " + customer_2.getEndTime() + " ms.\n" +
                "Time spent: " + customer_2.getTimeSpent() + " ms.\n");;


    }
}
