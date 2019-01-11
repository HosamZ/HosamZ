package evaluation.week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {

    @Test
    void testSkiing() {
        Thermostat thermostat = new Thermostat(s->s<0,t->t+"degrees celsius");

        Double temperatur = 2.0;
        String actual = thermostat.sense(temperatur);
        String expected = temperatur+"degrees celsius";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testWarningSkiing() {
        Thermostat thermostat = new Thermostat(s->s<0,t->t+"degrees celsius");

        Double temperatur = -1.0;
        String actual = thermostat.sense(temperatur);
        String expected = temperatur+"Warning!";

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSauna() {
        Thermostat thermostat = new Thermostat(s->s>=80,t->t+"degrees Kelvin");

        Double temperatur = 80.0;


    }
}