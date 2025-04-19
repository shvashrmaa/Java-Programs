// Lab program 3 - Perform all arithmetic operations by taking inputs from the command line.

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the command line
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Performing arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.NaN;
        double remainder = (num2 != 0) ? num1 % num2 : Double.NaN;
        
        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + (Double.isNaN(quotient) ? "Undefined (division by zero)" : quotient));
        System.out.println("Remainder: " + (Double.isNaN(remainder) ? "Undefined (modulus by zero)" : remainder));
        
        scanner.close();
    }
}
