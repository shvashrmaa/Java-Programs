public class Program41 {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element: " + numbers[2]);

            try {
                // Inner try block
                int result = 10 / 0; // Will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds!");
        }

        System.out.println("Program continues after nested try/catch.");
    }
}