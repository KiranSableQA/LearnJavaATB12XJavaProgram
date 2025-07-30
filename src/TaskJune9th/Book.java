package TaskJune9th;

public class Book
{
    String title;
    String author;
    Double price;

    public Book(String author, String title, Double price)
    {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void Display()
    {
        System.out.println("Book details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
    {
        Book book =new Book("Kiran Sable", "The Lion King", 480.5);
        book.Display();
    }



}
