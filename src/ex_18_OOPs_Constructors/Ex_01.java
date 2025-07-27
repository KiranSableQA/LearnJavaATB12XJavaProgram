package ex_18_OOPs_Constructors;

public class Ex_01
{
    public static void main(String[] args)
    {
        book bk =new book();
        new book();

    }
}

class book
{
    String name;

    book()
    {
//        this called automatically when object is created.

        System.out.println(" i am called, object called");

    }
}