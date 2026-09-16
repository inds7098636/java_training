package Week2 Day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;

        while (number != 0) {

            // Get the last digit using modulus
            int digit = number % 10;

            // Add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit using division
            number = number / 10;

            // Display each step
            System.out.println("Digit: " + digit);
            System.out.println("Current Reverse: " + reverse);
            System.out.println("Remaining Number: " + number);
            System.out.println();
        }

        System.out.println("Final Reversed Number: " + reverse);

        scanner.close();
    }
}