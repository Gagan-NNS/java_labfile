class Employee {
    int empId;
    String name;
    static String company = "Amity University";

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    static void changeCompany(String newCompany) {
        company = newCompany;
    }

    void display() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Gagan");
        Employee e2 = new Employee(102, "Rahul");

        e1.display();
        e2.display();

        Employee.changeCompany("Google");

        e1.display();
        e2.display();
    }
}
