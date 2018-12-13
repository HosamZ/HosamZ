package week6JAVA.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {
    private List<Money> monies = new ArrayList<>();

    public List<Money> change(Integer amount) {
        List<Money> changes = amountOfMoney.getMoneyList();
        for (Money change : changes) {
            if (change.isApplicable(amount)) {
                Integer times = amount / change.getAmount();
                addMoney(times, change);
            }
            amount = amount % change.getAmount();
        }
        return monies;
    }

    public void addMoney(Integer times, Money money) {
        for (int time = 0; time < times; time++) {
            monies.add(money);
        }
    }

    public static class amountOfMoney {
        private static List<Money> moneyList = Arrays.asList(new Cent50(50), new Cent20(20),
                new Cent10(10), new Cent5(5), new Cent2(2), new Cent1(1));

        public static List<Money> getMoneyList() {
            return moneyList;
        }
    }
}