// Vehicle interface
public interface Vehicle {
    void start();
    void stop();
    void charge();
    double calculateFuelEfficiency(); // Task 4
}

// Abstract class
abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void start() {
        System.out.println(type + " is starting...");
    }

    public void stop() {
        System.out.println(type + " is stopping...");
    }

    // Default implementation
    @Override
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract String getInfo();
}

// Electric Car
class ElectricCar extends AbstractVehicle {
    public ElectricCar(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " kWh/km\n";
    }
}

// Electric Motorcycle
class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " kWh/km\n";
    }
}

// Regular Car
class Car extends AbstractVehicle {
    public Car(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Car Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " mpg\n";
    }
}

// Regular Motorcycle
class Motorcycle extends AbstractVehicle {
    public Motorcycle(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " mpg\n";
    }
}
