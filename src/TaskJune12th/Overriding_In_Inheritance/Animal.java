package TaskJune12th.Overriding_In_Inheritance;

public class Animal
{
    //Method to be overridden
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}

//Child class inheriting from Animal
class Dog extends Animal{
    //Overriding the makeSound method
    @Override
    public void makeSound(){
        System.out.println("The dog barks: woof!");
    }
}

class Cat extends Animal{
    //Overriding the makeSound method
    @Override
    public void makeSound(){
        System.out.println("The cat meows: Meow!");
    }
}
