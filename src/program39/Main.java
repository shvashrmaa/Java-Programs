package program39;

import program39.Academics.Student;
import program39.Sports.Sports;

public class Main implements Sports {
    public static void main(String[] args) {
        // Sample student
        Student student = new Student(101, 75, 85);

        // Display info
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Paper 1: " + student.paper1);
        System.out.println("Paper 2: " + student.paper2);
        System.out.println("Academic Total: " + student.getAcademicTotal());
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Grand Total: " + (student.getAcademicTotal() + sportsScore));
    }
}
