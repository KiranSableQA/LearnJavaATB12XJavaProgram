package Task12_7th_June_IfElse;

import java.util.Scanner;

public class OddOrEven02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
    sc.close();
    }
}
