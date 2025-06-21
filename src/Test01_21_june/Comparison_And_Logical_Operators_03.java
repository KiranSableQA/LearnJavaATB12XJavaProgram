package Test01_21_june;

public class Comparison_And_Logical_Operators_03 {

        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            System.out.println("a == b: " + (a == b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
            System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
            System.out.println("!(a > b): " + (!(a > b)));
        }
    }


