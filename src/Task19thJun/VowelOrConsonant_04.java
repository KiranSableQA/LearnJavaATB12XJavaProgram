package Task19thJun;

import java.util.Scanner;

public class VowelOrConsonant_04
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        // Ask user to enter a character
        System.out.print("Enter a single alphabet: ");
        char ch = Sc.next().charAt(0);

        // Convert to lowercase to handle both cases
        ch = Character.toLowerCase(ch);

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        Sc.close();
    }
    }

