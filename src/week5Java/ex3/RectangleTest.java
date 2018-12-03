package week5Java.ex3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5Java.ex1.Shape;
class RectangleTest {
    @Test
    void testRectangleName(){
        Rectangle rectangle = new Rectangle();
        Assertions.assertEquals("triangle",rectangle.getName());
    }   @Test
    void testRectangleColor(){
        Rectangle rectangle = new Rectangle();
        Assertions.assertEquals("violet",rectangle.getColor());
    }   @Test
    void testRectangleShape(){
        Shape rectangle = new Rectangle();
        Assertions.assertEquals("triangle",rectangle.getName());
    }
    @Test
    void testRectangleColored(){
        Colored rectangle = new Rectangle();
        Assertions.assertEquals("violet",rectangle.getColor());
    }
}