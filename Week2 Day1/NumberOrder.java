package Week2 Day1;

public class NumberOrder {
    public static void main(String[] args) {

        // Ascending order: start from 1 and increase by 1 each time
        System.out.println("Ascending Order:");

        for (int i = 1; i <= 10; i++) {
            // i++ increases the loop counter after each iteration
            System.out.println(i);
        }

        // Descending order: start from 10 and decrease by 1 each time
        System.out.println("\nDescending Order:");

        for (int i = 10; i >= 1; i--) {
            // i-- decreases the loop counter after each iteration
            System.out.println(i);
        }
    }
}