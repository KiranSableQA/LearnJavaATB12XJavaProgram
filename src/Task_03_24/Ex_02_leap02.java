package Task_03_24;

import java.util.Scanner;

public class Ex_02_leap02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month no");
        int monthNo= sc.nextInt();

        System.out.println("Enter your year");
        int year =sc.nextInt();

        switch(monthNo)
        {
            case 1,3,5,7,8,10,12-> System.out.println("31 days");

            case 4,6,9,11 -> System.out.println("30 days");

            case 2 -> {
                if ((year % 4 == 0) && ((year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println(" 29 days");
                } else {
                    System.out.println(" 28 days");
                }
            }
                default ->  System.out.println(" enter invalid date");
            }


        }

    }

