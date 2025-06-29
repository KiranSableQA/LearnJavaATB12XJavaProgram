package ex_06_Ternary_Operator;

public class EX_05 {
    public static void main(String[] args) {
      int  a = 5, b = 3, c = 7;

      int result =(a < b) ? (a < c ? a : c) : (b < c ? b : c);

        System.out.println(result);



    }
}
