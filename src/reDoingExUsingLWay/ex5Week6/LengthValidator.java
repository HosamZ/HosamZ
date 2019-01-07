package reDoingExUsingLWay.ex5Week6;

import java.util.List;

public class LengthValidator extends Validator {
    public LengthValidator(List<String> possibilites) {
        super(possibilites);
    }
    @Override
    public boolean isValid(String cardNumber) {
        String length= String.valueOf(cardNumber.length());
        return getPossibilites().contains(length);
    }
}
