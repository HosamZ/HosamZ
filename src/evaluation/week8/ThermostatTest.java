package evaluation.week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {
    private Thermostat thermostat = new Thermostat(s -> s < 0, t -> t + "degrees celsius");
    private Thermostat thermostat2 = new Thermostat(s -> s >= 80, t -> t + 273.15 + "degrees Kelvin");

    @Test
    void testSkiing() {
        Double temperature = 2.0;
        Double temperature2 = -1.0;

        String actual = thermostat.sense(temperature);
        String expected = temperature + "degrees celsius";
        String actual2 = thermostat.sense(temperature2);
        String expected2 = "Warning!";

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void testSauna() {
        Double temperature = 79.0;
        Double temperature2 = 80.0;

        String actual = thermostat2.sense(temperature);
        String actual2 = thermostat2.sense(temperature2);
        String expected = temperature + 273.15 + "degrees Kelvin";
        String expected2 = "Warning!";

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}