
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", "Gasoline", "Red", 25.0);
        System.out.println(car.getInfo());

        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black", 40.0);
        System.out.println(motorcycle.getInfo());

        ElectricCar electricCar = new ElectricCar("Car", "Electric", "Blue", 0.2);
        electricCar.charge();
        System.out.println(electricCar.getInfo());

        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Motorcycle", "Electric", "Green", 0.15);
        electricMotorcycle.charge();
        System.out.println(electricMotorcycle.getInfo());
    }
}
