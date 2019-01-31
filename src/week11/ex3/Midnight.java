package week11.ex3;

import java.time.LocalTime;

public class Midnight extends Moment {
    public Midnight() {
        super(LocalTime.of(0, 0), LocalTime.of(0, 0), "Midnight");
    }
}
