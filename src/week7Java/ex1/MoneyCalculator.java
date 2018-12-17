package week7Java.ex1;

import java.util.List;

public class MoneyCalculator {

    public Integer getMoney(List<Integer> money) {
        Integer sum = 0;
        for (Integer payment : money) {
            sum += payment;
        }
        return sum;
    }
}
