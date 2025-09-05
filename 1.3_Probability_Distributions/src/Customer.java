public class Customer {

    // Task 7: Costumer arrival and departure time
    private double arrivalTime;
    private double departureTime;

    public Customer(double arrivalTime, double departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    // Setters (useful if we only know arrival at first, and later we set departure)
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    // Getters
    public double getArrivalTime() {
        return arrivalTime;
    }
    public double getDepartureTime() {
        return departureTime;
    }

    // Calculate time customer spent in the system: getCustomerSpentTime = departureTime − arrivalTime
    // (difference between arrival time and customer departure time) is the time each customer spent in the system.
    public double getCustomerSpentTime() {
        return departureTime - arrivalTime;
    }

    @Override
    public String toString() {
        return "Customer [Arrival=" + arrivalTime +
                ", Departure=" + departureTime +
                ", Spent=" + getCustomerSpentTime() + "]";
    }
}
