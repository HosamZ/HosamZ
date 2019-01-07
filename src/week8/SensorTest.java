package week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    private Sensor sensor = new Sensor();
    @Test
    void testAmpersandSymbol() {
        String word = "1&2&3";

        Optional<String> decrypt = sensor.decrypt(word);

        Assertions.assertEquals("321",decrypt.get());
    }
    @Test
    void testExclamationMarkSymbol(){
        String word = "1!2!3!";

        Optional<String> decrypt = sensor.decrypt(word);

        Assertions.assertEquals("123",decrypt.get());
    }
    @Test
    void testHashSymbol(){
        String word = "r#o#b#o#m#i#m#e#rr";

        Optional<String> decrypt = sensor.decrypt(word);

        Assertions.assertEquals("rr",decrypt.get());
    }
    @Test
    void testEmptyCase(){
        String word = "";

        Optional<String> decrypt = sensor.decrypt(word);

        Assertions.assertEquals(Optional.empty(),decrypt);
    }

}