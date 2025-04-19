import java.util.ArrayList;
import java.util.Collections;

public class Program62 {
    public static void main(String[] args) {
        // Create a collection (ArrayList) of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        // Sort the list before performing binary search
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Element to search for
        int key = 20;

        // Perform binary search
        int index = Collections.binarySearch(numbers, key);

        // Check result
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found. Insertion point: " + (-index - 1));
        }
    }
}

