package Task_03_24;

import java.util.Scanner;
public class Ex_01_Grade_01usingString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade");

        String grade = scanner.next().toUpperCase();

        switch  (grade) {
            case "A" :
                System.out.println("Excellent");
                break;
            case "B" :
                System.out.println("Very Good");
                break;
            case "C" :
                System.out.println("Good");
                break;
            case "D" :
                System.out.println("Need Improvement");
                break;

            case "F" :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invaild Grade");
        }



    }
}
