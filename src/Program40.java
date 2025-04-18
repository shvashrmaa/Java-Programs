public class Program40 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // This will cause an exception
        int result;

        try {
            result = num1 / num2; // Attempt division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after try/catch block.");
    }
}