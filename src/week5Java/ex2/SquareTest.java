package week5Java.ex2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week5Java.ex1.Shape;
class SquareTest {
    @Test
    void testSquareName(){
        Square square = new Square();
        Assertions.assertEquals("square",square.getName());
    }
    @Test
    void testSquareShape(){
        Shape square = new Square();
        Assertions.assertEquals("square",square.getName());
    }
}