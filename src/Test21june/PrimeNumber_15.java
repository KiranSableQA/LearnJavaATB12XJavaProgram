package Test21june;

public class PrimeNumber_15 {
        public static void main(String[] args) {
            System.out.print("Prime numbers between 1 and 100: ");

            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;

                // Check divisibility up to √i for efficiency
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }


