package week7Java.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MoneyCalculatorTest {


    private MoneyCalculator moneyCalculator = new MoneyCalculator();

    @Test
    void testMoneyCalculator() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        Integer total = moneyCalculator.getMoney(numbers);

        Integer expected = 6;
        Assertions.assertEquals(expected, total);
    }
}