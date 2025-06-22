package Test02_22_june;

public class Animal_05 {

        // Parent class
        static class Animal {
            void Sound() {
                System.out.println("Animal makes a sound");
            }
        }

        // Subclass Dog
        static class Dog extends Animal {
            @Override
            void Sound() {
                System.out.println("Dog say: Woof Woof");
            }
        }

        // Subclass Cat
        static class Cat extends Animal {
            @Override
            void Sound() {
                System.out.println("Cat say: Meow Meow");
            }
        }

        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();

            dog.Sound();
            cat.Sound();
        }
    }


