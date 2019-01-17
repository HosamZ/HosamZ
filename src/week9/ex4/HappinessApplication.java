package week9.ex4;

import week4Java.ex9.FileReader;

import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {
        new FileReader().asStream("week9/ex4/world-happiness-2017.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(line -> new HappinessRecord(Integer.valueOf(line[1]), line[0], Double.valueOf(line[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(line -> System.out.println("Rank: " + line.getRank() + " | Country: " + line.getCountry() +
                        " | Score: " + line.getScore()));
    }
}