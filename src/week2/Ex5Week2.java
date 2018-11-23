package week2;

import java.util.ArrayList;
import java.util.List;

public class Ex5Week2 {

    public static void main(String[] args) {


        List<String> words = new ArrayList<String>();
        List<String> words2 = new ArrayList<String>();
        words.add("Hosam");
        words.add("Tamam");
        words2.add("Sosan");
        words2.add("Morad");

        ArrayList<String> finalResult = Combiner.combine(words,words2);

        System.out.println(finalResult);



    }


}
