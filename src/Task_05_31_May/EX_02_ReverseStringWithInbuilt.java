package Task_05_31_May;

public class EX_02_ReverseStringWithInbuilt {
    public static void main(String[] args) {

        String original = " Hello, World";

        // Using inbuilt reverse() method of StringBuffer
        StringBuffer buffer = new StringBuffer();

        String rev=buffer.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + rev);

    }
}
