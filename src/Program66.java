import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program66 extends JFrame implements MouseListener {

    private int centerX = 200;
    private int centerY = 200;
    private int outerRadius = 50;
    private int innerRadius = 20;

    public Porgram66() {
        setTitle("Expand Ring on Click");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        DrawingPanel panel = new DrawingPanel();
        panel.addMouseListener(this);
        add(panel);

        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw outer circle (filled)
            g.setColor(Color.BLUE);
            g.fillOval(centerX - outerRadius, centerY - outerRadius,
                    outerRadius * 2, outerRadius * 2);

            // Draw inner circle (clear area)
            g.setColor(getBackground());
            g.fillOval(centerX - innerRadius, centerY - innerRadius,
                    innerRadius * 2, innerRadius * 2);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        outerRadius += 10; // Expand outer radius
        repaint();          // Redraw with updated size
    }

    // Unused mouse events
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Program66::new);
    }
}

