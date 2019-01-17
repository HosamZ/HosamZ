package week7Java.ex8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VehicleType5Test {
    private VehicleType5 vehicleType5 = new VehicleType5();

    @Test
    void getVehicleType() {
        Integer expected = 1;
        Integer actual = vehicleType5.getVehicleType(13, 1);

        Assertions.assertEquals(expected, actual);
    }
}