import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {

        CoffeeMaker maker = new CoffeeMaker();
        // Step1: Coffee maker on,
        maker.pressPower();     // function from Class CoffeeMaker.

        Scanner input = new Scanner(System.in);

        // Step2: getting input for the type by int number
        System.out.print("Enter coffee maker type, press 1 for normal or 2 for espresso: ");
        int coffeeType = input.nextInt();

        // the conditions for the choice
        if (coffeeType == 1) {
            maker.setCoffeeType("normal");    // function from Class CoffeeMaker().
        } else if (coffeeType == 2) {
            maker.setCoffeeType("espresso");  // function from Class CoffeeMaker().
        }

        // Step3: getting the amount of coffee
        System.out.print("Insert the coffee amount, 10–80 ml: ");
        int numAmount = input.nextInt();
        maker.setCoffeeAmount(numAmount);       // function from Class CoffeeMaker.

        // Step4: Printing our resultss
        System.out.println("Coffee maker is on");
        System.out.println("Coffee type is " + maker.getCoffeeType());              // function from Class CoffeeMaker().
        System.out.println("Coffee amount is " + maker.getCoffeeAmount() + " ml");  // function from Class CoffeeMaker().

        // step5: turn off coffee maker
        maker.pressPower();         // function from Class CoffeeMaker().
        System.out.println("Coffee maker is off");
    }
}
