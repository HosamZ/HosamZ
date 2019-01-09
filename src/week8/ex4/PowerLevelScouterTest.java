package week8.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {
    private PowerLevelScouter scouter = new PowerLevelScouter();

    @Test
    void scout() {
        String name = "Susana";

        Integer actual = scouter.scout(name);
        Integer expected = 619;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void scoutEnhanced() {
        String name = "Susana";

        Integer actual = scouter.scoutEnhanced(name);
        Integer expected = 651;

        Assertions.assertEquals(expected, actual);
    }
}