package Task19thJun;

import java.util.Scanner;

public class PositiveNegative01
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");

        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("The number is positive.");
        }
        else if (num < 0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
