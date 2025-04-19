import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program65 extends JFrame implements KeyListener {

    private String message = "Press any key...";

    public Program65() {
        setTitle("Keyboard Event Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel to display the message
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.BOLD, 18));
                g.drawString(message, 50, 100);
            }
        };

        panel.setFocusable(true);
        panel.addKeyListener(this); // Add key listener to panel
        add(panel);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        message = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Program65::new);
    }
}
