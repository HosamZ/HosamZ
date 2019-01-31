package week11.ex3;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    private List<Moment> moments = Moments.getMoment();

    public String toWords(Integer hour, Integer minute) {
        if (minute.equals(0)) {
            return getOclock(hour);
        }
        if (minute <= 30) {
            return Number.toString(minute) + " past " + Number.toString(hour);
        }
        int remainedMinute = 60 - minute;
        return Number.toString(remainedMinute) + " to " + Number.toString(hour + 1);
    }

    public String toMoment(Integer hour, Integer minute) {
        LocalTime timeNow = LocalTime.of(hour, minute);
        return moments.stream()
                .filter(e -> e.isWithBetween(timeNow))
                .map(Moment::getMoment)
                .limit(1)
                .collect(Collectors.joining());
    }

    private String getOclock(Integer hour) {
        if (hour.equals(0)) {
            return "It's midnight!";
        }

        return Number.toString(hour) + " O'CLOCK!";
    }
}