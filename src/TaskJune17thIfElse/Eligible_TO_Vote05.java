package TaskJune17thIfElse;

import java.util.Scanner;

public class Eligible_TO_Vote05
{
    public static void main(String[] args)
    {
        Scanner    sc = new Scanner(System.in);

        int age= sc.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible TO Vote");
        }
        else
        {
            System.out.println("Not Eligible TO Vote");
        }
        sc.close();
    }
}
