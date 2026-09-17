package Week2 Day3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number
        int originalNumber = number;

        // Count the number of digits
        int digits = 0;
        int temp = number;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate the sum of powers of digits
        int sum = 0;
        temp = number;

        while (temp != 0) {
            int digit = temp % 10;  // Extract last digit

            int power = 1;

            // Calculate digit^digits
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;  // Remove last digit
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}