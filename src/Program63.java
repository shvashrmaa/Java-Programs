import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Program63 extends JFrame implements ActionListener {

    // Labels and TextFields
    JLabel rollLabel, nameLabel, marksLabel;
    JTextField rollField, nameField, marksField;

    // Buttons
    JButton enterButton, doneButton;

    // File writer
    BufferedWriter writer;

    public Program63() {
        setTitle("Student Record Entry");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Initialize components
        rollLabel = new JLabel("Roll Number:");
        nameLabel = new JLabel("Student Name:");
        marksLabel = new JLabel("Marks:");

        rollField = new JTextField();
        nameField = new JTextField();
        marksField = new JTextField();

        enterButton = new JButton("Enter");
        doneButton = new JButton("Done");

        // Add components to frame
        add(rollLabel);
        add(rollField);
        add(nameLabel);
        add(nameField);
        add(marksLabel);
        add(marksField);
        add(enterButton);
        add(doneButton);

        // Add action listeners
        enterButton.addActionListener(this);
        doneButton.addActionListener(this);

        // Center the window
        setLocationRelativeTo(null);
        setVisible(true);

        // Initialize writer
        try {
            writer = new BufferedWriter(new FileWriter("students.txt", true));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error initializing file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton) {
            String roll = rollField.getText().trim();
            String name = nameField.getText().trim();
            String marks = marksField.getText().trim();

            if (roll.isEmpty() || name.isEmpty() || marks.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                writer.write("Roll No: " + roll + ", Name: " + name + ", Marks: " + marks);
                writer.newLine();
                writer.flush();
                JOptionPane.showMessageDialog(this, "Data saved successfully!");

                // Clear fields
                rollField.setText("");
                nameField.setText("");
                marksField.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing to file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == doneButton) {
            try {
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            dispose(); // Close the window
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Program63::new);
    }
}
