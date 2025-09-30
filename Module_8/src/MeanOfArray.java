import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Calculate the mean of an array of integers.
/// Declarative version:
public class MeanOfArray {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        double mean = numbers.stream()
                // convert Integer to int using mapToInt (e -> e + 0) or (Integer::intValue)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Mean of the array: " + mean);



        // Another way to calculate mean:
        double mean2 = numbers.stream()
                                                    // convert Integer to int using mapToInt (e -> e + 0) or (Integer::intValue)
                .mapToInt(e -> e + 0)
                                                    // calculate average mean = sum / numbers.size()
                .average()
                .orElse(0);                  // if empty return 0

        System.out.println("Mean2 of the array: " + mean2);



        // Another Shorter  way to calculate mean: (remove the main List and use directly an array of int)
        /*
        int[] numbers = {10, 20, 30, 40};
        double mean = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Mean = " + mean);
         */



    }
}





/// imperative version:
/*
public class MeanOfArray {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        double sum = 0;
        double mean = 0;
        for (int n : numbers) {
            sum = sum + n;
            mean = sum / numbers.size();
        }

        System.out.println("Mean of the array: " + mean);
    }
}
*/