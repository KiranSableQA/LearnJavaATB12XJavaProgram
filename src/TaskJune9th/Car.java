package TaskJune9th;

public class Car
{
    String brand;
    String model;
    double price;

    public Car( String brand, String model, double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void DisplayCarDetails()
    {
        System.out.println("Brand" +   " " + brand );
        System.out.println("model" +   " " + model );
        System.out.println("price" +   " " + price );
    }

    public static void main(String[] args)
    {
        Car c1= new Car("TATA","Safari", 125812.50);
        Car c2= new Car("TESLA","V4", 825812.50);

        c1.DisplayCarDetails();
        c2.DisplayCarDetails();
    }

}
