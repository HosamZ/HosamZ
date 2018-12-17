package week7Java.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MoneyCalculatorTest {

    @Test
    void testMoneyCalculator() {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 2, 3, 5, 3);
        Integer expectedSum = 30;
        Assertions.assertEquals(expectedSum, moneyCalculator.getMoney(numbers));
    }
}