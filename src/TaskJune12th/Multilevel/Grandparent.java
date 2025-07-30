package TaskJune12th.Multilevel;

public class Grandparent
{
    void grandparentMethod()
    {
        System.out.println("grandparentMethod");
    }


}
class Parent extends Grandparent
{
    void Parent()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    void Child()
    {
        System.out.println("Child");
    }
}
