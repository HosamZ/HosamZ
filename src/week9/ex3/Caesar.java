package week9.ex3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public static final int NUMBER_OF_LETTER = 26;
    public static final int START_OF_SMALL_ASCII = 97;
    public static final int NUMBER_OF_BIGASCII = 65;

    public String cipher(String text, Integer key) {

        return Stream.of(text.split(""))
                .map(s -> s.charAt(0))
                .map(s -> shiftLetter(s, key))
                .collect(Collectors.joining());
    }

    private String shiftLetter(Character letter, Integer key) {
        if (!Character.isAlphabetic(letter)) {
            return letter.toString();
        }
        return shift(letter, key);
    }

    private String shift(Character letter, Integer key) {
        int shiftedAsciiCode = letter + key;
        if (Character.isUpperCase(letter)) {
            shiftedAsciiCode = (shiftedAsciiCode - NUMBER_OF_BIGASCII) % NUMBER_OF_LETTER + 65;
        } else {
            shiftedAsciiCode = (shiftedAsciiCode - START_OF_SMALL_ASCII) % 26 + 97;
        }
        Character cipher = (char) shiftedAsciiCode;
        return cipher.toString();
    }
}