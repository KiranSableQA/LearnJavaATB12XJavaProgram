package Task19thJun;

import java.util.Scanner;

public class FindTheSmallestOfTwoNumbers_07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no");
        int num1=sc.nextInt();

        System.out.println("Enter 1st no");
        int num2=sc.nextInt();

        if (num1 < num2)
        {
            System.out.println("Maximum is: " + num1);
        }
        else if (num2 < num1)
        {
            System.out.println("Maximum is: " + num2);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
        sc.close();

    }
}
