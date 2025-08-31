


class Car extends AbstractVehicle {

    public Car(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Car Information:" + "\nType: " + type + "\nFuel: " + fuel  + "\nColor: " + color + "\n";
    }

}