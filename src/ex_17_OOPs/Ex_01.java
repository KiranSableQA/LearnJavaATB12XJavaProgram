package ex_17_OOPs;

public class Ex_01
{
 public static void main(String[] args)
 {
  Kiran kr =new Kiran();
  kr.Running();
  kr.Eating();
 }
}

 class Kiran
{
 String name;

 void Running ()
 {
  System.out.println("running");
 }

 void Eating ()
 {
  System.out.println("eating");
 }

}