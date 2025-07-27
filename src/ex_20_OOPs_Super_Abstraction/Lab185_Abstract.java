package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract
{
    public static void main(String[] args)
    {
        son s1 = new son();
        s1.loan50k();
//        father f1 = new father();
    }
}

class normal
{

}

abstract class father
{
    abstract void loan50k();
}

class son extends father
{
    @Override
    void loan50k()
    {
        System.out.println("Loan Given !!");
    }
}