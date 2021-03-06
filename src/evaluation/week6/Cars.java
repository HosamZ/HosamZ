package evaluation.week6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {
    private Random random = new Random();
    public Car getNextCarBrand(String brand){
        List<Car> carsKind = Arrays.asList(new AutomaticCar(brand),new ManualCar(brand));
        int position = random.nextInt(carsKind.size());
        Car car = carsKind.get(position);
        return car;
    }
}
