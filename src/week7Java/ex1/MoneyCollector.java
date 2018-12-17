package week7Java.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    private Random random = new Random();

    public List<Integer> getPayments() {
        List<Integer> payments = new ArrayList<>();
        for (int friends = 0; friends < 10; friends++) {
            Integer payment = random.nextInt(5) + 1;
            payments.add(payment);
        }
        return payments;
    }

}