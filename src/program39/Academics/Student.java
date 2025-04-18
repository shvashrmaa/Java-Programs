package program39.Academics;

public class Student {
    public int rollNo;
    public int paper1;
    public int paper2;

    public Student(int rollNo, int paper1, int paper2) {
        this.rollNo = rollNo;
        this.paper1 = paper1;
        this.paper2 = paper2;
    }

    public int getAcademicTotal() {
        return paper1 + paper2;
    }
}
