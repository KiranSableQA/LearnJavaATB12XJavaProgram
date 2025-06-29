package ex_09_Switch;

public class Lab091_Interview {
    public static void main(String[] args) {
        long a11 = 30l;
        switch ((int) a11) {
            case 30:
                System.out.println(a11);
                break;
            default:
                System.out.println("Not matched");
        }
    }
}
