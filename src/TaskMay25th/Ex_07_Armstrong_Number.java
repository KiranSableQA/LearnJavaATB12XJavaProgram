package TaskMay25th;

import java.util.Scanner;

public class Ex_07_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        // Count number of digits
        int digits = String.valueOf(number).length();

        // Calculate sum of powers of digits
        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if Armstrong
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
