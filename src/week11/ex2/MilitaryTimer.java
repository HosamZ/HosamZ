package week11.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class MilitaryTimer {
    private DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("hh:mm:ssa");
    private DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String toMilitaryTime(String time) {
        LocalTime time12 = LocalTime.parse(time, formatter12);
        return time12.format(formatter24);
    }
}