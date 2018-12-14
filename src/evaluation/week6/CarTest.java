package evaluation.week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testDriveManual() {
        ManualCar manualCar = new ManualCar("Audi");
        Assertions.assertEquals("Manual Audi",manualCar.drive());


    }

    @Test
    void testDriveAuto() {
        AutomaticCar automaticCar = new AutomaticCar("Seat");
        Assertions.assertEquals("Automatic Seat",automaticCar.drive());



    }
}