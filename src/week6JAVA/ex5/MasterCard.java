package week6JAVA.ex5;

import java.util.Arrays;
import java.util.List;

public class MasterCard extends CreditCard {


    public MasterCard() {
        super(Arrays.asList(16), Arrays.asList(51,52,53,54,55));
    }

    @Override
    public String getName() {
        return "Master Card";
    }
}
