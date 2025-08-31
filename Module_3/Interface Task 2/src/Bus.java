



class Bus extends AbstractVehicle {

    public Bus(String type, String fuel, int capacity) {
        super(type, fuel);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "Bus Information:" + "\nType: " + type + "\nFuel: " + fuel  + "\nCapacity: " + capacity + " Passengers";
    }
}