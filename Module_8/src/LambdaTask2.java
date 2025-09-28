import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);



        // Filter remove even numbers.
        numbers.removeIf((n -> n % 2 == 0));
        System.out.println("New Filtered ArrayList numbers by remove even numbers: ");
        numbers.forEach((n) -> System.out.println(n));



        // now new ArrayList contains only odd numbers. (5, 15, 3)
        // Multiply each number by 2. for the ArrayList after removing even numbers. so the result will be odd numbers multiplied by 2.
        numbers.replaceAll(n -> n * 2);
        System.out.println("New ArrayList numbers by Multiply each number by 2: ");
        numbers.forEach((n) -> System.out.println(n));



        // Calculate the sum of all numbers in the ArrayList after filtering and multiplying.  so the result will be sum of (5*2 + 15*2 + 3*2) = 46
        int sum = 0;
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println("Sum of all numbers in the ArrayList: " + sum);

    }
}