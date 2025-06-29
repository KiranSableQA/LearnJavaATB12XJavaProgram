package ex_09_Switch;

import java.util.Scanner;

public class Ex_05_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a single letter: ");

        char ch=Character.toLowerCase(sc.next().charAt(0));

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println("It is a consonant");
                } else {
                    System.out.println("It is not a letter");
                }
        }

        sc.close();
    }
    }

