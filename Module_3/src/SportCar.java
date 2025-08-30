public class SportCar extends Car {

    public SportCar(String name) {
        super(name); // Calling for the consture From the Car Calss
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {     // SportCar accelerates faster than normal Car, so we override the Car class func.
            setSpeed(getSpeed() + 20);   // Also becuz of the private variables in the Car Class, we should use the Getters and Setters func.
            setGasolineLevel(getGasolineLevel() - 5);
            System.out.println(getName() + " accelerated to " + getSpeed() + " km/h!");
        } else {
            System.out.println(getName() + " cannot accelerate, no gasoline!");
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            setSpeed(Math.max(0, getSpeed() - (amount * 2))); // in this line we get the speed first that user put, then get the amount that user put * 2, becuz we slow down better than normal car so for example 5 * 2  = 10,
                                                                // after that when user put --> getSpeed(50) - 10 = 40. then Math.max(0, ...) to not get the result in (-) minus, so we keep it at 0 zero and we stop it.
            System.out.println(getName() + " decelerated to " + getSpeed() + " km/h!");
        } else {
            setSpeed(0); // If no gasoline, car stops
        }
    }
}
