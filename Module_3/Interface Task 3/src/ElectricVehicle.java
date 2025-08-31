// ElectricVehicle interface
public interface ElectricVehicle {
    void charge();
}

// Abstract class
abstract class AbstractVehicle implements ElectricVehicle {
    protected String type;
    protected String fuel;
    protected String color;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public void start() {
        System.out.println(type + " is starting...");
    }

    public void stop() {
        System.out.println(type + " is stopping...");
    }


    abstract String getInfo(); //  Each class will make @override method, to it own properties.
}

// Electric Car
class ElectricCar extends AbstractVehicle {

    public ElectricCar(String type, String fuel, String color) {
        super(type, fuel);
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
                "\nColor: " + color + "\n";
    }
}

// Electric Motorcycle
class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle(String type, String fuel, String color) {
        super(type, fuel);
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
                "\nColor: " + color + "\n";
    }
}

// Regular Car
class Car extends AbstractVehicle {

    public Car(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public String getInfo() {
        return "Car Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color + "\n";
    }
}

// Regular Motorcycle
class Motorcycle extends AbstractVehicle {

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:" +
                "\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color + "\n";
    }
}
