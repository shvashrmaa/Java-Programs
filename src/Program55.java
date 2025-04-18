import javax.swing.*;
import java.awt.*;

public class Program55 extends JFrame {

    public static void main(String[] args) {
        // Create a frame (window) for the bar chart
        JFrame frame = new JFrame("Turnover Bar Chart");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to draw the bar chart
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Call the method to draw the bar chart
                drawBarChart(g);
            }
        };

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to draw the bar chart
    public static void drawBarChart(Graphics g) {
        // Data for the years and turnover
        String[] years = {"2009", "2010", "2011", "2012", "2013", "2014"};
        int[] turnover = {110, 150, 135, 200, 210, 185};

        // Set color for the bars
        g.setColor(Color.BLUE);

        // Bar width
        int barWidth = 40;

        // X position for the first bar
        int x = 50;

        // Draw the bars for each year
        for (int i = 0; i < years.length; i++) {
            // Draw the bar (x, y, width, height)
            g.fillRect(x, 300 - turnover[i], barWidth, turnover[i]);

            // Draw the year label below the bar
            g.setColor(Color.BLACK);
            g.drawString(years[i], x + 5, 320);

            // Move the x position for the next bar
            x += 60;
        }

        // Add labels for the axes
        g.setColor(Color.BLACK);
        g.drawString("Turnover (Rs. Crores)", 180, 50);
        g.drawString("Years", 230, 350);

        // Draw the y-axis line
        g.drawLine(40, 50, 40, 300);
        g.drawLine(40, 300, 400, 300);  // x-axis line
    }
}
