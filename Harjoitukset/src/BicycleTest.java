// Association Permanent (العلاقة الدائمة)


public class BicycleTest {
    public static void main(String[] args) {
        // main() knows both the Person and Bicycle objects, because main() creates both of them

        Person  benzino = new Person("Enzio", "Benzino", 1982); // first: this object benzino needs to be created first
        Person  ahmed   = new Person("Ahmed", "Kamal", 1983);   // first: this object ahmed needs to be created first

        Bicycle bike    = new Bicycle(benzino, "Tunturi", 5, "Viuh");  // Second: we send the created object (benzino) to the Bicycle constructor to assign it to the 'owner' field inside the new Bicycle object
        Bicycle bike2    = new Bicycle(ahmed, "Tunturio", 4, "Hiuh");  // Second: we send the created object (benzino) to the Bicycle constructor to assign it to the 'owner' field inside the new Bicycle object


        bike.drive();  // finally, we print the object bike, which has all applied info. with drive() method from Bicycle Class.
        bike2.drive();
    }
}