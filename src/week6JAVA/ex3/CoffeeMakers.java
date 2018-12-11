package week6JAVA.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList() {
        List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutoDrip(), new AutomaticCoffeeMachine(), new FrenchPress());
        return coffeeMakers;
    }
    public static Optional<CoffeeMaker> get(String nameOfCoffee) {
        List<CoffeeMaker> makers = asList();
        for (CoffeeMaker maker : makers) {
            if (nameOfCoffee.equals(maker.getName())) {
                return Optional.of(maker);
            }
        }
        return Optional.empty();
    }
}
