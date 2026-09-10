import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 2
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        scanner.close();
    }
}