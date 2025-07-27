package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel
{
    public static void main(String[] args)
    {
        /*
        Son Krn = new Son();
        Krn.home();
        Krn.gf();
        Krn.home2();
        Krn.land();
        Krn.bhk3();
*/

/*
        Father Pat = new Father();
        Pat.home();
        Pat.gf();
        Pat.home2();
        Pat.land();
  */

/*
        GrandFather Ann = new GrandFather();
        Son s1 = new Son();
        s1.home();
        s1.gf();
        s1.home2();
        s1.land();
        s1.bhk3();
*/

 /*
        Father f1 = new Son(); // Dynamic Dispatch.
        f1.home();
        f1.gf();
        f1.home2();
        f1.land();
*/
        GrandFather gf1 = new Son();
        gf1.home();
        gf1.gf();

        GrandFather gf2 = new Father();
        gf2.home();
        gf2.gf();

    }
}