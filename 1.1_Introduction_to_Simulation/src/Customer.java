// OrientationTask1_3

public class Customer {
    public static int lastId = 1;  // for ID generating will have a static variable to make's remembering everytime get new customer.
    private int id;
    private long startTime;
    private long endTime;
    private long serviceTime; // Task 6


    public Customer(long startTime, long endTime) {
        this.id = lastId++;  // increase for each ID customer comes, 1, 2, 3, 4, .....
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public long getTimeSpent() {
        return endTime - startTime;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Task 6
    public long getServiceTime() {
        return serviceTime;
    }
    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }

}
