package week9.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week4Java.ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
    private FileReader reader = new FileReader();
    private Stream<String> names = getNamesAsStream();

    @Test
    void shorterThanFour() {
        List<String> actual = getNamesAsStream().filter(n -> n.length() < 4)
                .collect(Collectors.toList());
        System.out.println(actual);
        List<String> expected = Arrays.asList("El");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void endWithMToUppercase() {
        List<String> actual = names.filter(n -> n.endsWith("m"))
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(actual);
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void containsEAndR() {
        List<String> actual = names.filter(n -> n.contains("e"))
                .filter(n -> n.contains("r"))
                .collect(Collectors.toList());
        System.out.println(actual);
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fourCharToLowercase() {
        List<String> actual = fourCharToLowercaseAndDoubleAA();
        System.out.println(actual);

        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");

        Assertions.assertEquals(expected, actual);
    }

    private List<String> fourCharToLowercaseAndDoubleAA() {
        return names.filter(n -> n.length() == 4)
                .map(n -> n.toLowerCase())
                .filter(n -> n.contains("a") && n.contains("m"))
                .map(n -> n.replaceAll("a", "aa"))
                .collect(Collectors.toList());
    }

    private Stream<String> getNamesAsStream() {
        return reader.asStream("week9/ex2/names.txt");
    }
}