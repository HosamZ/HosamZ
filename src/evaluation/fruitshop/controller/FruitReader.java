package evaluation.fruitshop.controller;

import lombok.experimental.UtilityClass;

import java.util.stream.Stream;

@UtilityClass
public class FruitReader {
    public Stream<String> listOfFruits() {
        return FileReaderUsingLombok.lines("evaluation/fruitshop/resources/delivery.txt");
    }
}