package week5Java.ex2;
import week5Java.ex1.Shape;
public class Triangle implements Shape {
    @Override
    public String getName() {
        return "triangle";
    }
    @Override
    public String toString() {
        return "Triangle";
    }
}
