import java.util.Scanner;

// Custom exception class for NoMatchException
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}


public class Program45 {

    // Method to check if the string matches "India"
    static void checkMatch(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException("The string does not match 'India'.");
        } else {
            System.out.println("The string matches 'India'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        try {
            checkMatch(input); // Call the method that may throw NoMatchException
        } catch (NoMatchException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}

