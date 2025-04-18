import java.io.IOException;
import java.io.RandomAccessFile;

public class Program50 {

    public static void main(String[] args) {
        // File to work with
        String filePath = "randomAccessFile.txt";

        // Write data to file
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            // Write initial data
            file.writeUTF("Hello, this is a test file.\n");
            file.writeUTF("Random Access File demonstration.\n");
            System.out.println("Data has been written to the file.");

            // Move to the start of the file to read the data
            file.seek(0);

            // Read and display the content
            System.out.println("\nReading data from the file:");
            String line;
            while ((line = file.readUTF()) != null) {
                System.out.println(line);
            }

            // Append some more text to the file
            file.seek(file.length());  // Move to the end of the file
            file.writeUTF("\nAppending new text at the end of the file.");
            System.out.println("\nText has been appended to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Reading the updated file content
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            System.out.println("\nReading the updated file content:");
            String line;
            while ((line = file.readUTF()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
