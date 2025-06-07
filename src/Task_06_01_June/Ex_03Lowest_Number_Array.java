package Task_06_01_June;

public class Ex_03Lowest_Number_Array {
    public static void main(String[] args) {
        int[] arr = {12,34,48,69,72,86,98};
        int lowest =34;
        for (int i : arr )
        {
            if (i < lowest) {
                lowest = i;

            }
        }
        System.out.println(lowest);
    }
}
