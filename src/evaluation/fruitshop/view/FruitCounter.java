package evaluation.fruitshop.view;

import evaluation.fruitshop.controller.Assistant;
import evaluation.fruitshop.model.Fruit;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.util.List;

@Log
@UtilityClass
public class FruitCounter {
    public void display() {
        System.out.println("\nThese are all our tasteful fruits: ");
        List<Fruit> fruits = Assistant.transferToList();
        displayInLines(fruits);
        log.info(fruits.toString());
    }

    private static void displayInLines(List<Fruit> fruits) {
        fruits.stream()
                .forEach(e-> System.out.println(e.getAmount()+" "+e.getName()));
    }
}