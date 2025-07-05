package Task12_7th_June_IfElse;

import java.util.Scanner;

public class NoPositiveOrNegative01 {
    public static void main(String[] args)
    {
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();

        if(no>0)
        {
            System.out.println("Given number is positive");
        }
        else
        {
            System.out.println("Given number is negative");
        }
        sc.close();

    }
}
