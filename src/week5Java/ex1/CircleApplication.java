package week5Java.ex1;

public class CircleApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Class: "+circle.getName());
        Shape shape = circle;
        System.out.println("Shape: "+shape.getName());
        Shape anotherCircle = new Circle();
        System.out.println("Another shape: "+anotherCircle.getName());
    }
}
