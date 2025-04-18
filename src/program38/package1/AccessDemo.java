package program38.package1;

public class AccessDemo {
    private int privateVar = 10;
    int defaultVar = 20;           // Default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void display() {
        System.out.println("Inside AccessDemo (Same Class):");
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}