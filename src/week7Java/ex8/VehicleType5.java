package week7Java.ex8;

public class VehicleType5 implements Vehicle {
    @Override
    public Integer getVehicleType(Integer celebrities, Integer vehicle) {
        Integer celebritiesTyp5 = celebrities - (vehicle * 5);
        return (celebrities - celebritiesTyp5) / 5;
    }

    @Override
    public Boolean IsRight(Integer vehicletype5, Integer vehicle) {
        return vehicletype5 == vehicle;
    }

}

