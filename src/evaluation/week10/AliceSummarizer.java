package evaluation.week10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceSummarizer {
    public static void main(String[] args) {
        List<String> words = new TxtReader().asList("evaluation/week10/alice.txt");
        displayWordsCount(words);
        displayFileDistinctWordsCount(words);
        displayMost5AppearingWords(words);
        displayLongestWord(words);
        displayMost5AppearingLetters(words);
        displayAliceAppearance(words);
    }

    private static void displayAliceAppearance(List<String> getTxtFile) {
        long aliceWordCounter = getTxtFile.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
        System.out.println("Alice word appearance: "+aliceWordCounter);
    }

    private static void displayMost5AppearingLetters(List<String> getTxtFile) {
        List<String> mostAppearingLetters = getTxtFile.stream()
                .map(word -> word.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        mostAppearingLetters.forEach(System.out::println);
    }

    private static void displayLongestWord(List<String> getTxtFile) {
        getTxtFile.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, List<String>>::getKey).reversed())
                .map(Map.Entry::getValue)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static void displayMost5AppearingWords(List<String> getTxtFile) {
        List<String> mostAppearing5Words = getTxtFile.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        mostAppearing5Words.forEach(System.out::println);
    }

    private static void displayFileDistinctWordsCount(List<String> getTxtFile) {
        long distinctWordsCount = getTxtFile.stream()
                .distinct()
                .count();
        System.out.println(distinctWordsCount);
    }

    private static void displayWordsCount(List<String> getTxtFile) {
        long wordsCount = getTxtFile.stream()
                .count();
        System.out.println(wordsCount);
    }
}