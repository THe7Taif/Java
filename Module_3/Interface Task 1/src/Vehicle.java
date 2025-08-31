// Vehicle interface
interface Vehicle {
    void start();
    void stop();
    String getInfo();

}
// Normal class
class Car implements Vehicle {
    private String type;
    private String fuel;
    private String color;



    public Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:" + "\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }
}

class Motorcycle implements Vehicle {
    private String type;
    private String fuel;
    private String color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:" + "\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }
}
class Bus implements Vehicle {
    private String type;
    private String fuel;
    private int capacity;

    public Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stoping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:" + "\nType: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity + " Passengers";

    }
}