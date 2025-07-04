package TaskMay19th;

import java.util.Scanner;

public class Ex07_Angales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get side lengths from user
        System.out.print("Enter length of side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter length of side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter length of side 3: ");
        int side3 = scanner.nextInt();

        // Check for valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Classify based on sides
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
