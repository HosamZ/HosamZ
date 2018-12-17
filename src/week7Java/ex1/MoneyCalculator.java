package week7Java.ex1;

import java.util.List;

public class MoneyCalculator {

    public Integer getMoney(List<Integer> money) {
        Integer sum = 0;

        for (Integer payment : money) {
//            System.out.println("amount :" +amount);
            sum += payment;
//            System.out.println("sum :" +sum);
        }
        return sum;
    }
}
