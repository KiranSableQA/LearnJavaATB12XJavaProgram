package TaskJune9th;

public class Rectangle
{
    Double length;
    Double breadth;

    public Rectangle (Double length, Double breadth )
    {
        this.length=length;
        this.breadth=breadth;
    }
    //Method to calculate area
    public double calculateArea()
    {
        return length * breadth;
    }
    //Method to print area
    public void printArea()
    {
        System.out.println("Rectangle Area: " + calculateArea());
    }

    public static void main(String[] args)
    {
        Rectangle re = new Rectangle(8.6,10.2);
        re.printArea();
    }

}
