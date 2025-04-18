class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Program43 {

    // Method that throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: You must be 18 or older.");
        } else {
            System.out.println("Valid Age: Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // Try changing this to 20 and see the output
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Validation complete.");
        }
    }
}
