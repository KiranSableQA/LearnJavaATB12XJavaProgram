package ex_12_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {

        int a = 10;
        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;
        } while (a < 0);
    }
}
