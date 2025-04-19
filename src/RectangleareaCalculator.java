//LAb Program 20 : 22 	Perform the Q. No. 21 by introducing methods for initializing the values and for calculating the area. 

import java.util.Scanner;

class Rectangle1 {
    double length, width;

    // Method to initialize values
    void initialize(double len, double wid) {
        length = len;
        width = wid;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}

public class RectangleareaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two Rectangle objects
        Rectangle1 rect1 = new Rectangle1();
        Rectangle1 rect2 = new Rectangle1();

        // Taking input for first rectangle
        System.out.print("Enter length of first rectangle: ");
        double length1 = sc.nextDouble();
        System.out.print("Enter width of first rectangle: ");
        double width1 = sc.nextDouble();
        rect1.initialize(length1, width1);  // Initializing first rectangle

        // Taking input for second rectangle
        System.out.print("Enter length of second rectangle: ");
        double length2 = sc.nextDouble();
        System.out.print("Enter width of second rectangle: ");
        double width2 = sc.nextDouble();
        rect2.initialize(length2, width2);  // Initializing second rectangle

        // Calculating and displaying areas
        System.out.println("\nArea of First Rectangle: " + rect1.calculateArea());
        System.out.println("Area of Second Rectangle: " + rect2.calculateArea());

        sc.close();
    }
}

