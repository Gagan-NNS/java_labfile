class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class UpdateStudent {
    static void updateMarks(Student s) {
        s.marks += 10;
    }

    public static void main(String[] args) {
        Student s = new Student(80);
        updateMarks(s);
        System.out.println("Updated Marks: " + s.marks);
    }
}
