public class Driver {
    public static void main(String[] args) {

        Car myCar = new Car();



        myCar.setName("tesla");
        System.out.println(myCar.getName());

        myCar.setcarSpeed(90);
        System.out.print(myCar.getcarSpeed());
    }
}
