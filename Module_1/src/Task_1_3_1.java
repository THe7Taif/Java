import java.util.Scanner;

public class Task_1_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get values from user
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        // Step 2: Calculate the discriminant D = b^2 - 4ac, then we can do
        // our if-else, with the result. our next step deppends on discriminant

        double discriminant = b * b - 4 * a * c;

        // Step 3: Use the discriminant result to find the roots
        if (discriminant > 0) {
            // Two different real roots, means if the D result postiive
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Two real roots: x1 = %.2f and x2 = %.2f\n", root1, root2);

        } else if (discriminant == 0) {
            // One real root (both roots are the same) means if the D result zero
            double root = -b / (2 * a);
            System.out.printf("One real root: x = %.2f\n", root);

        } else {
            // No real roots (because the square root of a negative number is imaginary)
            System.out.println("No real roots");
        }
    }
}
