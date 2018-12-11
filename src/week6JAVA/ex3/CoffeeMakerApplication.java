package week6JAVA.ex3;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime());
        }
        checkForCoffee("Automatic coffee machine");
        checkForCoffee("French press");
        checkForCoffee("Auto drip");
        checkForCoffee("Moka pot");
    }
    public static void checkForCoffee(String coffeeMakerName) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(coffeeMakerName);
        if (coffeeMaker.isPresent()) {
            Coffee coffee = coffeeMaker.get().brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime());
        } else {
            System.out.println("The coffee maker with the name "+coffeeMakerName+" is not available");
        }
    }
}