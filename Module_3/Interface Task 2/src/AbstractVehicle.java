interface Vehicle {
    void start();
    void stop();
    String getInfo();
}


abstract class AbstractVehicle implements Vehicle {

    protected String type;
    protected String fuel;
    protected String color;
    protected int capacity;

    public AbstractVehicle(String type, String fuel){
        this.type = type;
        this.fuel = fuel;
    }


    public void start() {
        System.out.println(type + " is starting...");
    }


    public void stop() {
        System.out.println(type + " is stopping...");
    }



    public abstract String getInfo(); //  Each class will make @override method, to it own properties.
}
