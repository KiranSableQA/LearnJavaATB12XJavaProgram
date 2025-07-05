package Test22june;

public class Student_02 {
        static class Student {
            String name;
            int rollNo;
            String section;

            // Constructor
            Student(String name, int rollNo, String section) {
                this.name = name;
                this.rollNo = rollNo;
                this.section = section;
            }

            // Method to print student details
            void printDetails() {
                System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
            }
        }

        public static void main(String[] args) {
            Student s1 = new Student("Bob", 101, "A");
            s1.printDetails();
        }
    }



