package TaskMay25th;
import java.util.Scanner;
public class Ex_05_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // First two terms
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            // Calculate next number
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}



