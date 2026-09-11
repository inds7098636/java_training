package Day4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read marks from the user
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Use an if-else ladder to determine the grade
        if (marks >= 90) {
            // Marks 90 or above → Grade A
            System.out.println("Grade: A");

        } else if (marks >= 80) {
            // Marks from 80 to 89 → Grade B
            System.out.println("Grade: B");

        } else if (marks >= 70) {
            // Marks from 70 to 79 → Grade C
            System.out.println("Grade: C");

        } else if (marks >= 60) {
            // Marks from 60 to 69 → Grade D
            System.out.println("Grade: D");

        } else {
            // Marks below 60 → Grade F
            System.out.println("Grade: F");
        }

        sc.close();
    }
}