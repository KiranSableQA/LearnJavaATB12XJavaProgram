package Test02_22_june;

public class Employee_Hierarchy_07 {

// Base
static class Employee
    {
        String name;
        double Salary() {
            return 0.0;
        }
    }
// Manager subclass
    static class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    double Salary()
    {
        return baseSalary + bonus;
    }
    }
    // Developer subclass
    static class Developer extends Employee {
        double hourlyRate;
        int hoursWorked;

        Developer(String name, double hourlyRate, int hoursWorked) {
            this.name = name;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        double Salary() {
            return hourlyRate * hoursWorked;
        }
    }
    public static void main(String[] args) {
        // Create Manager and Developer
        Manager m = new Manager("Alice", 60000, 10000);
        Developer d = new Developer("Bob", 50, 160);

        // Print salaries
        System.out.println("Manager Salary: " + m.Salary());
        System.out.println("Developer Salary: " + d.Salary());
    }

}
