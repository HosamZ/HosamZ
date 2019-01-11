package evaluation.week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {

    @Test
    void testSkiing() {
        Thermostat thermostat = new Thermostat(s -> s < 0, t -> t + "degrees celsius");

        Double temperatur = 2.0;
        String actual = thermostat.sense(temperatur);
        String expected = temperatur + "degrees celsius";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testWarningSkiing() {
        Thermostat thermostat = new Thermostat(s -> s < 0, t -> t + "degrees celsius");

        Double temperatur = -1.0;
        String actual = thermostat.sense(temperatur);
        String expected = temperatur + "Warning!";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSauna() {
        Thermostat thermostat = new Thermostat(s -> s >= 80, t -> t+273.15+ "degrees Kelvin");
        Thermostat thermostat2 = new Thermostat(s -> s >= 80, t -> t+273.15+ "degrees Kelvin");

        Double temperatur = 79.0;
        Double temperatur2 = 80.0;
        String actual = thermostat.sense(temperatur);
        String actual2 = thermostat.sense(temperatur2);
        String expected = temperatur+273.15+"degrees Kelvin";
        String expected2 = "Warning!";

        Assertions.assertEquals(expected,actual);
        Assertions.assertEquals(expected2,actual2);

    }
}