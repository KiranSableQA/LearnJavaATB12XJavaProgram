package TaskMay31;

public class Ex_04_WordCount {
    public static void main(String[] args) {
        String input = "  Hello,   this is  a Java program!   ";

        // Remove leading/trailing spaces and replace multiple spaces with a single space
        String cleaned = input.trim().replaceAll("\\s+", " ");

        // Split by space and count
        int wordCount = cleaned.isEmpty() ? 0 : cleaned.split(" ").length;

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Number of Words: " + wordCount);
    }
}
