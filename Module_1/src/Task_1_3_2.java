/*
Task 2: Binary values

Write a program that prompts the user to enter a binary number
(composed of 0s and 1s) and converts it to decimal. Display the
decimal equivalent on the console. Hint: use the charAt method of
the String class to retrieve the individual bits in the input string.
 */

import java.util.Scanner;

public class Task_1_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user to enter a binary number as a string
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;  // this will store the decimal value

        // Step 2: Loop through each character (bit) in the string
        for (int i = 0; i < binary.length(); i++) {
            char bitChar = binary.charAt(i);   // get the current character

            int bit = bitChar - '0';            // convert '0' or '1' to int 0 or 1

            // Step 3: Multiply the current total by 2, then add the current bit
            decimal = decimal * 2 + bit;
        }

        // Step 4: Print the final decimal value
        System.out.println("Decimal value is: " + decimal);
    }
}
