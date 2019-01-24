package week10.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsSummarizer {
    public static void main(String[] args) {
        List<Student> getStudentFileAsStream = new StudentReader().getStudent();
        getLevelOfEducationAppearance(getStudentFileAsStream);
        getHighEduStudentsMoreThan60(getStudentFileAsStream);
        getGenderOfHighestAvgScores(getStudentFileAsStream);
        isScoresHigherThan95(getStudentFileAsStream);
    }

    private static void isScoresHigherThan95(List<Student> getStudentFileAsStream) {
        boolean high_school = getStudentFileAsStream.stream()
                .filter(e -> e.getParentalEducation().equals("some high school"))
                .anyMatch(StudentsSummarizer::getScoresHigherThan95);
        System.out.println("Is there any student with a parent education level of some high school that has at least 97 in every topic? ");
        System.out.println(high_school);
    }

    private static boolean getScoresHigherThan95(Student e) {
        return (e.getReadingScore() > 95) && (e.getWritingScore() > 95) && (e.getMathScore() > 95);
    }

    private static void getGenderOfHighestAvgScores(List<Student> getStudentFileAsStream) {
        System.out.println("Genders and average scores of the top four average score students: ");
        getStudentFileAsStream.stream()
                .map(e -> avgNumber(e) + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .forEach(System.out::println);
    }

    private static Integer avgNumber(Student e) {
        return (e.getReadingScore() + e.getMathScore() + e.getWritingScore()) / 3;
    }

    private static void getHighEduStudentsMoreThan60(List<Student> getStudentFileAsStream) {
        System.out.print("Number of students with high parent education and lower scores than 60: ");
        long numberOfStudents = getStudentFileAsStream.stream()
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .filter(e -> "master's degree".equalsIgnoreCase(e.getParentalEducation()))
                .count();
        System.out.println(numberOfStudents);
    }

    private static void getLevelOfEducationAppearance(List<Student> getStudentFileAsStream) {
        System.out.println("How many times does each parent level of education appear? ");
        List<Map.Entry<String, Long>> getLevelOfEducationAppearance = new ArrayList<>(getStudentFileAsStream.stream()
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(Student::getParentalEducation, Collectors.counting()))
                .entrySet());
        System.out.println(getLevelOfEducationAppearance);

        System.out.println("Parent education level appearances sorted top bottom: ");
        getLevelOfEducationAppearance.stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
    }
}
