package Test04_05july;

    public class InvalidAgeException_01 extends Exception {
        public InvalidAgeException_01(String message) {
            super(message);
        }
    }

    // Main class
    class AgeChecker {
        public static void checkAge(int age) throws InvalidAgeException_01 {
            if (age < 18) {
                throw new InvalidAgeException_01("Age must be 18 or older");
            } else {
                System.out.println("Valid age: " + age);
            }
        }

        public static void main(String[] args) {
            int age = 15;

            try {
                checkAge(age);
            } catch (InvalidAgeException_01 e) {
                System.out.println("InvalidAgeException: " + e.getMessage());
            }
        }
    }

