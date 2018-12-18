package evaluation.week4Java;

import evaluation.week2Reflection.Letter;
import week4Java.ex9.FileReader;

import java.util.*;

public class RobodogApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> letter = reader.asLines("evaluation/week4Java/robodog.txt");
        Set<Letter> lettersSet =  new HashSet<>();



    }

    private static void readFile(FileReader reader) {
        System.out.println("------------File");
        List<String> lines = reader.asLines("evaluation/week4Java/robodog.txt");
        for (String line : lines) {
            String replacer = line.replaceAll("!","");
            System.out.println(replacer);
        }

        }
}

//    public static List<String> Decryptor(List<String> text){
//        FileReader reader = new FileReader();
//        List<String> lines = reader.asLines("evaluation/week4Java/robodog.txt");
//        String[] generate = text.generate("");
//        List<String> letters = new ArrayList<>(Arrays.asList(generate));
//        String unWantedLetter = "!";
//        for (String line : lines) {
//            line.replaceAll("!"," ");
//            lines.add(line);
//        }
//        return lines;
