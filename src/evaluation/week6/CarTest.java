package evaluation.week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testDriveManual() {
        Cars cars = new Cars();
        cars.getNextCarBrand().drive();
        Assertions.assertEquals("Manual",cars.getNextCarBrand().getBrand());


    }

    @Test
    void testDriveAuto() {



    }
}