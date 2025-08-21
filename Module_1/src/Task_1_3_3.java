/* Task 3: Prime number generator

Write a program that prompts the user to enter two positive integers,
start and end (where start < end). The program should generate and
display all the prime numbers between start and end, inclusive.

A prime number is a positive integer greater than 1 that has no
positive divisors other than 1 and itself.

Your program should use control structures (such as loops and conditional
statements) to implement the logic for generating and checking prime numbers.
*/

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_1_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user to enter a binary number as a string
        System.out.print("Enter a first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int end = scanner.nextInt();

        // Step 2: Validate input
        if (start > 0 && start < end) {
            System.out.println("Prime numbers between " + start + " and " + end + ":");

            // Step 3: Loop through numbers between start and end
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) { // isPrime is a function checking if the current number i is a prime number.
                    System.out.print(i + " ");
                }

            }
        } else {
            System.out.println("Invalid input! Make sure start < end and both are positive.");
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
