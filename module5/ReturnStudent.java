class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ReturnStudent {
    static Student createStudent() {
        return new Student("Gagan");
    }

    public static void main(String[] args) {
        Student s = createStudent();
        System.out.println("Student: " + s.name);
    }
}
