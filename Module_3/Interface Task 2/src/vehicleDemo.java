class vehicleDemo {

    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("Car", "Petrol", "Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo());

        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        Bus bus = new Bus("Bus", "Diesel", 40);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}