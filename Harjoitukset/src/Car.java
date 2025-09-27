public class Car {

    private String typeName;
    private int carSpeed;
    boolean isOn;

    public Car() {
        isOn = false;
    }

    public void setName(String name) {
        if (!isOn) {
            this.typeName = name;
        }

    }
    public String getName() {
        return this.typeName;
    }

    public void setcarSpeed(int speed) {
        carSpeed = speed;
    }

    public int getcarSpeed() {
        return carSpeed;
    }

}
