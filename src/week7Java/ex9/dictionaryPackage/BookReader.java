package week7Java.ex9.dictionaryPackage;

import week4Java.ex9.FileReader;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReader {

    public Stream<String> read(String filepath) {
        return new FileReader().asStream(filepath);
    }
}