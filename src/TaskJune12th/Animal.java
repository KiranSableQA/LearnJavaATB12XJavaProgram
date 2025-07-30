package TaskJune12th;

public class Animal
{
    public static void main(String[] args)
    {
        //create an animal object
        Animal animal = new Animal();
        animal.sound();

        //create a dog object
        Dog dg=new Dog();
        dg.sound();

        //polymorphism
        Animal animaldog = new Dog ();
        animaldog.sound();

    }

    public void  sound ()
    {
        System.out.println("Anamil make a sound");
    }

}

class Dog extends Animal
{
    @Override
    public void  sound ()
    {
        System.out.println("Dog barks");
    }
}


