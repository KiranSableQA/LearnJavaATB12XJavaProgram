package ex_19_OOPs_Part2.inheritance.poly.methodoverloading;

public class Lab174_MOloading
{
    public static void main(String[] args)
    {
        MathOperations m1 = new MathOperations();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);


        double r2 = m1.add(3.34,4.56);
        System.out.println(r2);

        String r3 = new String ("kiran");
        System.out.println(r3);

        String r4 = m1.add("kiran", 100);
        System.out.println(r4);

        String r5 = m1.add("Hello ", "World!");
        System.out.println(r5);


    }
}
