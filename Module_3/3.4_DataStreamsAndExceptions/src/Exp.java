import java.util.Scanner;

class Exp {
    public static void main(String[] args) {


        try {
                      // 0 1, 2, 3
            int arr[] = {1, 3, 0, 4};
            int n = arr[4];
            System.out.println(n);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
        System.out.println("Hello World");
    }
}