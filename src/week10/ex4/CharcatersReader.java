package week10.ex4;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharcatersReader {
    private FileReader reader = new FileReader();


    public List<Character> getCharacters() {
        return reader.asStream("week10/ex4/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(columns -> getCharacterLines(columns))
                .collect(Collectors.toList());
    }

    private Character getCharacterLines(String[] columns) {
        return new Character(columns[0], columns[1],
                String.valueOf(columns[2]),
                String.valueOf(columns[3]), String.valueOf(columns[4]), String.valueOf(columns[5]),
                Integer.valueOf(columns[6]), Integer.valueOf(columns[7]), Integer.valueOf(columns[8]),
                Integer.valueOf(columns[9])
                , Integer.valueOf(columns[10]), Integer.valueOf(columns[11]),
                Integer.valueOf(columns[12]));
    }
}