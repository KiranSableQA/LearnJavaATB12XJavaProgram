package ex_09_Switch;

import java.util.Scanner;

public class EX_03_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        double b= scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);



        switch (op)
        {
            case '+':
                System.out.println("Addition" + (a+b));  break;
            case '-':
                System.out.println("Substration" + (a+b));  break;
            case '*':
                System.out.println("Multiplication" + (a+b));   break;
            case '/':
                if(b!=0) {
                    System.out.println("Result" + (a / b));
                }
                else  System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operator");

        }
        scanner.close();
    }

}
