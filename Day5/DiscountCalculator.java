package Day5;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read bill amount
        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double discount;

        // Apply discount based on bill amount
        if (bill >= 5000) {
            discount = bill * 0.20;       // 20% discount
        } else if (bill >= 3000) {
            discount = bill * 0.15;       // 15% discount
        } else if (bill >= 1000) {
            discount = bill * 0.10;       // 10% discount
        } else {
            discount = 0;                // No discount
        }

        // Calculate final amount
        double finalAmount = bill - discount;

        // Display results
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Bill Amount : $" + bill);
        System.out.println("Discount    : $" + discount);
        System.out.println("Final Amount: $" + finalAmount);
    }
}