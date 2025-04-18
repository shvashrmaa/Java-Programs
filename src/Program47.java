import java.io.FileOutputStream;
import java.io.IOException;

public class Program47 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "output.dat"; // Replace with your desired file path

        // Data to be written (byte array)
        byte[] data = {65, 66, 67, 68, 69};  // ASCII values for A, B, C, D, E

        // Create FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Write bytes to file
            fos.write(data);
            System.out.println("Bytes written to the file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
