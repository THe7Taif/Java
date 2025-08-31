// Main class
public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Car", "Electric", "Red");
        System.out.println(electricCar.getInfo());
        electricCar.charge();

        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Motorcycle", "Electric", "Black");
        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.charge();

        Car car = new Car("Car", "Gasoline", "Blue");
        System.out.println(car.getInfo());
        car.charge();

        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Petrol", "Green");
        System.out.println(motorcycle.getInfo());
        motorcycle.charge();
    }
}