// Shape Interface
interface Shape {
    double PI = 3.14159;

    double area();
    double perimeter();
}

// Circle Class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Square Class
class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

// Main Class to Test the Shapes
public class Program36 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println("Circle: ");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nRectangle: ");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println("\nSquare: ");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
