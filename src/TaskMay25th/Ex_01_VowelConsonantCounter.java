package TaskMay25th;
import java.util.Scanner;
public class Ex_01_VowelConsonantCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Convert the string to lowercase for easier comparison
            input = input.toLowerCase();

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Check if it's a letter
                if (Character.isLetter(ch)) {
                    // Check if it's a vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            // Output result
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);

            scanner.close();
        }
    }


