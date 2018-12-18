package week7Java.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSplitterTest {
    private NumberSplitter splitter = new NumberSplitter();
    @Test
    void testNumber() {
        Integer number = 1323;

        List<Integer> actual = splitter.number(number);

        List<Integer> expectedAnswer = Arrays.asList(1,3,2,3);
        Assertions.assertEquals(expectedAnswer,actual);
    }
}