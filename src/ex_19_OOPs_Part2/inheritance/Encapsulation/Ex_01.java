package ex_19_OOPs_Part2.inheritance.Encapsulation;

public class Ex_01
{
    public static void main(String[] args)
    {
        StockMarket nik = new StockMarket(1000, "nik");
        System.out.println(nik.getHolding());
        boolean kiran = true;
        nik.setHolding(5000,kiran);
        System.out.println(nik.getHolding());
        System.out.println(nik.getName());

    }

}

class StockMarket
{
private String name;
private long holding;
public String broker="Zerodha";
    public StockMarket(long holding, String name) {
        this.holding = holding;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHolding() {
        return holding;
    }

    public void setHolding(long holding, boolean kiran)
    {
        if (kiran)
        {
            this.holding = holding;
        }
        else
        {
            System.out.println("not allowed to set holding");
        }
    }
}
