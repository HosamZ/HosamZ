package week5Java.ex2;
import week5Java.ex1.Circle;
import week5Java.ex1.Shape;
import java.util.Arrays;
import java.util.List;
public class BasicShapesApplication {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());
        Shape square = new Square();
        System.out.println("Shape: " + square.getName());
        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());
        List<Shape> shapes = Arrays.asList(circle, square, triangle);
        System.out.println("Shapes: " + shapes);
        for (Shape shape : shapes) {
            shape.getName();
            System.out.println("Shape name: " + shape.getName());
        }
    }
}
