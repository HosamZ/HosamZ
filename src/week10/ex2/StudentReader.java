package week10.ex2;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader reader = new FileReader();

    public List<Student> getStudent() {
        return reader.asStream("week10/ex2/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(line -> getStudentStats(line))
                .collect(Collectors.toList());
    }

    private Student getStudentStats(String[] line) {
        return new Student(line[0],line[1],Integer.valueOf(line[2]),
                Integer.valueOf(line[3]),Integer.valueOf(line[4]));
    }
}