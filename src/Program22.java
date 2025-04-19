// LAb 25 : emonstrate pass by value and pass by reference. in java
class Test {
    // Method to demonstrate pass by value (primitive type)
    public void modifyValue(int num) {
        num = 100;  // Changing the local copy of num
        System.out.println("Inside modifyValue method: " + num);  // prints 100
    }

    // Method to demonstrate pass by value (object reference)
    public void modifyObject(Person1 person) {
        person.name = "John";  // Modifying the object's state (name)
        person = new Person1("Alice");  // Reassigning the reference, doesn't affect the original reference
        System.out.println("Inside modifyObject method (person name): " + person.name);  // prints Alice
    }
}

class Person1 {
    String name;

    Person1(String name) {
        this.name = name;
    }
}

public class Program22 {
    public static void main(String[] args) {
        Test test = new Test();

        // Demonstrate pass by value with a primitive type
        int number = 50;
        System.out.println("Before modifyValue method: " + number);  // prints 50
        test.modifyValue(number);
        System.out.println("After modifyValue method: " + number);  // still prints 50

        // Demonstrate pass by value with an object reference
        Person1 person = new Person1("Mike");
        System.out.println("Before modifyObject method: " + person.name);  // prints Mike
        test.modifyObject(person);
        System.out.println("After modifyObject method: " + person.name);  // prints John
    }
}
