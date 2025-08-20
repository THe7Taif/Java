/* Task 1
   Install the environment, create a new project,
   and write a simple program that greets the user
   with a fixed message.Run the program and make sure
   that it works. Commit your changes to GitHub.
*/

import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // first we ask Scanner class which in Java package with Var to get the input func.
        System.out.print("Enter your name: "); // then we print message for the mothed func to user to input Data.
        String user = input.nextLine(); // New String Var to have the last Data from Var "input" with nextLine mothed func.
        System.out.print("Welcome back, " + user); // print message results with String Var user
    }
}
