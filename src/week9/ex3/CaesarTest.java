package week9.ex3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CaesarTest {
    private Caesar caesar = new Caesar();
    @Test
    void testUppercaseLettersCase(){
        String result = caesar.cipher("HELLO", 1);
        String expected = "IFMMP";
        
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testLowercaseLettersCase(){
        String result = caesar.cipher("hello, world", 13);
        String expected = "uryyb, jbeyq";
        
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testLongSentence() {
        String message = "be sure to drink your Ovaltine";
        
        String encryptedMessage = caesar.cipher(message, 13);
        String expected = "or fher gb qevax lbhe Binygvar";
        
        Assertions.assertEquals(expected, encryptedMessage);
    }
}

