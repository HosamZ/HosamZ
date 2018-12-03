package week5Java.ex2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5Java.ex1.Shape;

import static org.junit.jupiter.api.Assertions.*;
class TriangleTest {
    @Test
    void testTriangleName() {
        Triangle triangle = new Triangle();
        Assertions.assertEquals("triangle",triangle.getName());
    }
    @Test
    void testTriangleShape() {
        Shape triangle = new Triangle();
        Assertions.assertEquals("triangle",triangle.getName());
    }
}