import java.util.Scanner;

public class T1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // first we ask in Java mothed way to get the input func.
        System.out.print("Enter your name: "); // then we print message for the mothed func to user to input Data.
        String user = input.nextLine(); // New String Var to have the last Data from Var "input" with nextLine mothed func.
        System.out.print("Welcome back, " + user); // print message results with String Var user
    }
}
