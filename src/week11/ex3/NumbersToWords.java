package week11.ex3;

import java.util.HashMap;
import java.util.Map;

public class NumbersToWords {

    public static Map<Integer, String> getWord() {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        numbers.put(11, "eleven");
        numbers.put(12, "twelve");
        numbers.put(13, "thirteen");
        numbers.put(14, "fourteen");
        numbers.put(15, "fifteen");
        numbers.put(16, "sixteen");
        numbers.put(17, "seventeen");
        numbers.put(18, "eighteen");
        numbers.put(19, "nineteen");
        numbers.put(20, "twenty");
        numbers.put(21, "twenty one");
        numbers.put(22, "twenty two");
        numbers.put(23, "twenty three");
        numbers.put(24, "twenty four");
        numbers.put(25, "twenty five");
        numbers.put(26, "twenty six");
        numbers.put(27, "twenty seven");
        numbers.put(28, "twenty eight");
        numbers.put(29, "twenty nine");
        return numbers;
    }
}