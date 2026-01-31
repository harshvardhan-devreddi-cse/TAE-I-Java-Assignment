class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q36_Modified {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 101, "IT");

        System.out.println("Manager Details:");
        m.displayManager();
    }
}
