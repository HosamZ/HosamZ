package reDoingExUsingLWay.ex3Week6;

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
