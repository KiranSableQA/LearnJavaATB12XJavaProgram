package Test03_28_june;

public class StringManipulationBasics {
    public static void main(String[] args) {
        // Input String
        String input = "Hello World";

        // 1. Length
        int length = input.length();

        // 2. First Character
        char firstChar = input.charAt(0);

        // 3. Extract Substring (e.g., "World")
        String sub = input.substring(6);  // or input.substring(6, 11);

        // Output
        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + sub);
    }
}
