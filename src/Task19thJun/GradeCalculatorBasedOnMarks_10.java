package Task19thJun;

import java.util.Scanner;

public class GradeCalculatorBasedOnMarks_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 to 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100)
        {
            System.out.println("Invalid input! Marks must be between 0 and 100.");
        }
        else
        {

            if (marks >= 90)
            {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: Fail");
            }

        }

        sc.close();
    }
}