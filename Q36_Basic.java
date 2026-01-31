class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name);
        this.id = id;
    }
}

class Manager extends Employee {
    String dept;

    Manager(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }
}

public class Q36_Basic {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 101, "IT");
        System.out.println("Program executed.");
    }
}
