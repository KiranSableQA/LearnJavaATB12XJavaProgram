package ex_13_Functions;

public class Ex_01 {

    public static void main(String[] args)
    {
        greet_with_details("Pramod", 65, 100);
    }


//    3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);
    }
}
