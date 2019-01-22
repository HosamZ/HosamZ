package week7Java.ex9.dictionaryPackage;

import java.util.ArrayList;
import java.util.List;

public class BooksChecker {
    Checker checker = new Checker();

    public Boolean wordsIncorrected(String word, List<String> wordsContainer) {
        boolean checked;
        for (String wordInBook : wordsContainer) {
            if (!wordInBook.equals(word)) {
                return checked = true;
            }
        }
        return checked = false;
    }
    }
//
//    public List<String> correctedWords(List<String> words1, List<String> words2) {
//        List<String> emptyList = new ArrayList<>();
//        for (String word1 : words1) {
//            wordsIncorrected(word1, words2)
//        }
//    }
