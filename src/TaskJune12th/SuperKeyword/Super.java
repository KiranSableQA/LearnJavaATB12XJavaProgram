package TaskJune12th.SuperKeyword;

public class Super
{
    void display()
    {
        System.out.println("This is the Parent class method.");
    }
}

// Child class
class Child extends Super {
    void display()
    {
        super.display();  // calling parent class method
        System.out.println("This is the Child class method.");
    }
}

