


public class Clock {

    // Private static member to hold the unique instance
    private static Clock instance;
    private double time;

    // Private constructor to prevent instantiation from outside
    private Clock(){
        this.time = 0.0;
    }

    // Public static method to access the unique instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Setter Method to set time directly
    public void setTime(double newTime) {
        this.time = newTime;
    }


    // Setter Method to advance (increase) time
    public void setAdvanceTime(double step) {
        this.time = time + step; // we will get the data from this.time then + with new data from step, so we apply newTime + step = them together
    }

    // Getter Method to get current time
    public double getTime(){
        return time;
    }
}
