package evaluation.week6;

import java.util.Arrays;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        Cars cars= new Cars();
        getCars(hansel, cars);
    }

    public static void getCars(Hansel hansel, Cars cars) {
        List<String> carsLists = Arrays.asList("Audi","Seat","Skoda","Bmw","Tesla","Peugeot","Citroen","Jeep","Ferrari",
                "Mercedes");
        for (String car : carsLists) {
            Car nextCar = cars.getNextCarBrand(car);
            hansel.haveATry(nextCar);
        }
    }
}
