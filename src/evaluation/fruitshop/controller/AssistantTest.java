package evaluation.fruitshop.controller;

import evaluation.fruitshop.model.Fruit;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log
class AssistantTest {
    private List<Fruit> fruits = FruitReader.asList("evaluation/fruitshop/resources/delivery.txt");

    @Test
    void countFruit() {

        String actual = Assistant.countFruit(fruits);


//        Assertions.assertEquals(expected, actual);

    }

    //never read from file
    @ParameterizedTest
    @CsvSource({
            ",",
            "1 Apple \n1Orange, Apple Orange",
            "2 Apple \n1Orange, Apple Apple Orange",
//            "8 Apple,true",
//            "4 Watermelon,true",
//            "7 Orange,true",
//            "8 Banana,true",
//            "3 eggs,false",
//            "2 potatoes,false"
    })
    void testWithCsvSource(String expected, String input) {
//        List<String> fruitNames = List.of(input.split(" ");
//        Stream.of(input.split(" "))
//                .map(e -> Fruit.builder().name(e).build())
//                .collect(Collectors.toList());
//        List<Fruit> fruits = ;
//        String result = Assistant.countFruit(fruits);
//        Assertions.assertEquals(expected, result);
//    }
    }
}