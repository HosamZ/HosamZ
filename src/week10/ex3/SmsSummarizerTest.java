package week10.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsSummarizerTest {
    private List<Sms> sms = new SmsReader().asList("week10/ex3/sms.csv");

    @Test
    void testMostUsedLetter() {
        String actual = getMostUsedLetterInHam();
        String expected = "e";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMostUseHamWord() {
        String actual = getMostUsedWordInHam();
        String expected = "to";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testIsSortedByHighestFirst() {
        String actual = sortByHighestFirst();
        String expected = "ham 86%, spam 13%";

        Assertions.assertEquals(expected, actual);
    }

    private String sortByHighestFirst() {
        return sms.stream()
                .collect(Collectors.groupingBy(Sms::getLabel, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + getPercentage(e) + "%")
                .collect(Collectors.joining(", "));
    }

    private long getPercentage(Map.Entry<String, Long> e) {
        return (e.getValue() * 100) / sms.size();
    }

    private String getMostUsedWordInHam() {
        return sms.stream()
                .filter(e -> e.getLabel().equals("ham"))
                .map(e -> e.getText().split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> " Most used ham word: " + e.getKey())
                .collect(Collectors.joining());
    }

    private String getMostUsedLetterInHam() {
        return sms.stream()
                .filter(e -> e.getLabel().equals("ham"))
                .map(e -> e.getText().replaceAll(" ", "").split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.joining());
    }
}