package TaskMay31;

public class Ex_01_string_without_using_inbuilt_functions {

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = "";

        // Using a for loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
