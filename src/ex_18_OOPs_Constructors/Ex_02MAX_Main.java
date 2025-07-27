package ex_18_OOPs_Constructors;

public class Ex_02MAX_Main
{
    public static void main(String[] args)
    {
        Ex_02MAX mx=new Ex_02MAX();
//        Set the value
//        mx.QTY =100;
//        mx.UpperBody = "full shert";
//        mx.LowwerBody = "night dress";

        System.out.println(mx.LowwerBody);
        System.out.println(mx.UpperBody);
        System.out.println(mx.QTY);
        System.out.println(mx.Size);

        Ex_02MAX mx1=new Ex_02MAX();
        mx.UpperBody = "Roundnick";
        System.out.println(mx1.UpperBody);
        System.out.println(mx1.QTY);
        System.out.println(mx1.Size);
        System.out.println(mx1.Price);

    }
}
