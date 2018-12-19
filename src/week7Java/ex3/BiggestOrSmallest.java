package week7Java.ex3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggestOrSmallest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,15,6);
        Collections.sort(numbers);
        isBiggest(numbers);
        isSmallest(numbers);
    }

    public static void isSmallest(List<Integer> numbers) {
        Integer smallestN = numbers.get(0);
        System.out.println(smallestN);
    }

    public static void isBiggest(List<Integer> numbers) {
        Integer biggestN = numbers.get(numbers.size()-1);
        System.out.println(biggestN);
    }


}
