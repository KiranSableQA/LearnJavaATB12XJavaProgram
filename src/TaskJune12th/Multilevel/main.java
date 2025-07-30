package TaskJune12th.Multilevel;

public class main
{
    public static void main(String[] args)
    {


        Parent myParent = new Parent();
        Child myChild = new Child();

        myChild.Parent();
        myChild.grandparentMethod();
        myChild.Child();
    }
}
