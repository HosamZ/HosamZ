package week8.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class KeywordFinderTest {
    private KeywordFinder finder = new KeywordFinder();
    private String sentence =
            "The elephant is lifted eleven floors easily with the help of an electricity elevator";
    private String sentence2 = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";

    @Test
    void finder() {
        Predicate<String> isElegent = word -> word.startsWith("ele");

        List<String> actual = finder.find(sentence, isElegent);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected, actual);

        Predicate<String> isPlayful = word -> word.endsWith("ful");

        actual = finder.find(sentence2, isPlayful);
        expected = Arrays.asList("rightful", "powerful", "awful", "colorful");

        Assertions.assertEquals(expected, actual);
    }
}