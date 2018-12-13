package week6JAVA.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreedyAlgorithmTest {
    private GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

    @Test
    void testExactAmount() {
        Integer amount = 0;
        List<Money> change = greedyAlgorithm.change(amount);
        Assertions.assertTrue(change.isEmpty());


    }

    @Test
    void testOneOfEach() {
        Integer amount = 88;
        List<Money> change = greedyAlgorithm.change(amount);
        Assertions.assertEquals(6, change.size());
    }
    @Test
    void testValue() {
        Integer amount = 149;
        List<Money> change = greedyAlgorithm.change(amount);
        Assertions.assertEquals(7, change.size());
    }
}