package week7Java.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class testBiggestOrSmallest {

    @Test
    void testIsSmallest() {
        List<Integer> numbers = Arrays.asList(1,3,5,6);

        Integer smallestNumber = numbers.size()-1;

        int expected = 6;
//        Assertions.assertEquals(1,smallestNumber);
    }

    @Test
    void testIsBiggest() {
        List<Integer> numbers = Arrays.asList(1,3,5,6);




    }
}