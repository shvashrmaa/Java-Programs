import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program60 {

    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Display ArrayList elements
        System.out.println("ArrayList: " + arrayList);

        // Perform ArrayList operations
        System.out.println("ArrayList - Element at index 2: " + arrayList.get(2)); // Access element
        arrayList.add(2, "Grape");  // Add element at index 2
        System.out.println("ArrayList after adding Grape at index 2: " + arrayList);
        arrayList.remove("Banana");  // Remove element by value
        System.out.println("ArrayList after removing Banana: " + arrayList);
        arrayList.remove(0);  // Remove element by index
        System.out.println("ArrayList after removing element at index 0: " + arrayList);
        System.out.println("ArrayList contains 'Cherry'? " + arrayList.contains("Cherry")); // Check if element exists

        // Create a LinkedList and add some elements
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Elephant");
        linkedList.add("Fox");
        linkedList.add("Giraffe");
        linkedList.add("Horse");

        // Display LinkedList elements
        System.out.println("\nLinkedList: " + linkedList);

        // Perform LinkedList operations
        System.out.println("LinkedList - Element at index 1: " + linkedList.get(1)); // Access element
        linkedList.addFirst("Zebra"); // Add element at the beginning
        System.out.println("LinkedList after adding Zebra at the beginning: " + linkedList);
        linkedList.addLast("Lion"); // Add element at the end
        System.out.println("LinkedList after adding Lion at the end: " + linkedList);
        linkedList.removeFirst(); // Remove the first element
        System.out.println("LinkedList after removing first element: " + linkedList);
        linkedList.removeLast(); // Remove the last element
        System.out.println("LinkedList after removing last element: " + linkedList);
        System.out.println("LinkedList contains 'Giraffe'? " + linkedList.contains("Giraffe")); // Check if element exists

        // Checking the size of both lists
        System.out.println("\nSize of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());
    }
}
