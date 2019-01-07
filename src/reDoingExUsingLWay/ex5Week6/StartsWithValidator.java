package reDoingExUsingLWay.ex5Week6;

import java.util.List;

public class StartsWithValidator extends Validator {
    public StartsWithValidator(List<String> possibilities) {
        super(possibilities);
    }

    @Override
    public boolean isValid(String cardNumber){
        List<String> beginnings = getPossibilites();
        for (String beginning : beginnings) {
            if (cardNumber.startsWith(beginning)){
                return true;
            }
        }
        return false;
    }
}
