package ex_19_OOPs_Part2.inheritance.poly.methodoverloading;

public class MathOperations
{
    int add (int a, int b)
    {
        return a+b;
    }

    int add (int a, int b,int c)
    {
        return a+b+c;
    }

    double add (double a, double b)
    {
        return a+b;
    }

    String add (String kiran)
    {
        return kiran;
    }

    String add (String kiran,int a)
    {
        return kiran + a;
    }

    String add(String a, String b) {
        return a + b;
    }




}
