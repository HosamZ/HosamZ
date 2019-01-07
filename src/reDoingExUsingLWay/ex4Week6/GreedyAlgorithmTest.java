package reDoingExUsingLWay.ex4Week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GreedyAlgorithmTest {
    private GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
    @Test
    void testZeroGiven(){
        Integer amount = 0;

        List<Money> change = greedyAlgorithm.change(amount);

        Assertions.assertTrue(change.isEmpty());
    }
    @Test
    void test88GivenAmount(){
        Integer amount = 88;

        List<Money> change = greedyAlgorithm.change(amount);

        Assertions.assertEquals(6,change.size());
    }
    @Test
    void testAmountGiven149(){
        Integer amount = 149;

        List<Money> change = greedyAlgorithm.change(amount);

        Assertions.assertEquals(7,change.size());
    }
}