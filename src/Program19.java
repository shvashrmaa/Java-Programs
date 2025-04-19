//Lab 22 : Perform stack operations using classes and objects. 

// Define a Stack class
class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is empty when top is -1
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;  // Increment top and add value
            System.out.println(value + " pushed to stack");
        } else {
            System.out.println("Stack Overflow! Unable to push " + value);
        }
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];  // Return and decrement top
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        } else {
            System.out.println("Stack Underflow! No element to pop");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (top >= 0) {
            return stackArray[top];  // Return the top element
        } else {
            System.out.println("Stack is empty");
            return -1;  // Return -1 if the stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;  // Stack is empty if top is -1
    }

    // Method to check the size of the stack
    public int size() {
        return top + 1;  // The size is one more than the index of the top element
    }
}

public class Program19 {
    public static void main(String[] args) {
        // Create a stack object with a maximum size of 5
        Stack stack = new Stack(5);

        // Perform stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Try to push an element to a full stack
        stack.push(60);  // This should cause a stack overflow

        // View the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
