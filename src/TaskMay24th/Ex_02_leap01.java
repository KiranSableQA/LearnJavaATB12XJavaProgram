package TaskMay24th;

import java.util.Scanner;

public class Ex_02_leap01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get month and year from the user
            System.out.print("Enter month number (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            int days;

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
                    break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
                    break;

                case 2:
                    // Leap year logic
                    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    days = isLeap ? 29 : 28;
                    System.out.println("Month 2 of year " + year + " has " + days + " days.");
                    break;

                default:
                    System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }

            scanner.close();
        }
    }


