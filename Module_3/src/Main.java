


public class Main {
    public static void main(String[] args) {
        Car car = new Car("turboprop");
        System.out.println(car.getName());
        System.out.println(car.getSpeed());



        // Main method for quick test
            Bus cityBus = new Bus("City Bus", 50); // create a bus with max 50 passengers

            cityBus.passengerEnter(30); // 30 enter
            cityBus.passengerEnter(25); // only 20 more can enter (max 50)
            cityBus.passengerExit(10);  // 10 exit
            cityBus.passengerExit(50);  // cannot go below 0
    }
}