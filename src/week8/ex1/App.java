package week8.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("somewhere", "scenario", "table",
                "cable", "glass", "backpack", "mouse");
        display(words);
    }

    public static void display(List<String> words) {
        Predicate<String> endsWithE = word -> word.endsWith("e");
        System.out.println("Part1: " + words);
        List<String> modified = new ArrayList<>(words);
        modified.removeIf(endsWithE);
        System.out.println("Part2: " + modified);
        modified.replaceAll(e -> e.toUpperCase());
        System.out.println("Part3: " + modified);
        modified.removeIf(e -> e.length() < 6);
        System.out.println("Part4: " + modified);
        System.out.println("Part5: ");
        modified.forEach(e -> System.out.println(e));
    }
}