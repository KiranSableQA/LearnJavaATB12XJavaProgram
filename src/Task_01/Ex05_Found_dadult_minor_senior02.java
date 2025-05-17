package Task_01;

public class Ex05_Found_dadult_minor_senior02 {

    public static void main(String[] args) {

        int age=20;

        String result = age>21?"Adult": (age<20?"Minor": "Senior");
        System.out.println(result);


    }
}
