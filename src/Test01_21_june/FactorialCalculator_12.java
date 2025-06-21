package Test01_21_june;
import java.util.Scanner;
public class FactorialCalculator_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            long factorial = 1;
            int i = number;

            while (i > 1) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }


