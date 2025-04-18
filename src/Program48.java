import java.io.FileInputStream;
import java.io.IOException;

public class Program48 {
    public static void main(String[] args) {
        // Specify the file path (same as the one written in previous example)
        String filePath = "output.dat"; // Replace with your file path if necessary

        // Create FileInputStream
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.println("Reading bytes from file:");

            // Read bytes from the file one at a time
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData + " ");  // Convert byte to char and display
            }

            System.out.println("\nFile reading complete.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

