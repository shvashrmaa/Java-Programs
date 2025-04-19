// Lab program 5 - Compute and print factorial of a given number.

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        long factorial = 1;
        
        // Calculating factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        // Displaying result
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        scanner.close();
    }
}

