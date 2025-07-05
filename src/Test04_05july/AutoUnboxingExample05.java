package Test04_05july;

public class AutoUnboxingExample05 {
    public static void main(String[] args) {
        int value = 10;

        // Autoboxing: int to Integer
        Integer boxe = value;
        System.out.println("Autoboxed: " + boxe);

        // Unboxing: Integer to int
        int unbox = boxe;
        System.out.println("Unboxed: " + unbox);
    }
}
