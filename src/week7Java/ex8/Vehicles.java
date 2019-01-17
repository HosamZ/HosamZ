package week7Java.ex8;

import java.util.Arrays;
import java.util.List;

public class Vehicles {
    private static List<Vehicle> vehicles = Arrays.asList(new VehicleType1(),new VehicleType5());


    public static List<Vehicle> getVehicles() {
        return vehicles;
    }
}

