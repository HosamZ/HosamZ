package week9.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        List<Integer> divisibleByThreeAndBiggerThan = numbers.stream()
                .filter(n -> n > 10)
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: " + divisibleByThreeAndBiggerThan);

        List<Integer> smallerThanFiveMultiByThree = numbers.stream()
                .filter(n -> n < 5)
                .map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3: " + smallerThanFiveMultiByThree);

        List<Integer> biggerThanEightAndSmallerThanTweleve = numbers.stream()
//                .filter(n->(n>8)&&(n<12))
                .filter(n -> n > 8)
                .filter(n -> n < 12)
                .collect(Collectors.toList());

        biggerThanEightAndSmallerThanTweleve.stream()
                .forEach(n -> System.out.println("number " + n + " has " + n.toString().length() + " digits"));
        System.out.println(biggerThanEightAndSmallerThanTweleve);
    }
}