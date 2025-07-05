package TaskMay31;

public class Ex_03_ReverseStringRecursive {
    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str; // Base case
        }

        // Recursive case: last char + reverse of substring
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}


