package week7Java.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfWordPalindromTest {
    @Test
    void testIsWordPalindrom() {
        String word = "anna";

        boolean isWordPalindrom = CheckIfWordPalindrom.isWordPalindrom(word);

        Assertions.assertTrue(isWordPalindrom);
    }
    @Test
    void testIsWordNotPalindrom() {
        String word = "sameeerr";

        boolean isWordPalindrom = CheckIfWordPalindrom.isWordPalindrom(word);

        Assertions.assertFalse(isWordPalindrom);
    }
}
//    @TicTakToe
//    void testIsThereIsWord() {
//        Integer word = 111;
//
//        Assertions.assertFalse(CheckIfWordPalindrom.isWordPalindrom(word));
//    }
