/*
Task 2: Finding the maximum subarray sum

Write a program that takes an array of integers as input from the user
and finds the subarray with the maximum sum. A subarray is a portion of
an array, which consists of contiguous elements from the original
array in the same order. The program should work as follows:

1. Ask the user for the number of integers in the array.
2. Prompt the user to enter the integers into the array.
3. Find the subarray with the maximum sum using the following logic:
        Iterate through all possible subarrays in the array.
        Calculate the sum of each subarray.
        Keep track of the maximum sum found and the corresponding
        subarray indices.
4. Print the maximum sum and the corresponding indices. (Use the
indices shown to the user, i.e., starting from 1.)
*/

import java.util.Scanner;

public class Task_1_4_2 {
    public static void main(String[] args) {

        // step1: how many numbers in array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many integers for the array: ");
        int size = input.nextInt();

        // Step2: what are the numbers to add in array
        int numbers [] = new int[size];

        System.out.println("Enter the integers:");

        // adding the numbers (values) one by one from i by (for) loop.
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
            // Step3: Find the subarray with the maximum sum using brute force.
            //        in this step we want to find the sum with all possbile
            //        other numbers, we start from first one with all the second
            //        with all... same for all numbers forwored. Like numbers = [1, -3, 7, ..]
            //        first number [1] next [1, -3] next [1, -3, 7,] .... then next number
            //        second number [-3] next [-3, 7,].
            //        third [7]. for that we will use (Nested for loop)
            int maxSum = Integer.MIN_VALUE;
            int startIdx = 0;
            int endIdx = 0;

            for (int i = 0; i < size; i++) {           // Start of subarray
                for (int j = i; j < size; j++) {       // End of subarray
                    int currentSum = 0;

                    for (int k = i; k <= j; k++) {  // Sum subarray arr[i..j]
                        currentSum += numbers[k];
                    }

                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                        startIdx = i;
                        endIdx = j;
                    }
                }
            }

            // Step4: Print the result with 1-based indexing
            System.out.println("Maximum Subarray Sum: " + maxSum);
            System.out.println("Subarray starts at index: " + (startIdx + 1));
            System.out.println("Subarray ends at index: " + (endIdx + 1));

            input.close();
        }
    }
