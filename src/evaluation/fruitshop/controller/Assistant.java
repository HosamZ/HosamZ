package evaluation.fruitshop.controller;

import evaluation.fruitshop.model.Fruit;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@UtilityClass
@Log
public class Assistant {
    public String countFruit(List<Fruit> fruitsNames) {
        List<Fruit> fruits = FruitReader.asList
                ("evaluation/fruitshop/resources/delivery.txt");
        if (fruitsNames.size() < 1) {
            return "";
        }
        return fruits.stream()
                .collect(groupByName())
                .entrySet().stream()
                .map(e -> e.getValue() + " " + e.getKey())
                .collect(Collectors.joining("\n"));
    }

    private static Collector<Fruit, ?, Map<String, Long>> groupByName() {
        return Collectors.groupingBy(Fruit::getName, Collectors.counting());
    }
}