class Counter {
    // Static variable: Shared by all instances of the class
    static int count = 0;

    // Instance variable
    String name;

    // Constructor to initialize the name of the Counter object
    public Counter(String name) {
        this.name = name;
        // Increment the static count variable every time a new object is created
        count++;
    }

    // Static method: Can be called without creating an instance of the class
    public static void displayCount() {
        System.out.println("Number of Counter objects created: " + count);
    }

    // Instance method
    public void displayName() {
        System.out.println("Object name: " + name);
    }
}

public class Program25 {
    public static void main(String[] args) {
        // Display static count before creating any objects
        Counter.displayCount();  // Output: Number of Counter objects created: 0

        // Creating objects of the Counter class
        Counter counter1 = new Counter("Counter One");
        Counter counter2 = new Counter("Counter Two");
        Counter counter3 = new Counter("Counter Three");

        // Display instance-specific information
        counter1.displayName();  // Output: Object name: Counter One
        counter2.displayName();  // Output: Object name: Counter Two
        counter3.displayName();
        // Call the static method using the class name
        Counter.displayCount();  // Output: Number of Counter objects created: 3
    }
}
