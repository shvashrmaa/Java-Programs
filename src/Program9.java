// lab Program 9 - Demonstrate the use of typecasting.

import java.util.Scanner;

public class Program9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrating typecasting
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        // Implicit typecasting (Widening conversion)
        double doubleValue = intValue;
        System.out.println("Implicit Typecasting (int to double): " + doubleValue);
        
        // Explicit typecasting (Narrowing conversion)
        System.out.print("Enter a double value: ");
        double inputDouble = scanner.nextDouble();
        int narrowedInt = (int) inputDouble;
        System.out.println("Explicit Typecasting (double to int): " + narrowedInt);
        
        scanner.close();
    }
}
