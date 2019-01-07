package reDoingExUsingLWay.ex5Week6;

import java.util.List;

public abstract class Validator {
    private List<String> possibilites;

    public Validator(List<String> possibilites) {
        this.possibilites = possibilites;
    }

    protected List<String> getPossibilites() {
        return possibilites;
    }
    public abstract boolean isValid(String cardNumber);
}
