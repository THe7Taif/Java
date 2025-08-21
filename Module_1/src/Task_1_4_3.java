/*
Task 3: Removing duplicates

Write a program that takes an array of integers as input from the user
and removes all the duplicate numbers from it. The program should work
as follows:

1. Ask the user for the size of the array.
2. Prompt the user to enter the integers into the array.
3. Remove all the duplicate numbers from the array using the following logic:
     Create a new array that stores only one occurrence of each number.
     Keep only the first occurrence of each number and discard any subsequent occurrences.
     Print the resulting array without the duplicate numbers.

In this assignment, you can make the new array as big as the original array,
even though it may not be completely filled.
 */

import java.util.Scanner;

public class Task_1_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // step1: how many numbers in array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Step2: what are the numbers to add in array
        int[] numbers = new int[size];

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Step3:  Remove all the duplicate numbers from the array
        // مصفوفة جديدة لتخزين الأرقام بدون تكرار
        int[] uniqueNumbers = new int[size];
        int uniqueCount = 0; // عدد الأرقام المضافة بدون تكرار

        for (int i = 0; i < size; i++) {
            int current = numbers[i];
            boolean isDuplicate = false;

            // نتحقق هل الرقم موجود مسبقاً في uniqueNumbers
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == current) {
                    isDuplicate = true;
                    break; // اذا وجدناه، نوقف البحث
                }
            }

            // اذا ما كان تكرار، نضيف الرقم للمصفوفة الجديدة
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // نطبع الأرقام بدون تكرار
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }

        input.close();
    }
}

