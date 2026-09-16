package Week2 Day2;

import java.util.Scanner;

public class FactorialComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Factorial using FOR loop
        int factorialFor = 1;

        for (int i = 1; i <= n; i++) {
            factorialFor = factorialFor * i;
        }

        System.out.println("Factorial using for loop: " + factorialFor);

        // Factorial using WHILE loop
        int factorialWhile = 1;
        int i = 1;

        while (i <= n) {
            factorialWhile = factorialWhile * i;
            i++;
        }

        System.out.println("Factorial using while loop: " + factorialWhile);

        /*
         * Comparison:
         *
         * FOR loop:
         * - Initialization, condition, and increment are written together.
         * - Best when the number of iterations is known.
         *
         * WHILE loop:
         * - Initialization and increment are written separately.
         * - Useful when the number of iterations is not known in advance.
         *
         * Both loops produce the same factorial result.
         */

        scanner.close();
    }
}