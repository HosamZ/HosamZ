package evaluation.week8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    private Predicate<Double> trigger;
    private Function<Double, String> display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    public String sense(Double degrees) {
        if (trigger.test(degrees)) {
            return "Warning!";
        }
        return display.apply(degrees);
    }
}