package week5Java.ex1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CircleTest {
    @Test
    void testCircleName() {
        Circle circle = new Circle();
        Assertions.assertEquals("circle",circle.getName());
    }
    @Test
    void testCircleShape(){
        Shape circle = new Circle();
        Assertions.assertEquals("circle",circle.getName());
    }
}