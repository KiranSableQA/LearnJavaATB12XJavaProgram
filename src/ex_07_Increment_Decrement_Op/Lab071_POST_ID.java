package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {

//        int a = 10;
//        System.out.println(++a);
//        System.out.println(a);

        // POST increment  = Print first and then increase
//        int a_post = 10;
//        int b = a_post++;
//        System.out.println(a_post);
//        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 11  |  10 | NA
        // 12  |  11  | 10
        // 13  |  11  | NA
        // 14  |  NA  | 10


//        int d_post = 10;
//        System.out.println(d_post++);
//        System.out.println(d_post);

        int x_post =12;

        System.out.println(x_post++);  // 12
        System.out.println(x_post); // 13
        System.out.println(x_post++); // 13
        System.out.println(x_post);// 14



    }
}
