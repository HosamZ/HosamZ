package week4Java.ex11;

import week4Java.ex9.FileReader;

import java.util.*;

public class HappinessApplication {
    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("week4Java/ex11/world-happiness-2017.csv");
        lines.remove(0);
        List<HappinessRecord> happinessRecords = toHappienssRecord(lines);
        Collections.sort(happinessRecords, Comparator.comparing(HappinessRecord::getRank));
        for(int times = 0; times<5 ; times++){
            System.out.println(happinessRecords.get(times));
        }
    }

    public static List<HappinessRecord> toHappienssRecord(List<String> lines) {
        List<HappinessRecord> happinessRecords = new ArrayList<>();
        for (String line : lines) {
            HappinessRecord happinessRecord = HappinessList(line);
            happinessRecords.add(happinessRecord);
        }
        return happinessRecords;
    }
    private static HappinessRecord HappinessList(String line) {
            String[] split = line.split(";");
            List<String> columns = Arrays.asList(split);
            String country = columns.get(0);
            Integer rank = Integer.valueOf(columns.get(1));
            Double score = Double.valueOf(columns.get(2));
            return new HappinessRecord(rank, country, score);
    }
}
