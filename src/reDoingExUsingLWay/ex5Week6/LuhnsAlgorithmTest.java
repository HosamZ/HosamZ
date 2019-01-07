package reDoingExUsingLWay.ex5Week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnsAlgorithmTest {
    private LuhnsAlgorithm algorithm = new LuhnsAlgorithm();

    @Test
    void testCalculate() {
        String number = "378281";

        int checkSum = algorithm.calculate(number);

        Assertions.assertEquals(30,checkSum);
    }
}