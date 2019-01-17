package week7Java.ex8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VehicleType1Test {
    private VehicleType1 vehicleType1 = new VehicleType1();

    @Test
    void getVehicleType() {
        Integer expected = 3;
        Integer actual = vehicleType1.getVehicleType(6, 3);

        Assertions.assertEquals(expected, actual);
    }
}