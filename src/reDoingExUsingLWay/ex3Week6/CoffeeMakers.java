package reDoingExUsingLWay.ex3Week6;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {
    private static List<CoffeeMaker> makers = Arrays.asList(new AutomaticCoffeeMachine(),
            new AutoDrip(), new FrenchPress());


    public static List<CoffeeMaker> asList() {
        return makers;
    }

    public static Optional<CoffeeMaker> get(String name) {
        for (CoffeeMaker maker : makers) {
            if (maker.getName().equalsIgnoreCase(name)) {
                return Optional.of(maker);
            }
        }
        return Optional.empty();
    }
}