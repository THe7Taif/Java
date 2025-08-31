


class Motorcycle extends AbstractVehicle {

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:" + "\nType: " + type + "\nFuel: " + fuel  + "\nColor: " + color + "\n";
    }
}