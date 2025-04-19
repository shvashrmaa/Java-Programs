// Lab 26 : Demonstrate how an object can be returned
class Person {
    String name;
    int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details of the Person object
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Program23 {
    // Method that returns a Person object
    public static Person createPerson(String name, int age) {
        // Creating a new Person object and returning it
        Person newPerson = new Person(name, age);
        return newPerson;
    }

    public static void main(String[] args) {
        // Calling the createPerson method to return a new Person object
        Person person = createPerson("Alice", 30);

        // Using the returned Person object to display details
        person.displayDetails();  // Output: Name: Alice, Age: 30
    }
}
