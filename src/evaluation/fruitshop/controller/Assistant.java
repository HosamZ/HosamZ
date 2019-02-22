package evaluation.fruitshop.controller;

import evaluation.fruitshop.model.Fruit;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class Assistant {

    public List<Fruit> transferToList() {
        return FruitReader.listOfFruits()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> Fruit.builder().name(e.getKey()).amount(e.getValue()).build())
                .collect(Collectors.toList());
    }
}