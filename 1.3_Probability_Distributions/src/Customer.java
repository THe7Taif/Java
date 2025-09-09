public class Customer implements Comparable<Customer> {
    private double arrivalTime;
    private double departureTime;

    public Customer(double arrivalTime, double departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getCustomerSpentTime() {
        return departureTime - arrivalTime;
    }

    @Override
    public int compareTo(Customer other) {
        return Double.compare(this.arrivalTime, other.arrivalTime);
    }

    @Override
    public String toString() {
        return "Customer{arrival=" + arrivalTime + ", departure=" + departureTime + "}";
    }
}
