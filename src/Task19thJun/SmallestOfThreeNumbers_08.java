package Task19thJun;

import java.util.Scanner;

public class SmallestOfThreeNumbers_08
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st no");
        int num1=sc.nextInt();

        System.out.println("Enter 1st no");
        int num2=sc.nextInt();

        System.out.println("Enter 1st no");
        int num3=sc.nextInt();

        if (num1 <= num2 && num1 <= num3 )
        {
            System.out.println("The Smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3)
        {
            System.out.println("The Smallest number is: " + num2);
        } else
        {
            System.out.println("The Smallest number is: " + num3);
        }
        sc.close();
    }
}
