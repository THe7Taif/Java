/* Task 2 also Task 4 */


public class Car {

    private String typeName;
    private double speed;
    private double gasolineLevel;
    private boolean isCruiseOn = false; // for Task_4 Flag to check if cruise control is ON
    private int targetSpeed;            // then new Var to set the target speed cruise control


    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        targetSpeed = 0;
    }

    public Car(String typeName, double initialSpeed, double gasolineTankCapacity) { // Task_2
        this.typeName = typeName;
        speed = initialSpeed;
        gasolineLevel = gasolineTankCapacity;

    }

    public boolean turnCruiseOn(int speed) {   // for Task_4 func tio turn Cruise On then adding the  target speed
        if (speed < 30 || speed > 120) {
            return false; // the speed not in the valid limits.
        }

        if (gasolineLevel <= 0) { // smaller or zero, our gas should be from  1 to 100
            return false; // we can't turn it on without gas
        }

        targetSpeed = speed;   // otherwise set values to work
        isCruiseOn = true;
        return true;
    }

    public boolean isCruiseOn() {
        return isCruiseOn;
    }

    public void updateSpeed() {
        if (!isCruiseOn) return;

        if (gasolineLevel <= 0) {
            isCruiseOn = false;
            System.out.println("Cruise turned off: no gasoline.");
            return;
        }

        if (speed < targetSpeed) {
            accelerate();
        } else if (speed > targetSpeed) {
            decelerate(5); // speed slowing down
        } else {
        }
    }


    public int getTargetSpeed() {
        return targetSpeed;
    }


    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }


}