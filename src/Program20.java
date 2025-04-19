// Lab Program 23 :  Calculate the volume of rectangle and cube using method overloading. 

// Define a class with overloaded methods for calculating volume
class VolumeCalculator {

    // Method to calculate the volume of a rectangle (length x width x height)
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate the volume of a cube (side^3)
    public double calculateVolume(double side) {
        return side * side * side;
    }
}

public class Program20 {
    public static void main(String[] args) {
        // Create an object of the VolumeCalculator class
        VolumeCalculator volumeCalculator = new VolumeCalculator();

        // Calculate the volume of a rectangle (length = 5, width = 3, height = 4)
        double rectangleVolume = volumeCalculator.calculateVolume(5, 3, 4);
        System.out.println("Volume of the rectangle: " + rectangleVolume + " cubic units");

        // Calculate the volume of a cube (side = 4)
        double cubeVolume = volumeCalculator.calculateVolume(4);
        System.out.println("Volume of the cube: " + cubeVolume + " cubic units");
    }
}
