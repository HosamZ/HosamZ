package week3JAVA.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class NumberCorrectorTest {
    private NumberCorrector corrector = new NumberCorrector();
    @Test
    void correct() {
        Double number = 3.4;
        Double actual =  corrector.correct(number);
        Assertions.assertEquals(new Double(3),actual);
    }
}