// Lab 24 : Perform program 25 using constructor overloading. 
// Define a class with constructor overloading to calculate volume
class VolumeCalculator1 {

    double volume;

    // Constructor to calculate the volume of a rectangle (length x width x height)
    public VolumeCalculator1(double length, double width, double height) {
        volume = length * width * height;
    }

    // Constructor to calculate the volume of a cube (side^3)
    public VolumeCalculator1(double side) {
        volume = side * side * side;
    }

    // Method to get the calculated volume
    public double getVolume() {
        return volume;
    }
}

public class Program21 {
    public static void main(String[] args) {
        // Create an object for the rectangle (length = 5, width = 3, height = 4)
        VolumeCalculator1 rectangleVolume = new VolumeCalculator1(5, 3, 4);
        System.out.println("Volume of the rectangle: " + rectangleVolume.getVolume() + " cubic units");

        // Create an object for the cube (side = 4)
        VolumeCalculator1 cubeVolume = new VolumeCalculator1(4);
        System.out.println("Volume of the cube: " + cubeVolume.getVolume() + " cubic units");
    }
}
