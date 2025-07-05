package Test21june;

public class Increment_Decrement_04 {

        public static void main(String[] args) {
            int i = 5;
            System.out.println("Original: " + i);

            int preInc = ++i;
            System.out.println("Pre-increment: " + i);

            int postInc = i++;
            System.out.println("Post-increment: " + i + " (returned " + postInc + ")");

            int preDec = --i;
            System.out.println("Pre-decrement: " + i);

            int postDec = i--;
            System.out.println("Post-decrement: " + i + " (returned " + postDec + ")");
        }
    }


