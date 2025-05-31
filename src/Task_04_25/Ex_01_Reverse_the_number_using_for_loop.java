package Task_04_25;

import java.util.Scanner;

public class Ex_01_Reverse_the_number_using_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // Use a for loop to reverse the number
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
