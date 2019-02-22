package evaluation.fruitshop.controller;

import evaluation.fruitshop.model.Fruit;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.util.List;
import java.util.stream.Collectors;
@Log
@UtilityClass
public class FruitReader {

    public List<Fruit> asList(String filePath){
        return FileReaderUsingLombok.lines(filePath)
                .map(e->Fruit.builder().name(e).build())
                .collect(Collectors.toList());
    }
}