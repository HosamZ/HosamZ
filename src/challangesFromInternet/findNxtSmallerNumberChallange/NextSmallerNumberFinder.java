package challangesFromInternet.findNxtSmallerNumberChallange;

import java.util.*;
import java.util.stream.Collectors;

public class NextSmallerNumberFinder {

    public Integer findNext(Integer number) {
        Stack<String> digits = new NumberSplitter().split(number);

        if (checkIfNotApplicable(digits)) {
            return -1;
        }

        List<String> middleDigits = new ArrayList<>();
        String firstRightDigit = digits.pop();
        String nextDigit = digits.pop();
        while (Integer.valueOf(firstRightDigit) > Integer.valueOf(nextDigit) && !digits.empty()) {
            middleDigits.add(nextDigit);
            nextDigit = digits.pop();
        }
        middleDigits.add(nextDigit);
        String orderedMiddleDigits = middleDigits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        String fixedLeftDigits = String.join("", digits);

        String joined = fixedLeftDigits + firstRightDigit + orderedMiddleDigits;

        if (checkCornerCases(number, digits, joined)) return -1;

        return Integer.valueOf(joined);
    }

    private boolean checkIfNotApplicable(Stack<String> digits) {
        if (checkIfOnlyOneDigit(digits)) {
            return true;
        }
        if (checkIfAllSame(digits)) {
            return true;
        }
        if (checkIfNaturalOrder(digits)) {
            return true;
        }
        return false;
    }

    private boolean checkIfOnlyOneDigit(Stack<String> digits) {
        return digits.size() == 1;
    }

    private boolean checkIfAllSame(Stack<String> digits) {
        Set<String> setOfDigits = new HashSet<>(digits);
        return setOfDigits.size() < 2;
    }
    private boolean checkIfNaturalOrder(Stack<String> digits) {
        String naturalOrder = digits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining());
        String original = String.join("", digits);
        return original.equals(naturalOrder);
    }

    private boolean checkIfFuckedUpZero(String joined) {
        return joined.startsWith("0");
    }

    private boolean checkCornerCases(Integer number, Stack<String> digits, String joined) {
        if (digits.empty()) {
            if (Integer.valueOf(joined) > number) {
                return true;
            }
        }
        if (checkIfFuckedUpZero(joined)) {
            return true;
        }
        return false;
    }
}