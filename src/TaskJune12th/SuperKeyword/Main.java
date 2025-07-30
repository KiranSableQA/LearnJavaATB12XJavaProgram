package TaskJune12th.SuperKeyword;

public class Main
{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();  // calls child method, which also calls parent method using super
    }
}
