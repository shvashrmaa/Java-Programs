// lab program 6 - Compute the sum of digits of a given integer.

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Calculating sum of digits
        int sumOfDigits = 0;
        int temp = num;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        
        // Displaying result
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits);
        
        scanner.close();
    }
}

