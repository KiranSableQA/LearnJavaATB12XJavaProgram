package Test02_22_june;

public class Employee_03 {

        static class Employee {
            private int id;
            private String name;
            private double salary;

            // Getter and Setter for id
            public int getId() {
                return id;
            }
            public void setId(int id) {
                this.id = id;
            }

            // Getter and Setter for name
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }

            // Getter and Setter for salary
            public double getSalary() {
                return salary;
            }
            public void setSalary(double salary) {
                this.salary = salary;
            }
        }

        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.setId(1);
            emp.setName("John Doe");
            emp.setSalary(50000);

            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: " + emp.getSalary());
        }
    }


