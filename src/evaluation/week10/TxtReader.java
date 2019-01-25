package evaluation.week10;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TxtReader {
    FileReader reader = new FileReader();

    public List<String> asList(String filePath) {
        return reader.asStream(filePath)
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("’s", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }
}