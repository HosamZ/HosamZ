package week7Java.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumberSplitter {

    public List<Integer> number(Integer number) {
        String toString = number.toString();
        String[] splitted = toString.split("");
        List<String> numbers = Arrays.asList(splitted);
        List<Integer> numbers1 = new ArrayList<>();
        for (String number1 : numbers) {
            Integer num = Integer.valueOf(number1);
            numbers1.add(num);
        }
        return numbers1;
    }

    public List<Integer> numberSplitter1(Integer number) {
        LinkedList<Integer> queue = new LinkedList<>();
        while (number > 0) {
            queue.push(number % 10);
            number = number / 10;
        }
        return queue;
    }

}
