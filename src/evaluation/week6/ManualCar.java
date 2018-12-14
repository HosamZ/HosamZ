package evaluation.week6;

public class ManualCar extends Car {

    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "Manual "+getBrand();
    }
}
