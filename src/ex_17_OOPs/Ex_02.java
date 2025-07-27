package ex_17_OOPs;

public class Ex_02
{
    public static void main(String[] args)
    {
        Family fam1 = new Family();
        fam1.name="Sable";
        fam1.father();
        fam1.mother();
        fam1.son();
        fam1.Wife();

    }
}
class Family
{
    String name;

    void father ()
    {
        System.out.println("have father");
    }

    void mother ()
    {
        System.out.println("have a mother");
    }

    void son ()
    {
        System.out.println("have son");
    }

    void Wife ()
    {
        System.out.println("have a wife");
    }
}
