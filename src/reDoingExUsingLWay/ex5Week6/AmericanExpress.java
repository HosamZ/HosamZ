package reDoingExUsingLWay.ex5Week6;

import java.util.Arrays;
import java.util.List;

public class AmericanExpress extends CreditCard {
    public AmericanExpress() {
        super(Arrays.asList(new LengthValidator(Arrays.asList("15")),
                new StartsWithValidator(Arrays.asList("34","37"))));
    }
    @Override
    public String getName() {
        return "American Express";
    }
}
