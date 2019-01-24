package week10.ex3;

import week4Java.ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {

    public List<Sms> asList(String filePath) {
        return new FileReader().asStream(filePath)
                .skip(1)
                .map(e -> e.split(";"))
                .map(columns -> new Sms(columns[0], columns[1]))
                .collect(Collectors.toList());
    }
}