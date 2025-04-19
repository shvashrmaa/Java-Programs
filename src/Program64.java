import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Program64 extends JFrame implements ActionListener {

    // UI Components
    JTextArea textArea;
    JButton loadButton;

    public Program64() {
        setTitle("Read Student File");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Text area to show file content
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Button to load file
        loadButton = new JButton("Load");

        // Add components to frame
        add(scrollPane, BorderLayout.CENTER);
        add(loadButton, BorderLayout.SOUTH);

        // Add action listener
        loadButton.addActionListener(this);

        // Center the window
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadButton) {
            textArea.setText(""); // Clear previous text
            try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (FileNotFoundException fnfe) {
                JOptionPane.showMessageDialog(this, "File not found. Please run the entry program first.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(this, "Error reading file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Program64().setVisible(true));
    }
}
