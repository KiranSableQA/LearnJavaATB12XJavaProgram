package ex_06_Ternary_Operator;

public class EX_06 {
    public static void main(String[] args) {

        int n1=12;
        int n2=10;
        int n3=-11;

        int result =(n1>n2)? (n1>n3) ? n1:n3: ((n2>n3)?n2:n3);
        System.out.println("Max no" + " " + result);


    }
}
