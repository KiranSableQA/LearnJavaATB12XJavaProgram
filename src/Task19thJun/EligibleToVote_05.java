package Task19thJun;

import java.util.Scanner;

public class EligibleToVote_05
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a age");
        int age=sc.nextInt();

        if (age >= 18)
        {
            System.out.println("Eligible To Vote");
        }
        else
        {
            System.out.println("Not Eligible To Vote");
        }
        sc.close();
        }

    }

