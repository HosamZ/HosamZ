package week11.ex3;

import java.time.LocalTime;

public class Noon extends Moment{

    public Noon() {
        super(LocalTime.of(12,00), LocalTime.of(12,00), "Noon");
    }
}