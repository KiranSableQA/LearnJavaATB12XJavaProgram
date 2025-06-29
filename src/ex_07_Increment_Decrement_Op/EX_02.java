package ex_07_Increment_Decrement_Op;

public class EX_02 {
    public static void main(String[] args) {

        int i=10;
        System.out.println(++i + ++i);  //  11+12
        System.out.println(i++ + i++);  //  12+13
        System.out.println(++i + ++i);  //  15 + 16
        System.out.println(i++ + ++i);  //  16 + 18
        System.out.println(++i + i++);  //   19 + 19
        //  21 + 21 + 23 + 23 +25
        System.out.println(++i + i++ + ++i + i++ + ++i);
       //   5  + 27  + 28  + 28  +  30 + 31  + 31
        System.out.println(i++ + ++i + ++i + i++ + ++i + ++i + i++);
        int b=i;
        System.out.println(++i + i++);  // 33 + 33
    }
}
