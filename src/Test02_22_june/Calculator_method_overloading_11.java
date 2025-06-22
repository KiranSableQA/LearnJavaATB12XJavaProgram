package Test02_22_june;

public class Calculator_method_overloading_11
{
    static class Calculator {
        // Method 1: Add two integers
        int add(int a, int b) {
            return a + b;
        }
        // Method 2: Add two doubles
        double add(double a, double b) {
            return a + b;
        }
        // Method 3: Add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Calling overloaded methods
        System.out.println("Integer addition: " + calc.add(5, 3));
        System.out.println("Double addition: " + calc.add(2.5, 3.7));
        System.out.println("Three integers addition: " + calc.add(1, 2, 3));
    }

}
