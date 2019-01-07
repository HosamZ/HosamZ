package week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        FileIntoLines file = new FileIntoLines();
        List<String> lines = file.getLines("week8/robomime.txt");
        List<String> tricks = new ArrayList<>();
        for (String line : lines) {
            Optional<String> decrypt = sensor.decrypt(line);
            tricks.add(decrypt.get());
        }
        Archive archive = new Archive();
        archive.display(tricks);
    }
}