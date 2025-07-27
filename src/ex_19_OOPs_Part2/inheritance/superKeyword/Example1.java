package ex_19_OOPs_Part2.inheritance.superKeyword;

public class Example1
{
    public static void main(String[] args)
    {
        child ch = new child();
        ch.fe();
    }
}

class Mother {
    void eat() {
        System.out.println("daily eat");
    }

    void sleep() {
        System.out.println("daily sleep");
    }

    void taking() {
        System.out.println("daily taking");
    }
}
   class child extends Mother
    {

        void gigling ()
        {
            System.out.println("daily gigling");
        }

        void fe ()
        {
            super.eat();
            super.sleep();
            super.taking();
            this.gigling();
        }

    }

