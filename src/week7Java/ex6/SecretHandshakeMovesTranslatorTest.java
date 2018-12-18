package week7Java.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecretHandshakeMovesTranslatorTest {
    private SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();

    @Test
    void testTranslatePriceIntoMove(){
        Integer number=2569;

        List<String> testSubject = translator.translatePriceIntoMove(number);

        List<String> expectedAnswer = Arrays.asList("thumb touches back", "tickles over palm",
                "bro knock", "thousand knuckles");
        Assertions.assertEquals(expectedAnswer,testSubject);

    }
    @Test
    void testWrongTranslatePriceIntoMove(){
        Integer number=0010;

        List<String> testSubject = translator.translatePriceIntoMove(number);

        List<String> expectedAnswer = Arrays.asList("");
        Assertions.assertNotEquals(expectedAnswer,testSubject);

    }
}