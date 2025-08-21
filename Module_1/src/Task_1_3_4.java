/*
Task 4: Multiplication table exam

In primary school, students must memorize the multiplication tables
for numbers 1 to 10. Create a program to assist primary school
students that presents the user with ten randomly generated multiplication
problems, where the factors are integers between one and ten. After
each answer, the program indicates whether it was correct or not.
The user receives one point for each correctly answered question.
If the user scores ten points for the entire set of problems,
the program congratulates them on mastering the multiplication tables
and terminates. Otherwise, the program starts a new set of problems.

Hint: Random number can be generated with Math.random().

Below is a code that returns a random number between 1 and 10.
int luku = (int) (Math.random() * 10) + 1;
 */

import java.util.Scanner;

public class Task_1_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int score = 0;

            for (int i = 1; i <= 10; i++) {
                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;

                System.out.print("Q" + i + ": What is " + a + " x " + b + " = ");
                int answer = input.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    // increase score
                    score++;
                } else {
                    System.out.println("Wrong. The correct answer is " + (a * b));
                }
            }

            if (score == 10) {
                System.out.println("🎉 Excellent! You mastered the multiplication tables.");
                break;
            } else {
                System.out.println("\nYou scored " + score + "/10. Let's try again!\n");
            }
        }
    }
}

