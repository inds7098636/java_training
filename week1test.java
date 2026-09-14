import java.util.Scanner;
public class week1test {
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter the first number 1: "); 
    double num1 = scanner.nextDouble(); 
    System.out.print("Enter the second number 2: ");
    double num2 = scanner.nextDouble();
    System.out.println("Addition: " + (num1 + num2)); 
     scanner.close();
}
}
