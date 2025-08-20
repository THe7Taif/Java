
/*
Task 1: Fahrenheit to Celsius Converter

Fahrenheit to Celsius Converter Write a program that prompts the user
to enter a temperature in Fahrenheit and converts it to Celsius.
Display the converted temperature on the console with one decimal place. */

import java.util.Scanner;

public class Task_1_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float temperatureInFahrenheit = input.nextFloat();

        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("Temperature in Celsius: %.1f%n", temperatureInCelsius);

        input.close();
    }
}
