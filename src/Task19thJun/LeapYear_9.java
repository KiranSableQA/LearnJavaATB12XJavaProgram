package Task19thJun;

import java.util.Scanner;

public class LeapYear_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year logic:
        // Divisible by 4, not divisible by 100 unless also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}
