package Day2;

public class NumberSwap {
    public static void main(String[] args) {
        // Swapping using a temporary variable
        int first = 10;
        int second = 20;
        System.out.println("Before swapping:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        int temp = first;
        first = second;
        second = temp;
        System.out.println("\nAfter swapping using temporary variable:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        // Swapping without using a temporary variable
        int num1 = 30;
        int num2 = 40;
        System.out.println("\nBefore swapping without temporary variable:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("\nAfter swapping without temporary variable:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}

