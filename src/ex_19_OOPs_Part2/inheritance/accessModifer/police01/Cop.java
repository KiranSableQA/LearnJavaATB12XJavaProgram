package ex_19_OOPs_Part2.inheritance.accessModifer.police01;

public class Cop
{
    private int gun;
    String iCard;

    public  Cop(int gun)
    {
        this.gun = gun;
//        this.iCard = "Kiran";

    }
    private  void canIShoot()
    {
        System.out.println("Yes You can shoot!");
    }

    protected boolean enquiry ()
    {
        return true;
    }

    public boolean identy ()
    {

        return true;
    }

}
