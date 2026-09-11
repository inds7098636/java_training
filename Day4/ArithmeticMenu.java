package Day4;

import java.util.Scanner;

public class ArithmeticMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display the arithmetic menu
        System.out.println("Arithmetic Operations Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Read the user's choice
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Read two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Use switch-case to perform the selected operation
        switch (choice) {

            case 1:
                // Add the two numbers
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                // Subtract the second number from the first
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                // Multiply the two numbers
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                // Check for division by zero before dividing
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                // Executes when the user enters an invalid menu option
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}