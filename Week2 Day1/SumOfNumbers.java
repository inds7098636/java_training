package Week2 Day1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the value of n from the user
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        // Display the final sum
        System.out.println("Sum from 1 to " + n + " = " + sum);

        scanner.close();
    }
}
