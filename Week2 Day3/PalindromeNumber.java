package Week2 Day3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number
        int originalNumber = number;

        // Variable to store the reversed number
        int reversedNumber = 0;

        // Reverse the number using while loop
        while (number != 0) {
            int digit = number % 10;              // Get last digit
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;                 // Remove last digit
        }

        // Compare original and reversed numbers
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}