package Task_03_24;

import java.util.Scanner;

public class Ex_03_Factorial_Of_n {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int factorial=1;
        if(n<0){
            System.out.println("Factorial of -n is not possible");
        }
        else{
            for (int i = 1; i <=n ; i++) {
                factorial = factorial *i;
            }
            System.out.println("Factorial of "+ n+ " is " +factorial);
        }
    }
}
