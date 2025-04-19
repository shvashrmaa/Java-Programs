// Lab Program 10 - Demonstrate the use of type conversion.

import java.util.Scanner;

public class Program10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrating type conversion
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        // Numeric to String conversion
        String intToString = Integer.toString(intValue);
        System.out.println("Integer to String: " + intToString);
        
        // String to Numeric conversion
        System.out.print("Enter a numeric string: ");
        String numericString = scanner.next();
        int stringToInt = Integer.parseInt(numericString);
        System.out.println("String to Integer: " + stringToInt);
        
        // Double to String conversion
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        String doubleToString = Double.toString(doubleValue);
        System.out.println("Double to String: " + doubleToString);
        
        // String to Double conversion
        System.out.print("Enter a numeric string for double conversion: ");
        String doubleString = scanner.next();
        double stringToDouble = Double.parseDouble(doubleString);
        System.out.println("String to Double: " + stringToDouble);
        
        scanner.close();
    }
}
