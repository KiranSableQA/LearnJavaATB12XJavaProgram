package Test22june;

public class Vehicle_06 {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    // Subclass Car
    static class car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car engine starts with a roar!");
        }
    }

    // Subclass Bike
    static class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike engine starts with a purr!");
        }
    }

    public static void main(String[] args) {

//        Vehicle car  = new  car();
//        Vehicle Bike  = new  Bike();
        // Polymorphic array
        Vehicle[] vehicles = {new car(), new Bike()};

        // Calling start() on each vehicle
        for (Vehicle v : vehicles) {
            v.start();
        }


    }
}


