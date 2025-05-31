package Task_04_25;

import java.util.Scanner;

public class Ex_04_Prime_Number02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        if(n<=1)
            System.out.println("Not a prime no");
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }if (count==2) {

                System.out.println("prime no");
            } else {
                System.out.println("not a prime no");
            }
        }

    }
}
