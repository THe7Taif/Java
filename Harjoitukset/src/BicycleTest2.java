// Temporary Association (العلاقة المؤقتة)


/*
The benzino.drive(tunturi, 3); will call the drive() method that belongs to Person.
Inside this method, the bike object (a Bicycle) is passed as a parameter and used
temporarily during the loop to print its sound. */


public class BicycleTest2 {
    public static void main(String[] args) {

        Person  benzino = new Person("Enzio", "Benzino", 1982); // first: this object benzino needs to be created first


        Bicycle bike = new Bicycle(benzino, "Tunturi", 5, "Viuh");     // Second:This is still a permanent reference from Bicycle to Person (stored as owner), not the temporary association yet
        Bicycle bike2 = new Bicycle(benzino,"Nopsa", 3, "Ka...boom");


        benzino.drive(bike, 3);  // finally, we print the object bike, which has all applied info. with drive(Bicycle bike, int kilometers) method from Person Class.
        benzino.drive(bike2, 2);
    }
}