


public class Car {

    private String name;
    private double gasolineLevel;
    private double speed;

    public Car(String name) {
        this.name = name;
        this.gasolineLevel = 0;
        this.speed = 0;
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

    double getSpeed() { return speed; }
    // void fillTank() { gasolineLevel = 100; }
    protected void setSpeed(double speed) { this.speed = speed; }
    protected void setGasolineLevel(double gasoline) { this.gasolineLevel = gasoline; }
    double getGasolineLevel() { return gasolineLevel; }
    public String getName() { return name; }

}
