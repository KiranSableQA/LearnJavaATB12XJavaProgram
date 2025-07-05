package Test04_05july;

public class MaxValueWrapper07 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 15};

        Integer max = numbers[0];

        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
    }
}
