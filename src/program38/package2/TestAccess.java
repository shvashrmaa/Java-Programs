package program38.package2;

import program38.package1.AccessDemo;

class SubDemo extends AccessDemo {
    void show() {
        System.out.println("\nInside SubDemo (Subclass in different package):");
        // System.out.println("Private: " + privateVar); // Not accessible
        // System.out.println("Default: " + defaultVar); // Not accessible
        System.out.println("Protected: " + protectedVar); // Accessible through inheritance
        System.out.println("Public: " + publicVar); // Accessible
    }
}

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.display();

        System.out.println("\nInside TestAccess (Non-subclass, different package):");
        // System.out.println("Private: " + obj.privateVar); // Not accessible
        // System.out.println("Default: " + obj.defaultVar); // Not accessible
        // System.out.println("Protected: " + obj.protectedVar); // Not accessible
        System.out.println("Public: " + obj.publicVar); // Accessible

        SubDemo subObj = new SubDemo();
        subObj.show();
    }
}
