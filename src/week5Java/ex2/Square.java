package week5Java.ex2;
import week5Java.ex1.Shape;
public class Square implements Shape {
    @Override
    public String getName() {
        return "square";
    }
    @Override
    public String toString() {
        return "Square";
    }
}
