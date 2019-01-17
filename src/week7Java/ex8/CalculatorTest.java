package week7Java.ex8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testCalculator() {
        String expected = "You can transport the celebrities";
        String actual = calculator.calculate(11, 11, 0);

        Assertions.assertEquals(expected, actual);
    }
}