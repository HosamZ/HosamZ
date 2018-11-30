package evaluation.week4Java;

import evaluation.week2Reflection.Letter;
import week4Java.ex9.FileReader;

import java.util.*;

public class RobodogApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        readFile(reader);
        Set<Letter> letters =  new HashSet<>();
        List<String> specialWords = new ArrayList<>();
        boolean containsMove = letters.contains("move");
        if(containsMove){


            System.out.println(containsMove);
        }
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
//        String[] split = text.split("");
//        List<String> letters = new ArrayList<>(Arrays.asList(split));
//        String unWantedLetter = "!";
//        for (String line : lines) {
//            line.replaceAll("!"," ");
//            lines.add(line);
//        }
//        return lines;
