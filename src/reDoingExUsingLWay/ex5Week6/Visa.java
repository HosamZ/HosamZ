package reDoingExUsingLWay.ex5Week6;

import java.util.Arrays;
import java.util.List;

public class Visa extends CreditCard {
    public Visa() {
        super(Arrays.asList(new LengthValidator(Arrays.asList("13","16")),
                new StartsWithValidator(Arrays.asList("4"))));
    }
    @Override
    public String getName() {
        return "Visa";
    }
}
