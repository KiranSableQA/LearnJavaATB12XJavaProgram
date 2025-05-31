package Task_04_25;

import java.util.Scanner;

public class Ex_03_PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a String ");

        String st= sc.next();
        String revStr ="";

        for (int i=st.length()-1;i>=0;i--)
        {
            char ch=st.charAt(i);
            revStr = revStr+String.valueOf(ch);
        }
        if(st.equals(revStr))
            System.out.println("String is palindrome");
        else System.out.println("String in not a palindrome");
    }

}
