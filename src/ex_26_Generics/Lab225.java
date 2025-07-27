package ex_26_Generics;

public class Lab225 {
    public static void main(String[] args) {
        temp(3, 4);
        temp(3.34, 4.45);
        temp("pramod", "dutta");
    }

    static <T> T temp(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);

        System.out.println(a + " " + b);

        return null;
    }



}
