package ex_20_OOPs_Super_Abstraction;

public class Lab191
{
    public static void main(String[] args)
    {
        Kiran d = new Patil(); // Dynamic Dispatch will Interface
        Patil d1 = new Patil(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}

class Patil implements Kiran
{
    @Override
    public void display()
    {
        System.out.println(a);
    }
}
interface Kiran
{
    int a = 10;
    void display();
}

