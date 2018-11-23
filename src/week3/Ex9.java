package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9 {

    public static void main(String[] args) {

        List<String> words = getWordsMixedWithRightAndLeft();
        List<String> shiftedWords = new ArrayList<>();
        System.out.println("mixed words : " + words);

        while (words.size() > 0) {
            String word = words.get(0);
            words.remove(0);
            if (isRight(word) && words.size() > 0) {
                String nextWord = words.get(0);
                words.remove(0);
                shiftedWords.add(nextWord);
            }
            shiftedWords.add(word);
        }
        System.out.println("Shifted right Words : " + shiftedWords);
        while (words.size() > 0) {
            String word = words.get(0);
            words.remove(0);
            if (isLeft(word) && words.size() > 0) {
                String nextWord = words.get(0);
                words.remove(0);
                shiftedWords.add(nextWord);
            }
            shiftedWords.add(word);
        }
        System.out.println("Shifted left words" + shiftedWords);


    }

    public static Boolean isRight(String word) {
        return word.equals("right");


    }

    public static Boolean isLeft(String word) {
        return word.equals("left");

    }

    public static List<String> getWordsMixedWithRightAndLeft() {

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("lamp", "ticket", "right", "elephant", "space", "car", "phone", "glass", "left", "sugar"));
        return words;

    }


}

