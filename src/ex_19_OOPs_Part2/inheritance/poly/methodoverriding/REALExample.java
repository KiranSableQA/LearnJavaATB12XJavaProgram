package ex_19_OOPs_Part2.inheritance.poly.methodoverriding;

public class REALExample
{
    public static void main(String[] args)
    {
//        CommonToAllTC c= new CommonToAllTC ();
//        c.openBrowser();
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();
    }
}

class CommonToAllTC
{
    void openBrowser()
    {
        System.out.println("Open the browser!");
    }
}

class TC_Chrome extends CommonToAllTC
{
    @Override
    void openBrowser()
    {
        System.out.println("Starting a chrome");
        //new ChromeDriver();
    }
}

