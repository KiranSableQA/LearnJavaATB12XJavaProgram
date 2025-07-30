package TaskJune9th;

public class Student
{
    String name;
    Integer age;


    public  Student (String name, Integer age )
    {
        this.name=name;
        this.age=age;

    }
public void display ()
{
    System.out.println("Name" + " " + name);
    System.out.println("age" + " " +age);
}

    public static void main(String[] args) {
        Student s = new Student("Kiran", 31);
        s.display();
    }
    }