package week2;

import java.util.ArrayList;
import java.util.List;

public class Combiner {
    public static ArrayList<String> combine(List<String> words1, List<String> words2) {

        ArrayList<String> combinedElements = new ArrayList<>();

        while (words1.size() > 0 || words2.size() > 0) {

            //WE USE WITH >>>>>  while,if,for ()
            if (words1.size() > 0) {
                String word = words1.get(0);
                words1.remove(0);
                combinedElements.add(word);
            }

            if (words2.size() > 0) {
                String word = words2.get(0);
                words2.remove(0);
                combinedElements.add(word);

            }


        }
        return combinedElements;

    }

}
