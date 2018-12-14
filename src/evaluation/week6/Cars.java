package evaluation.week6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {
    private Random random = new Random();
    static List<Car> carsKind = Arrays.asList(new AutomaticCar("Automatic"),new ManualCar("Manual"));


    public Car getNextCarBrand(){
        int position = random.nextInt(carsKind.size());
        Car car = carsKind.get(position);
        return car;
    }
}
