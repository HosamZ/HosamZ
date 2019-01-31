package week11.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MilitaryTimerTest {
    private MilitaryTimer timer = new MilitaryTimer();

    @Test
    void toMilitaryTime() {
        String time = "07:05:45PM";

        String actual = timer.toMilitaryTime(time);
        String expected = "19:05:45";

        Assertions.assertEquals(expected, actual);
    }
}