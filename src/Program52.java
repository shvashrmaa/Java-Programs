import javax.swing.*;

public class Program52 {
    public static void main(String[] args) {
        // Check if command line arguments are passed
        String name = "World";  // Default value if no name is passed
        if (args.length > 0) {
            name = args[0];  // First argument passed will be the name
        }

        // Create the JFrame (window) to display the message
        JFrame frame = new JFrame("Hello Swing with Parameter");

        // Set the window size
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display the "Hello" message
        JLabel label = new JLabel("Hello, " + name, SwingConstants.CENTER);

        // Add the label to the frame's content pane
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}

