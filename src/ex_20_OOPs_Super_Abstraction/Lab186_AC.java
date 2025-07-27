package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC
{
    public static void main(String[] args)
    {
        RR car  = new RR();
        car.driver();
    }
}

























 class RR extends Engine
 {

     void driver ()
     {
         StartEngine();
         stopEngine();
     }

     @Override
     void StartEngine()
     {
         System.out.println("Starting RR");
     }
 }
 abstract class Engine
 {
     abstract void StartEngine();

     void stopEngine()
     {
         System.out.println("Stop");
     }





 }