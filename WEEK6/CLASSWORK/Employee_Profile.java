

class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println("ID: " + empId + " | Name: " + empName +
                " | Salary: " + salary + " | Intern: " + isIntern);
    }
}

public class Employee_Profile {
    public static void main(String[] args) {
        Employee e1 = new Employee("E101", "Rahul", 50000);
        Employee e2 = new Employee("E102", "Arun");

        e1.printProfile();
        e2.printProfile();
    }
}