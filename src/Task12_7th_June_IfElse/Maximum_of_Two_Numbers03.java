package Task12_7th_June_IfElse;

import java.util.Scanner;

public class Maximum_of_Two_Numbers03
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");

        System.out.println("enter no 1");
        int n1= sc.nextInt();

        System.out.println("enter no 2");
        int n2= sc.nextInt();


        if(n1>n2)
        {
            System.out.println("n1 is maxx");
        }
        else
        {
            System.out.println("n2 is maxx");
        }
        sc.close();
    }

}
