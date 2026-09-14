package Day5;

import java.util.Scanner;

public class Task1cAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double average = (a + b + c) / 3.0;

        System.out.println("Average = " + average);
    }
}