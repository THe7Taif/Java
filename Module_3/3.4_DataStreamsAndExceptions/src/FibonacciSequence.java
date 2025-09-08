import java.io.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        try {
            PrintWriter num = new PrintWriter("file.csv");

            // Step 1: Write CSV header
            num.println("Index,Fibonacci Number");

            long first = 0;  // first number
            long second = 1; // second number
            int total = 60;  // Number of terms

            // Step 2: Write the first two numbers with their indices
            num.println("1," + first);
            num.println("2," + second);

            // Step 3: Generate remaining numbers (from 3rd to 60th)
            for(int i = 3; i <= total; i++) {
                long next = first + second;
                num.println(i + "," + next);

                // Update for next iteration, keep forward
                first = second;
                second = next;
            }

            // Step 4: close the program
            num.close();
            System.out.println("Fibonacci sequence generated successfully!");

            // Catching exp or err
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}