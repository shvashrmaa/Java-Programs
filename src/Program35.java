import java.util.Scanner;

// Base Class
class Publication {
    String title;
    double price;
    String authorName;

    void getData(Scanner scanner) {
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter price: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter author's name: ");
        authorName = scanner.nextLine();
    }

    void displayData() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + authorName);
    }
}

// Derived Class for Books
class Book extends Publication {
    int pcount;

    @Override
    void getData(Scanner scanner) {
        super.getData(scanner);
        System.out.print("Enter page count: ");
        pcount = Integer.parseInt(scanner.nextLine());
    }

    @Override
    void displayData() {
        super.displayData();
        System.out.println("Page Count: " + pcount);
    }
}

// Derived Class for Ebooks
class Ebook extends Publication {
    double ptime; // in hours

    @Override
    void getData(Scanner scanner) {
        super.getData(scanner);
        System.out.print("Enter playing time (in hours): ");
        ptime = Double.parseDouble(scanner.nextLine());
    }

    @Override
    void displayData() {
        super.displayData();
        System.out.println("Playing Time: " + ptime + " hours");
    }
}

// Main Class to test the code
public class Program35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Book
        System.out.println("Enter details for a Printed Book:");
        Book book = new Book();
        book.getData(scanner);

        System.out.println("\nDetails of Printed Book:");
        book.displayData();

        // Test Ebook
        System.out.println("\nEnter details for an Ebook:");
        Ebook ebook = new Ebook();
        ebook.getData(scanner);

        System.out.println("\nDetails of Ebook:");
        ebook.displayData();

        scanner.close();
    }
}

