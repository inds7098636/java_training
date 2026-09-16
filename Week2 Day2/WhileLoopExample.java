package Week2 Day2;

public class WhileLoopExample {
    public static void main(String[] args) {

        // Print numbers from 1 to 10
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Countdown from 10 to 1
        int count = 10;

        System.out.println("\nCountdown:");

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Happy New Year!");
    }
}