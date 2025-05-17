package Task_01;

public class Ex05_Senior_01 {
    public static void main(String[] args) {

        int age=68;

        String result = age>65?"Senior": (age<18?"Minor": "Adult");
        System.out.println(result);



    }
}
