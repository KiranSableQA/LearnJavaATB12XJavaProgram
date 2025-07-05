package ex_10_For_Loop;

public class Ex_05_sum_of_first_10_natural_numbers {

    public static void main(String[] args) {
        int sum =0;

        for (int i=1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("Sum " + sum);

    }
}
