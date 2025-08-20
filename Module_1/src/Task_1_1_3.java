import java.util.Scanner;

public class Task_1_1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product  = first * second * third;
        double average = (first + second + third) / 3.0; // we should remember always that when we use var type division (double is 3.0 not 3) (int is 3 not 3.0 ...)
                                                        // that we should change the data in var to be as the same type of the var we call.

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }
}