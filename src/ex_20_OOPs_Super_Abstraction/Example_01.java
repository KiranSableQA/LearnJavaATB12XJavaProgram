package ex_20_OOPs_Super_Abstraction;

public class Example_01
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.drive();
    }
}





interface  Dog
{
    void Bark();
    void Loyal();
}

interface Cat
{
    void Meow();
    void Retractable();

    default void animal ()
    {
        System.out.println("DOG & CAT");
    }

}

class Animal implements Dog,Cat
{

    @Override
    public void Meow()
    {
        System.out.println("Cat Sounds Meow");
    }

    @Override
    public void Retractable()
    {
        System.out.println("Cat Claws Retractable");
    }

    @Override
    public void Bark()
    {
        System.out.println("Dog Sounds Bark");
    }

    @Override
    public void Loyal()
    {
        System.out.println("Dog are loyal");
    }
    void drive()
    {
        Bark();
        Loyal();
        Retractable();
        Meow();

    }
}
