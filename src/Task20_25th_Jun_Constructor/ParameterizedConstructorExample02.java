package Task20_25th_Jun_Constructor;

public class ParameterizedConstructorExample02
{
    int age;
    String name;

    // Parameterized constructor
    ParameterizedConstructorExample02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample02 person = new ParameterizedConstructorExample02("Alice", 25);
        person.display();
    }
}
