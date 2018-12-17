package week7Java.ex1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        MoneyCollector moneyCollector = new MoneyCollector();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        List<Integer> payments = moneyCollector.getPayments();
        Integer total = moneyCalculator.getMoney(payments);
        System.out.println("Money Collected from Friends : " + payments);
        System.out.println("Total sum of the money: " + total);
    }
}