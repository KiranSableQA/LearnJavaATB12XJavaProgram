package ex_11_While;

public class Ex_01_Print_Even_value {
    public static void main(String[] args) {
        // Odd
//        int i = 1;
//        while (i <= 10)
//        {
//            System.out.println(i);
//            i += 2;
//        }
//
//        // Even
//        int a = 2;
//        while (a <= 10)
//        {
//            System.out.println(a);
//            a += 2;
//        }

        // Even
//        int c = 1;
//        while (c<=10)
//        {
//            if (c % 2 == 0)
//            {
//                System.out.println(c);
//            }
//            c++;
//        }

        // Even
        int B = 1;
        while (B<=10)
        {
            if (B % 2 == 0)
            {
                System.out.println("even" + B);
            }
            else {
            System.out.println("odd" + B);
        }
            B++;
        }
    }
}