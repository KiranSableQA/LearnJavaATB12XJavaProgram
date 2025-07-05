package Test22june;

public class Drawable_Interface_Implementation_09 {
    // Interface
    interface Drawable {
        void draw();
    }

    // Circle implements Drawable
    static class Circle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Rectangle implements Drawable
    static class Rectangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    public static void main(String[] args) {
        Drawable c = new Circle();
        Drawable r = new Rectangle();

        c.draw();
        r.draw();
    }
}
