package reDoingExUsingLWay.ex5Week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnValidatorTest {
    private LuhnValidator validator = new LuhnValidator();
    @Test
    void testIsValid() {
        String number = "378281";

        boolean result = validator.isValid(number);

        Assertions.assertTrue(result);
    }
    @Test
    void testIsInValid(){
        String number = "378282";

        boolean result = validator.isValid(number);

        Assertions.assertFalse(result);
    }
}