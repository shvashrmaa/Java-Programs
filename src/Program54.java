import javax.swing.*;
import java.awt.*;

public class Program54 extends JFrame {

    public static void main(String[] args) {
        // Create a frame (window) to display the shapes
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to draw shapes
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Call the methods to draw different shapes
                drawShapes(g);
            }
        };

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to draw various shapes
    public static void drawShapes(Graphics g) {
        // Draw a Line
        g.setColor(Color.RED);
        g.drawLine(50, 50, 400, 50);

        // Draw a Rectangle (x, y, width, height)
        g.setColor(Color.BLUE);
        g.drawRect(50, 100, 100, 50);

        // Draw a Filled Rectangle
        g.setColor(Color.GREEN);
        g.fillRect(200, 100, 100, 50);

        // Draw an Oval (x, y, width, height)
        g.setColor(Color.ORANGE);
        g.drawOval(50, 200, 150, 100);

        // Draw a Filled Oval
        g.setColor(Color.CYAN);
        g.fillOval(200, 200, 150, 100);

        // Draw a Polygon (Triangle)
        g.setColor(Color.MAGENTA);
        int[] xPoints = {100, 150, 200};
        int[] yPoints = {350, 300, 350};
        g.drawPolygon(xPoints, yPoints, 3);

        // Draw an Arc (part of a circle)
        g.setColor(Color.PINK);
        g.drawArc(300, 300, 100, 100, 0, 180); // Draw a half circle

        // Draw a String (Text)
        g.setColor(Color.BLACK);
        g.drawString("Shapes drawn with Graphics class", 150, 450);
    }
}
