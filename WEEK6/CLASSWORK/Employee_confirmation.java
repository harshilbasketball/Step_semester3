class Employee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Count: " + employeeCount);
    }
}

public class Employee_confirmation {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 40000);
        Employee e2 = new Employee("Priya", 45000);
        Employee e3 = new Employee("Arun", 50000);

        Employee.printCompanyInfo();
    }
}