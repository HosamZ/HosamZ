package week11.ex3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    private Converter convert = new Converter();

    @Test
    void testOClock() {
        String actual = convert.toWords(12, 0) + " " + convert.toMoment(12, 0);
        String expected = "twelve O'CLOCK! Noon";
//        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testMidnight() {
        String actual = convert.toWords(0, 0) + " " + convert.toMoment(0, 0);
        String expected = "It's midnight! Midnight";
//        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testHalfPast() {
        String actual = convert.toWords(13, 30) + " " + convert.toMoment(13, 30);
        String expected = "half past thirteen Afternoon";
//        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test
    void testMinToHour() {
        String actual = convert.toWords(13, 40) +" "+ convert.toMoment(13, 40);
        String expected = "twenty to fourteen Afternoon";

        assertEquals(expected, actual);
    }

    @Test
    void testMinPastHour() {
        String actual = convert.toWords(13, 12) +" "+ convert.toMoment(13, 12);
        String expected = "twelve past thirteen Afternoon";
//        System.out.println(actual);
        assertEquals(expected, actual);
    }
}