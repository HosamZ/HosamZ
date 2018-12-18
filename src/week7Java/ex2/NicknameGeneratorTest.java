package week7Java.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class NicknameGeneratorTest {
    private NicknameGenerator generator = new NicknameGenerator();

    @Test
    void testSplit() {
        String word = "hallo";

        Optional<String> nickname = generator.generate(word);

        String expected = "ha";
        Assertions.assertEquals(expected, nickname.get());
    }

    @Test
    void testEmptyString() {
        String word = "";

        Optional<String> test = generator.generate(word);

        Assertions.assertFalse(test.isPresent());

    }

    @Test
    void testOneLetter() {
        String word = "h";

        Optional<String> test = generator.generate(word);

        Assertions.assertEquals("h", test.get());
    }
}