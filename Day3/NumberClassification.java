import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Classify the number
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        scanner.close();
    }
}