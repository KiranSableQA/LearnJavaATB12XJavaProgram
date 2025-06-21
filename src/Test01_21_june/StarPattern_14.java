package Test01_21_june;

public class StarPattern_14 {
        public static void main(String[] args) {
            int n = 4;

            // Right Triangle
            System.out.println("Right Triangle:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Pyramid
            System.out.println("\nPyramid:");
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


