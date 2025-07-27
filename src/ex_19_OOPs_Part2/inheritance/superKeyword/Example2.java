package ex_19_OOPs_Part2.inheritance.superKeyword;

public class Example2
{
    public static void main(String[] args)
    {
        Cub cu = new Cub();
        cu.feture();
    }
}

class   lion
{
    void sleep ()
    {
        System.out.println("Sleep more than 18 to 20 hour");
    }

    void  eat ()
    {
        System.out.println("eat more than 2 KG");
    }
}

class Cub extends lion
{
   void  Spotted_Fur ()
   {
       System.out.println("cube is fully Spotted Fur");
   }
    void  Eyes_Closed_at_Birth ()
    {
        System.out.println("cube is fully Eyes Closed at Birth");
    }
    void  Fully_Dependent_on_Mother ()
    {
        System.out.println("cube is fully Fully Raised by the Pride");
    }
    void  Raised_by_the_Pride ()
    {

    }

    void feture ()
    {
        super.sleep();
        super.eat();
        this.Spotted_Fur();
        this.Eyes_Closed_at_Birth();
        this.Fully_Dependent_on_Mother();
        this.Fully_Dependent_on_Mother();

    }

}