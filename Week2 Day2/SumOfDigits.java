package Week2 Day2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Loop through each digit
        while (number != 0) {

            // Extract the last digit
            int digit = number % 10;

            // Add the digit to sum
            sum = sum + digit;

            // Remove the last digit
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
