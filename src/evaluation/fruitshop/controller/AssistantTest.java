package evaluation.fruitshop.controller;

import evaluation.fruitshop.model.Fruit;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

@Log
class AssistantTest {

    @Test
    void transferToList() {
        List<Fruit> fruits = Assistant.toFruit();
        log.info(fruits.toString());

    }

    @ParameterizedTest
    @CsvSource({
            ",",
            "1 Apple \n1 Orange, Apple Orange",
            "2 Apple \n1 Orange, Apple Apple Orange",
    })
    void testWithCsvSource(String expected, String input) {
//        Assistant.toFruit();
    }
}