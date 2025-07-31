package Task19thJun;

import java.util.Scanner;

public class EvenorOdd_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no");
        int num= sc.nextInt();

        if (num%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
