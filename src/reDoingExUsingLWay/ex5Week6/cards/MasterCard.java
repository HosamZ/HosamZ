package reDoingExUsingLWay.ex5Week6.cards;

import reDoingExUsingLWay.ex5Week6.LengthValidator;
import reDoingExUsingLWay.ex5Week6.StartsWithValidator;

import java.util.Arrays;

public class MasterCard extends CreditCard {
    public MasterCard() {
        super(Arrays.asList(new LengthValidator(Arrays.asList("16")),new StartsWithValidator(Arrays.asList(
                "51","52","53","54","55"
        ))));
    }

    @Override
    public String getName() {
        return "Master Card";
    }
}
