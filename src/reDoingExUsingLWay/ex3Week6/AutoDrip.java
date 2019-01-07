package reDoingExUsingLWay.ex3Week6;

public class AutoDrip extends CoffeeMaker {
    @Override
    protected String getName() {
        return "Auto drip";
    }

    @Override
    protected Integer getBrewingTime() {
        return 6;
    }
}
