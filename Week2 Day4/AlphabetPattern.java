package Week2 Day4;

public class AlphabetPattern {
    public static void main(String[] args) {

        // Outer loop controls the rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints alphabets from A to the current letter
            for (int j = 0; j < i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }

            // Move to the next line
            System.out.println();
        }
    }
}