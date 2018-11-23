package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ex17 {



    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("PLEASE","NO","ADVERTISEMENT"));
        words.replaceAll(String::toLowerCase);
        System.out.println(words);
    }
}
