package week8.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
    public List<String> find(String sentence, Predicate<String> condition) {
        List<String> modified = new ArrayList<>();
        String[] split = sentence.split(" ");
        for (String word : split) {
            if (condition.test(word)) {
                modified.add(word);
            }
        }
        return modified;
    }
}