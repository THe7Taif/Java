import java.util.Scanner;

public class CarDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Create a car and fill its tank
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        System.out.println(myCar.getTypeName() + " created with speed: " + myCar.getSpeed() + " km/h and fuel: " + myCar.getGasolineLevel());

        // Step 2: Ask user for target cruise speed
        System.out.print("Enter cruise control target speed (30–120): ");
        int targetSpeed = input.nextInt();

        // Step 3: Try to turn on cruise control
        boolean success = myCar.turnCruiseOn(targetSpeed);

        if (!success) {
            System.out.println("Cruise control could not be turned on. Check speed range and fuel level.");
        } else {
            System.out.println("Cruise control activated. Target speed: " + myCar.getTargetSpeed());

            // Step 4: Simulate speed updates
            for (int i = 0; i < 15; i++) {
                myCar.updateSpeed();
                System.out.println("Current speed: " + myCar.getSpeed() + " km/h");

                // Optional: Slow down output so user can see it
                try {
                    Thread.sleep(500); // 500 milliseconds
                } catch (InterruptedException e) {
                    // do nothing
                }

                // Step 5: Check if cruise turned off due to empty fuel
                if (!myCar.isCruiseOn()) {
                    System.out.println("Cruise control turned off automatically.");
                    break;
                }
            }
        }

        input.close();
    }
}
