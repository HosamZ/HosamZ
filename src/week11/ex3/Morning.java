package week11.ex3;

import java.time.LocalTime;

public class Morning extends Moment {
    public Morning() {
        super(LocalTime.of(6,00), LocalTime.of(6,00), "Morning");
    }
}
