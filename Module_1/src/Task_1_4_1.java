/* Task 1: A name generator

Write a program that generates random names by combining first and last
from hard-coded name arrays. The program should work as follows:

Create two arrays, firstNames and lastNames, which contain first and last names.

Ask the user how many random names the program should generate.

Generate random names using the following logic:

1. Choose the index value for the first name randomly.
2. Choose the index value for the last name randomly.
3. Use the index values to create a random full name (i.e. first name and last name).
4. Print the generated full name.
Repeat these steps as many times as the user-specified number of names to generate.
*/

import java.util.Scanner;

public class Task_1_4_1 {
    public static void main(String[] args) {

        String[] firstNames = { "Sophia", "Liam", "Ava", "James", "Emily"};
        String[] lastNames =  { "Nguyen", "Bennett", "Thompson", "Rodriguez", "Carter" };

        Scanner input = new Scanner(System.in);
        System.out.print("How many random names should be generated? ");
        int numbers = input.nextInt();

        for (int i = 0; i < numbers; i++) {
            int firstIndex = (int)(Math.random() * firstNames.length);
            int lastIndex = (int)(Math.random() * lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];
            System.out.println((i + 1) + ". " + fullName);
        }

        input.close();
    }
}

