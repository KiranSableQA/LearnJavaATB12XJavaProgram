package ex_19_OOPs_Part2.inheritance.superKeyword;

public class Lab181
{
    public static void main(String[] args)
    {
        Son s=new Son();
        s.newHome();
    }
}
class Father
{
    Father()
    {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home()
    {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son()
    {
        super();
    }
    void car()
    {
        System.out.println("riding bike");
    }

    void bike()
    {
        System.out.println("riding Car");
    }

    void newHome()
    {
        super.home();
        System.out.println(super.gold);
        this.bike();
        this.car();
    }


}