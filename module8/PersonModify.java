class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class PersonModify {
    static Person modify(Person p) {
        p.name = "Updated Gagan";
        return p;
    }

    public static void main(String[] args) {
        Person p = new Person("Gagan");
        p = modify(p);
        System.out.println(p.name);
    }
}
