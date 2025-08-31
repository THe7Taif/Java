public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Car", "Petrol", "Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");


        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        Vehicle bus = new Bus("Bus", "Diesel", 40);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo() + "\n");


    }
}
