//Lab program 21 : Calculate the area of two rectangles using classes and objects. 
// Perform program  using constructors.
// Define a Rectangle class
class Rectangle {
    // Instance variables for length and width
    double length, width;
    
    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

public class Program18 {
    public static void main(String[] args) {
        // Create two objects of the Rectangle class
        Rectangle rectangle1 = new Rectangle(5, 10);  // Rectangle with length 5 and width 10
        Rectangle rectangle2 = new Rectangle(7, 4);   // Rectangle with length 7 and width 4
        
        // Calculate and print the areas of the two rectangles
        double area1 = rectangle1.calculateArea();
        double area2 = rectangle2.calculateArea();
        
        System.out.println("Area of Rectangle 1: " + area1 + " square units");
        System.out.println("Area of Rectangle 2: " + area2 + " square units");
    }
}
