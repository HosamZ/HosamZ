package evaluation.week10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceSummeraizer {
    public static void main(String[] args) {
        List<String> words = new TxtReader().asList("evaluation/week10/alice.txt");
        getWordsCount(words);
        getFileDistnictWordsCount(words);
        getMost5AppearingWords(words);
        getLongestWord(words);
        getMost5AppearingLetters(words);
        getAliceAppearnce(words);

    }

    private static void getAliceAppearnce(List<String> getTxtFile) {
        long aliceCounter = getTxtFile.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
        System.out.println(aliceCounter);
    }

    private static void getMost5AppearingLetters(List<String> getTxtFile) {
        List<String> getMost5AppearingLetters = getTxtFile.stream()
                .map(word -> word.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        getMost5AppearingLetters.forEach(System.out::println);
    }

    private static void getLongestWord(List<String> getTxtFile) {
        getTxtFile.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, List<String>>::getKey).reversed())

                .map(Map.Entry::getValue)
                .findFirst()
                .ifPresent(System.out::println);
//        System.out.println(longestWords);
    }

    private static void getMost5AppearingWords(List<String> getTxtFile) {
        List<String> mostAppearing5Words = getTxtFile.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        mostAppearing5Words.forEach(System.out::println);
    }

    private static void getFileDistnictWordsCount(List<String> getTxtFile) {
        long count = getTxtFile.stream()
                .distinct()
                .count();
        System.out.println(count);
    }

    private static void getWordsCount(List<String> getTxtFile) {
        long count = getTxtFile.stream()
                .count();
        System.out.println(count);
    }
}