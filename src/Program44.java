import java.util.InputMismatchException;
import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Enter first integer: ");
            num1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program completed.");
            scanner.close();
        }
    }
}
