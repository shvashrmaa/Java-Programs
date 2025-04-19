import java.util.Vector;

public class Program61 {
    public static void main(String[] args) {
        // Declare a vector of integers
        Vector<Integer> numbers = new Vector<>();

        // Add elements to the vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Display elements using index-based for loop
        System.out.println("Elements using index:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Display elements using enhanced for loop
        System.out.println("Elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Insert an element at a specific index
        numbers.add(1, 15); // insert 15 at index 1
        System.out.println("After inserting 15 at index 1: " + numbers);

        // Remove an element
        numbers.remove(2); // remove element at index 2
        System.out.println("After removing element at index 2: " + numbers);

        // Check size of vector
        System.out.println("Size of vector: " + numbers.size());

        // Check if vector contains an element
        System.out.println("Vector contains 20? " + numbers.contains(20));

        // Clear the vector
        numbers.clear();
        System.out.println("Vector after clear(): " + numbers);
    }
}
