package week4Java.ex12;
import week4Java.ex9.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CharacterReader {
    private FileReader reader = new FileReader();
    public List<Character> getCharacters(String filePath){
        List<Character> characters = new ArrayList<>();
        List<String> lines=reader.asLines(filePath);
        lines.remove(0);
        for (String line : lines) {
            String[] split = line.split(";");
            List<String> columns = Arrays.asList(split);
            String name = columns.get(0);
            String bookOfDeath = String.valueOf(columns.get(3));
            String gender = String.valueOf(columns.get(6));
            Character character = new Character(name,bookOfDeath,gender);
            characters.add(character);
        }
        return characters;
    }
}
