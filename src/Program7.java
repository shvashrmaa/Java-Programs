// Lab program 7 - Calculate and print the first n Fibonacci numbers.

import java.util.Scanner;

public class Program7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of Fibonacci terms
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        
        // Initializing first two Fibonacci numbers
        int first = 0, second = 1;
        
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
