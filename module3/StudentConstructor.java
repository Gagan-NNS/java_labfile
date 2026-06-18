class StudentConstructor {
    int rollNo;
    String name;

    StudentConstructor() {
        rollNo = 0;
        name = "Unknown";
    }

    StudentConstructor(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();
        StudentConstructor s2 = new StudentConstructor(1, "Gagan");

        s1.display();
        s2.display();
    }
}
