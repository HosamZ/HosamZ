package week11.ex3;

import java.time.LocalTime;

public class Afternoon extends Moment {
    public Afternoon() {
        super(LocalTime.of(12, 01), LocalTime.of(17, 00), "Afternoon");
    }
}