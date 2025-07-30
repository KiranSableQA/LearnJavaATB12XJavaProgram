package TaskJune9th;

public class Mobile
{
     String brand;
     double price;

    // Constructor 1: Only brand
    public Mobile(String brand)
    {
        this.brand = brand;
    }

    // Constructor 2: Brand and price
    public Mobile(double price, String brand)
    {
        this.price = price;
        this.brand = brand;
    }


    public void displayDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }


    public static void main(String[] args)
    {
        Mobile mb1=new Mobile("Samsung");
        Mobile mb2=new Mobile(17854.5, "Samsung");

        mb1.displayDetails();
        mb2.displayDetails();
    }

}
