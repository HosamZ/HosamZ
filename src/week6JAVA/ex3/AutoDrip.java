package week6JAVA.ex3;

public class AutoDrip extends CoffeeMaker {
    @Override
    public String getName() {
        return "Auto drip";
    }

    @Override
    public Integer getBrewingTime() {
        return 6;
    }
}
