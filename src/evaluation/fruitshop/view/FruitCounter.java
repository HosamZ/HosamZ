package evaluation.fruitshop.view;

import evaluation.fruitshop.controller.Assistant;
import evaluation.fruitshop.controller.FruitReader;
import evaluation.fruitshop.model.Fruit;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.util.List;

@Log
@UtilityClass
public class FruitCounter {
    public void display() {
        List<Fruit> filePath = FruitReader.asList("evaluation/fruitshop/resources/delivery.txt");
        String actual = Assistant.countFruit(filePath);
        log.info("\nThese are all our tasteful fruits: " + "\n" + actual);
    }
}