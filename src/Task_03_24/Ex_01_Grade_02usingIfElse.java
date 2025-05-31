package Task_03_24;

import java.util.Scanner;

public class Ex_01_Grade_02usingIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade");

        int num= scanner.nextInt();

        if(num>=90 && num<=100 )
        {
            System.out.println("Excellent");
        }
        else if (num>=80 && num<=89 )
        {
            System.out.println("Very good");
            
        }
        else if (num>=70 && num<=79 )
        {
            System.out.println("Good");

        }
        else if (num>=60 && num<=69 )
        {
            System.out.println("need improvement");

        }
        else
            System.out.println("Fail");


    }
}
