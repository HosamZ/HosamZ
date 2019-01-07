package reDoingExUsingLWay;

public class FrenchPress extends CoffeeMaker {
    @Override
    protected String getName() {
        return "French press";
    }

    @Override
    protected Integer getBrewingTime() {
        return 10;
    }
}
