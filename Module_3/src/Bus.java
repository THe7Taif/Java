// Bus class extends Car to reuse all Car functionalities
public class Bus extends Car {

    // Fields for tracking passengers
    private int currentPassengers = 0;  // starts empty
    private int maxPassengers;          // maximum capacity of the bus

    // Constructor: initialize name and maxPassengers
    public Bus(String name, int maxPassengers) {
        super(name);                  // call Car constructor to set the bus name
        this.maxPassengers = maxPassengers; // set the maximum passengers
    }

    // Method to add passengers
    public void passengerEnter(int number) {
        // Add passengers but do not exceed maxPassengers
        currentPassengers = Math.min(currentPassengers + number, maxPassengers);
        System.out.println(number + " passengers entered. Current: " + currentPassengers);
    }

    // Method to remove passengers
    public void passengerExit(int number) {
        // Remove passengers but do not go below 0
        currentPassengers = Math.max(currentPassengers - number, 0);
        System.out.println(number + " passengers exited. Current: " + currentPassengers);
    }

    // Getter for current passengers
    public int getCurrentPassengers() {
        return currentPassengers;
    }
}
