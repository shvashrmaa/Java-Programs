//lab program 4 - Add n numbers using command-line inputs.

import java.util.Scanner;

public class ArithmeticOperatins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        double sum = 0;
        
        // Taking n numbers as input and calculating the sum
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }
        
        // Displaying results
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}
