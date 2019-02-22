package challangesFromInternet.numberPermutionsChallange;


import challangesFromInternet.findNxtSmallerNumberChallange.NumberSplitter;

import java.util.*;

public class NumberPermutions {
    private NumberSplitter numberSplitter = new NumberSplitter();
    private List<String> results = new ArrayList<>();

    public Set<String> get(Integer number) {
        Integer[] digits = numberSplitter.toArray(number);
        int sizeOfDigits = digits.length;
        return new HashSet<>(heapsAlgorithm(digits, sizeOfDigits));
    }

    private List<String> heapsAlgorithm(Integer[] digits, int numberOfDigits) {
        if (numberOfDigits == 1) {
            String resultsInStrings = Arrays.toString(digits);
            results.add(resultsInStrings);
//            System.out.println("===== added result: " + resultsInStrings);
        } else {
            for (int index = 0; index < numberOfDigits; index++) {
                heapsAlgorithm(digits, numberOfDigits - 1);

//                System.out.println("current: " + Arrays.asList(digits));
                int current = (numberOfDigits % 2 == 0) ? index : 0;
                int temporary = digits[numberOfDigits - 1];
                digits[numberOfDigits - 1] = digits[current];
                digits[current] = temporary;
//                System.out.println("altered: " + Arrays.asList(digits));
            }
        }
        return results;
    }
}