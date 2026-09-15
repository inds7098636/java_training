package Week2 Day1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Loop from 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            // Multiply the number by the loop counter
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}