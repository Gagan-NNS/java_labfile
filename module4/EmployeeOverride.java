class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class EmployeeOverride {
    public static void main(String[] args) {
        Employee e;

        e = new Manager();
        e.work();

        e = new Developer();
        e.work();
    }
}
