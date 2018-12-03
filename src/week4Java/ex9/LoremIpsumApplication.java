package week4Java.ex9;

import java.util.List;

public class   LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        readFile(reader);
    }
    private static void readFile(FileReader reader) {
        System.out.println("------------File");
        List<String> lines = reader.asLines("week4Java/ex9/lorem-ipsum");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
