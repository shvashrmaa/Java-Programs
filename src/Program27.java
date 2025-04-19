// Lab Exp 30 : Shopping list operations using a vector and classes & objects.
import java.util.Vector;

class ShoppingList {
    // Vector to store the shopping items
    private Vector<String> items;

    // Constructor to initialize the shopping list
    public ShoppingList() {
        items = new Vector<>();
    }

    // Method to add an item to the shopping list
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " has been added to your shopping list.");
    }

    // Method to remove an item from the shopping list
    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item + " has been removed from your shopping list.");
        } else {
            System.out.println(item + " is not found in the shopping list.");
        }
    }

    // Method to display the shopping list
    public void displayList() {
        if (items.isEmpty()) {
            System.out.println("Your shopping list is empty.");
        } else {
            System.out.println("Your Shopping List:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    // Method to check if an item exists in the shopping list
    public boolean containsItem(String item) {
        return items.contains(item);
    }

    // Method to clear all items from the shopping list
    public void clearList() {
        items.clear();
        System.out.println("All items have been removed from your shopping list.");
    }
}

public class Program27 {
    public static void main(String[] args) {
        // Create a shopping list object
        ShoppingList myList = new ShoppingList();

        // Add items to the shopping list
        myList.addItem("Milk");
        myList.addItem("Eggs");
        myList.addItem("Bread");

        // Display the shopping list
        myList.displayList();

        // Remove an item from the shopping list
        myList.removeItem("Eggs");

        // Display the shopping list again
        myList.displayList();

        // Check if an item exists in the shopping list
        boolean exists = myList.containsItem("Bread");
        System.out.println("Is Bread in the list? " + exists);

        // Clear the shopping list
        myList.clearList();

        // Display the shopping list after clearing
        myList.displayList();
    }
}
