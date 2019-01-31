package week11.ex3;

import java.util.Map;

public class Number {
    private static Map<Integer, String> numbersIntoWords = NumbersToWords.getWord();

    public static String toString(Integer number) {

        if (number < 21) {
            return numbersIntoWords.get(number);
        }
        if (number.equals(30)) {
            return numbersIntoWords.get(number);
        }

        Integer moduleDigit = getModuleDigit(number);
        Integer divDigit = getDivDigit(number);
        return numbersIntoWords.get(divDigit) + " " + numbersIntoWords.get(moduleDigit);
    }

    private static int getModuleDigit(int number) {

        return number % 10;
    }

    private static int getDivDigit(int number) {

        return number / 10 * 10;
    }
}