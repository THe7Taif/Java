// Association


public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;

    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname  = lastname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public void drive(Bicycle bike, int kilometers) {
        System.out.println("");
        for (int i = 1; i <= kilometers; i++){
            System.out.println(bike.getSound() +" "+ i + " km travelled");
        }
    }
}