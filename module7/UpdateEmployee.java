class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }
}

public class UpdateEmployee {
    static void increaseSalary(Employee e) {
        e.salary += 5000;
    }

    public static void main(String[] args) {
        Employee e = new Employee(30000);
        increaseSalary(e);
        System.out.println("New Salary: " + e.salary);
    }
}
