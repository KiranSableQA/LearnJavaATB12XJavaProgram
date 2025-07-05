package Task_01;

public class Min_Between_The_3_no {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=25;

        System.out.println("min number is -> " + (a<(c>b?a:b)?c:(c>b?a:b)));
    }
}
