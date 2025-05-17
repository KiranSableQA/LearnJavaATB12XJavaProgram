package Task_01;

public class Ex05_Found_Minor_03
{
    public static void main(String[] args) {
        int age=45;
        String result=age>18?"minor":(age<45?"adult":"senior");
        System.out.println(result);
    }
}
