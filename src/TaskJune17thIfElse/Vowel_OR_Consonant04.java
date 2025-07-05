package TaskJune17thIfElse;

import java.util.Scanner;

public class Vowel_OR_Consonant04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Not a valid alphabet");
        }
        scanner.close();
    }
}
