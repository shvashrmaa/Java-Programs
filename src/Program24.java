// Define a class for calculating the factorial
class Factorial {
    
    // Recursive method to calculate factorial
    public int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call: factorial of n is n * factorial of (n-1)
        else {
            return n * calculateFactorial(n - 1);
        }
    }
}

public class Program24 {
    public static void main(String[] args) {
        // Create an object of the Factorial class
        Factorial factorialObject = new Factorial();

        // Define a number for which we want to calculate the factorial
        int number = 5;

        // Call the calculateFactorial method to get the factorial of the number
        int result = factorialObject.calculateFactorial(number);

        // Output the result
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
