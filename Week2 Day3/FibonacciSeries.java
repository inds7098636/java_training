package Week2 Day3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // First two Fibonacci numbers
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        // Generate Fibonacci series
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            // Calculate the next number
            int next = first + second;

            // Move to the next two numbers
            first = second;
            second = next;
        }

        scanner.close();
    }
}