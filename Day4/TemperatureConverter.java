package Day4;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display the conversion menu
        System.out.println("Temperature Conversion Menu");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        // Read the user's choice
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Read the temperature
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        // Perform conversion based on the user's choice
        if (choice == 1) {

            // Formula: Fahrenheit = (Celsius × 9/5) + 32
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else if (choice == 2) {

            // Formula: Celsius = (Fahrenheit - 32) × 5/9
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);

        } else {

            // This executes when the user enters an invalid choice
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}