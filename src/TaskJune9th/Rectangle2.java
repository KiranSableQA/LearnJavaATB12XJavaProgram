package TaskJune9th;

public class Rectangle2
{
    Integer length;
    Integer breadth;

    public Rectangle2 (Integer length, Integer breadth )
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
        Rectangle2 re = new Rectangle2 (8,10);
        re.printArea();
    }

}
