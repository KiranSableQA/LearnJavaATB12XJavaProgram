package TaskMay25th;

import java.util.Scanner;

public class Ex_06_Factorials01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int Factorials=1;

        for (int i=1; i<=n;i++)
        {
            Factorials *= i;
        }
        System.out.println(Factorials);

    }
}
