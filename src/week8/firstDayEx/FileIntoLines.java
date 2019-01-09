package week8.firstDayEx;

import week4Java.ex9.FileReader;

import java.util.ArrayList;
import java.util.List;

public class FileIntoLines {
    private FileReader reader = new FileReader();
    public List<String> getLines(String filepath){
        List<String> encryptedTricks= new ArrayList<>();
        List<String> lines = reader.asLines(filepath);
        for (String line : lines) {

            encryptedTricks.add(line);
        }
        return lines;
    }
}
