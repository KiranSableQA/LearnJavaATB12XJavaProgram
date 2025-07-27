package ex_19_OOPs_Part2.inheritance.superKeyword;

class Animal
{
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);  // Access parent variable
    }
}

public class Example3
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printType();
    }
}
