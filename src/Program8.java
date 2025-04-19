//lab program 8 - Reverse the digits of a number.
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Reversing the digits
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        // Displaying result
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}
