package Test22june;

public class multiple_interface_implementation_10 {
    // Flyable interface
    interface Flyable {
        void fly();
    }
    // Swimmable interface
    interface Swimmable {
        void swim();
    }
    // Duck implements both interfaces
    static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("Duck is flying in the sky!");
        }
        @Override
        public void swim() {
            System.out.println("Duck is swimming in the water!");
        }
    }
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
