package week8.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class NumberFilterTest {
    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    void filter() {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> actual = filter.filter(numbers, isEven);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);

        Assertions.assertEquals(expected, actual);

        Predicate<Integer> isOdd = number -> number % 2 != 0;

        actual = filter.filter(numbers, isOdd);
        expected = Arrays.asList(1, 3, 5, 7, 9);

        Assertions.assertEquals(expected, actual);
    }
}