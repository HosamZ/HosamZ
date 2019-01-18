package evaluation.week9;

import week4Java.ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentPerformancesApp {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        studentsStatistics(reader);


    }

    public static void studentsStatistics(FileReader reader) {
        numberOfStudentsEntries(reader);
        femaleStudentsCount(reader);
        maleNumbers(reader);
        getParentalEducation(reader);
        getScoresHigherThan90(reader);
        getScoresHigherThan100(reader);
    }

    public static void getScoresHigherThan90(FileReader reader) {

        getScoresHigherThan100(reader);
        long scoresHigherThan90 = getFileAsStream(reader)
                .skip(1)
                .map(line -> Arrays.asList(line.split(";")))
                .filter(line -> Integer.valueOf(line.get(2)) > 90)
                .filter(line -> Integer.valueOf(line.get(3)) > 90)
                .filter(line -> Integer.valueOf(line.get(4)) > 90)
                .count();
        System.out.println(scoresHigherThan90);
    }

    public static void getScoresHigherThan100(FileReader reader) {
        List<String> scoresHigherThan100 = getFileAsStream(reader)
                .skip(1)
                .map(line -> Arrays.asList(line.split(";")))
                .filter(line -> Integer.valueOf(line.get(2)) == 100)
                .filter(line -> Integer.valueOf(line.get(3)) == 100)
                .filter(line -> Integer.valueOf(line.get(4)) == 100)
                .map(line->line.get(0))
                .collect(Collectors.toList());
        System.out.println(scoresHigherThan100);
    }

    public static void getParentalEducation(FileReader reader) {
        List<String> collect = getFileAsStream(reader)
                .map(line -> Arrays.asList(line.split(";")))
                .map(line -> line.get(1))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically: ");
        System.out.println(collect);
    }

    public static void maleNumbers(FileReader reader) {
        long maleNumbers = getFileAsStream(reader)
                .skip(1)
                .map(line->line.split(";"))
                .filter(line -> line[0].equals("male"))
                .count();
        System.out.println("Number of male students: " + maleNumbers);
    }

    public static void femaleStudentsCount(FileReader reader) {
        long femaleNumbers = getFileAsStream(reader)
                .skip(1)
                .filter(line -> line.contains("female"))
                .count();
        System.out.println("Number of female students: " + femaleNumbers);
    }

    public static Stream<String> getFileAsStream(FileReader reader) {
        return reader.asStream("evaluation/week9/students-performance.csv");
    }

    public static void numberOfStudentsEntries(FileReader reader) {
        long performanceCount = reader.asStream("evaluation/week9/students-performance.csv")
                .skip(1)
                .count();
        System.out.println("Total number of student performance entries: " + performanceCount);
    }
}