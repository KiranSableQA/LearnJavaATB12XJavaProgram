package Test03_28_june;

public class StringComparisonDemo {
    public static void main(String[] args) {
        // Input strings
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // 1. Using == (reference comparison)
        boolean isSameReference = (string1 == string3);
        // 2. Using equals() (case-sensitive content comparison)
        boolean equalsResult = string1.equals(string2); // false

        // 3. Using equalsIgnoreCase() (case-insensitive content comparison)
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);

        // 4. Using compareTo() (lexicographical comparison)
        int compareToResult = string1.compareTo(string2);

        // Output
        System.out.println("== operator (string1 == string3): " + isSameReference);
        System.out.println("equals(): " + equalsResult);
        System.out.println("equalsIgnoreCase(): " + equalsIgnoreCaseResult);
        System.out.println("compareTo(): " + compareToResult);
    }
}
