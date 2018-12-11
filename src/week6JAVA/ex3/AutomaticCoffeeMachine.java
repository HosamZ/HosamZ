package week6JAVA.ex3;

public class AutomaticCoffeeMachine extends CoffeeMaker{

    @Override
    public String getName() {
        return "Automatic coffee machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }
}

