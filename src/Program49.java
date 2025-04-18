import java.io.*;
class Student {
    int id;
    String name;
    String studentClass;
    String semester;
    int marks1, marks2, marks3;

    // Constructor to initialize student details
    public Student(int id, String name, String studentClass, String semester, int marks1, int marks2, int marks3) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.semester = semester;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    public int totalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Semester: " + semester);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("---------------------------");
    }
}

public class Program49 {
    public static void main(String[] args) {
        // Array of students
        Student[] students = {
                new Student(101, "John Doe", "10th Grade", "Fall", 80, 90, 85),
                new Student(102, "Jane Smith", "12th Grade", "Spring", 75, 88, 92),
                new Student(103, "Mike Brown", "11th Grade", "Fall", 85, 91, 89),
                new Student(104, "Sarah Lee", "10th Grade", "Spring", 92, 84, 87),
                new Student(105, "David Wilson", "12th Grade", "Fall", 79, 85, 90)
        };

        // File to store student data
        String fileName = "students.dat";

        // Write student data to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Student student : students) {
                out.writeObject(student);
            }
            System.out.println("Student data has been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read student data from file and display
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("\nStudent Information from file:");
            for (int i = 0; i < students.length; i++) {
                Student student = (Student) in.readObject();
                student.displayInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
