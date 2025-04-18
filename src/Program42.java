public class Program42 {

    // Method that uses "throws" to declare an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Using "throw" to throw an exception manually
            throw new ArithmeticException("Access Denied - You must be 18 or older.");
        } else {
            System.out.println("Access Granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // This block always runs
            System.out.println("Finally block: Execution complete.");
        }
    }
}

