import javax.swing.*;

public class Program51 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Hello Swing");

        // Set the window size
        frame.setSize(300, 200);

        // Close the window when the user clicks the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel to display the text "Hello"
        JLabel label = new JLabel("Hello", SwingConstants.CENTER);

        // Add the label to the frame's content pane
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
