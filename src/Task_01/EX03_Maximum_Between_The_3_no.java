package Task_01;

public class EX03_Maximum_Between_The_3_no {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=2;

        System.out.println("max number is -> " + (c>(a>b?a:b)?c:(a>b?a:b)));

        System.out.println("min number is -> " + (c<(a>b?a:b)?c:(a>b?a:b)));


    }
}
