package week8.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {
    public List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> modified = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)){
                modified.add(number);
            }
        }
        return modified;
    }
}