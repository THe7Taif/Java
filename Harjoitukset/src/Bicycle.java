// Association

public class Bicycle {
    private Person owner;   // we are taking the Class Person information to owner variable
    private String model;
    private int    gears;
    private String sound;

    public Bicycle(Person owner, String model, int gears, String sound) {
        this.owner = owner;
        this.model = model;
        this.gears = gears;
        this.sound = sound;
    }

    public void drive() {
        System.out.println(this.model + ": " + owner.getName() + " drives");
    }

    public String getSound() {
        return sound;
    }
}