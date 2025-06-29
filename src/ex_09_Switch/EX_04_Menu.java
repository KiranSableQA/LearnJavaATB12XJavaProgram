package ex_09_Switch;

import java.util.Scanner;

public class EX_04_Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose an option (1-5): ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1: System.out.println("vada"); break;
            case 2: System.out.println("samosa"); break;
            case 3: System.out.println("jamun"); break;
            case 4: System.out.println("bread"); break;
            case 5: System.out.println("kulcha"); break;
            default:
                System.out.println("this item is not available right now");
        }
        sc.close();
    }
}
