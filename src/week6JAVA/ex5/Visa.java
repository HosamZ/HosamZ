package week6JAVA.ex5;

import java.util.Arrays;
import java.util.List;

public class Visa extends CreditCard{

    public Visa() {
        super(Arrays.asList(13,16), Arrays.asList(4));
    }

    @Override
    public String getName() {
        return "Visa";
    }
}
