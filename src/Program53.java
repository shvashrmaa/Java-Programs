import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program53 {

    public static void main(String[] args) {
        // Create the frame (window) for the application
        JFrame frame = new JFrame("Arithmetic Operations");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the container panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Create text fields and labels
        JLabel num1Label = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();
        JLabel num2Label = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Disable editing for result field

        // Create buttons for arithmetic operations
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");

        // Add components to the panel
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(resultLabel);
        panel.add(resultField);

        // Add the panel to the frame
        frame.add(panel);

        // Action listeners for the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultField, "add");
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultField, "subtract");
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultField, "multiply");
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultField, "divide");
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }

    // Method to perform arithmetic operations
    private static void performOperation(JTextField num1Field, JTextField num2Field, JTextField resultField, String operation) {
        try {
            // Get input from text fields
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            // Perform the selected operation
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 == 0) {
                        resultField.setText("Error: Divide by zero");
                        return;
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }

            // Display the result in the result field
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }
}

