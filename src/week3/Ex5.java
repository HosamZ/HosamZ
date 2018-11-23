package week3;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> nickNames = new ArrayList<>();

        words.add("house");
        words.add("tree");
        words.add("theater");
        words.add("somewhere");
        words.add("bottle");
        for (String word : words) {
            int endOfWord = word.length();
            int halfSize = endOfWord / 2;
            String nickName = word.substring(0, halfSize);
            //word.substring(0, endOfWord/2 + 1);
            nickNames.add(nickName);
        }
        System.out.println(nickNames);


    }
}
