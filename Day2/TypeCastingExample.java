package Day2;

public class TypeCastingExample {
public static void main(String[] args) {
        // Implicit casting: int is automatically converted to double.
        // This is also called widening conversion.
        int number = 25;
        double decimalNumber = number;
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + number);
        System.out.println("double value: " + decimalNumber);
        // Explicit casting: double is manually converted to int.
        // This is also called narrowing conversion.
        double price = 45.75;
        int wholeNumber = (int) price;
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + price);
        System.out.println("int value: " + wholeNumber);
    }
}

