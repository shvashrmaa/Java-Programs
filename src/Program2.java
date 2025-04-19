class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // optional here, called implicitly if not written
        System.out.println("Dog constructor called");
    }
}

public class Program2{
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
