package TaskJune12th.Constructor;

 class Animal
{
//    public static void main(String[] args)
//    {
//        Dog dg=new Dog();
//        dg.eat();
//    }


    Animal()
    {
        System.out.println("Animal class constructor");
    }
}

class Dog extends Animal
{
    void eat()
     {
         System.out.println("dog going to eat");
     }
}

