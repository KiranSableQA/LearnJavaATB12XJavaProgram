package TaskMay25th;

import java.util.Scanner;

public class Ex_04_Prime_Number01 {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        no = sc.nextInt();
        if (no == 0 || no == 1) {
            System.out.println(no + " is not prime number");
        } else {
            int middleNo = no / 2;
            int flag = 0;  // Declare flag before loop

            for (int i = 2; i <= middleNo; i++) {
                if (no % i == 0) {
                    System.out.println(no + " is not prime number");
                    flag = 1;   // Set flag if divisor found
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(no + " is prime number");
            }
        }

        sc.close();
    }
}
