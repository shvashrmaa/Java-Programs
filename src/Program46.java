import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program46 {
    public static void main(String[] args) {
        // File paths
        String sourceFile = "source.txt";   // Replace with your source file path
        String destFile = "destination.txt"; // Replace with your destination file path

        // Declare FileReader and FileWriter
        FileReader reader = null;
        FileWriter writer = null;

        try {
            // Initialize FileReader and FileWriter
            reader = new FileReader(sourceFile);
            writer = new FileWriter(destFile);

            int ch;
            // Read and write each character
            while ((ch = reader.read()) != -1) {
                writer.write(ch);  // Write character to destination file
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                // Close resources
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
