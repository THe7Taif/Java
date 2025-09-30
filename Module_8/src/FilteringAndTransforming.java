import java.util.Arrays;
import java.util.List;

/// Declarative version:
public class FilteringAndTransforming {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        int result = numbers.stream()
                .filter(number -> number % 2 != 0)               // keep only odd numbers
                .map(number -> number * 2)                      // multiply each odd number by 2
                .reduce(0, (a, b) -> a + b);    // sum all the resulting numbers
        // OR   .reduce(0, Integer::sum);


        System.out.println("Results : " + result);



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