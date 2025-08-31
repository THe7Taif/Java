abstract class AbstractVehicle{

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



    abstract String getInfo(); //  Each class will make @override method, to it own properties.
}