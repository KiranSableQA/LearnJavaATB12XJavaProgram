package Task20_25th_Jun_Constructor;

public class ConstructorOverloadingExample03
{
    int number;
    String text;

    // Default constructor
    ConstructorOverloadingExample03() {
        number = 0;
        text = "Default";
    }

    // Parameterized constructor with 1 parameter
    ConstructorOverloadingExample03(int number) {
        this.number = number;
        text = "Single param";
    }

    // Parameterized constructor with 2 parameters
    ConstructorOverloadingExample03(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample03 obj1 = new ConstructorOverloadingExample03();
        ConstructorOverloadingExample03 obj2 = new ConstructorOverloadingExample03(10);
        ConstructorOverloadingExample03 obj3 = new ConstructorOverloadingExample03(20, "Two Params");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
