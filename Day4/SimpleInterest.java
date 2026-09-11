package Day4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the principal amount from the user
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Read the rate of interest (in percentage)
        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();

        // Read the time period (in years)
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Simple Interest formula:
        // SI = (Principal × Rate × Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}