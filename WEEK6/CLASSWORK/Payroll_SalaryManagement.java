class SalaryAccount {
    private double basicSalary;
    private double bonus;

    public SalaryAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Negative salary. Starting with 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid bonus amount.");
        } else {
            bonus += amount;
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage.");
        } else {
            basicSalary = basicSalary - (basicSalary * percent / 100);
        }
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class Payroll_SalaryManagement {
    public static void main(String[] args) {
        SalaryAccount p = new SalaryAccount(50000);

        p.creditBonus(5000);
        p.deductTax(10);

        System.out.println("Net Salary: " + p.getNetSalary());
    }
}
