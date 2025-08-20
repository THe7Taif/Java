/*
Task 2; Triangles
Write a program that asks the user for the lengths of the legs of a right
triangle and prints the length of the hypotenuse of the triangle.
*/

import java.util.Scanner;

public class Task_1_2_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first length number of the right leg triangle: ");
    double a = sc.nextDouble();
    System.out.print("Enter the second length number of the right leg triangle: ");
    double b = sc.nextDouble();

    // Calculate hypotenuse using Pythagorean theorem: c = √(a² + b²)
    double hypotenuse  = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) ;


    System.out.printf("The length of the hypotenuse of the triangle: %.2f%n", hypotenuse);
    sc.close();
}
}

