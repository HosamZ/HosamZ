package week7Java.ex8;

public class Calculator {
    private Vehicle vehicleType1 = new VehicleType1();
    private Vehicle vehicleType5 = new VehicleType5();

    public String calculate(Integer celebrities, Integer type1, Integer type5) {
        Integer TypeFiveVehlice = vehicleType5.getVehicleType(celebrities, type5);
        Integer TypeOneVehlice = vehicleType1.getVehicleType(celebrities, TypeFiveVehlice * 5);
        if (vehicleType1.IsRight(type1, TypeOneVehlice) && vehicleType5.IsRight(type5, TypeFiveVehlice)) {
            return "You can transport the celebrities";
        }
        return "You can't transport the celebrities,you need " + TypeFiveVehlice +
                " vehlice type(2) and " + TypeOneVehlice + " vehlice type(1)";
    }
}