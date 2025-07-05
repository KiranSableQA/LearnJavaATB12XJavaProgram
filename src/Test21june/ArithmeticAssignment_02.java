package Test21june;

public class ArithmeticAssignment_02 {

        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            // Arithmetic operations
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));

            // Assignment operations
            int x = a; // x = 10
            x += b;
            System.out.println("After x += b: " + x); // 15

            x = a;
            x -= b;
            System.out.println("After x -= b: " + x); // 5

            x = a;
            x *= b;
            System.out.println("After x *= b: " + x); // 50

            x = a;
            x /= b;
            System.out.println("After x /= b: " + x); // 2
        }
    }




