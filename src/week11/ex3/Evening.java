package week11.ex3;

import java.time.LocalTime;

public class Evening extends Moment{
    public Evening() {
        super(LocalTime.of(17,01), LocalTime.of(20,00), "Morning");
    }
}
