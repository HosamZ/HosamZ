package week4Java.ex2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println("empty set : "+backpack);
        String winterShoes = "winter shoes";
        String jacket = "jacket";
        String money = "money";
        backpack.add(winterShoes);
        backpack.add(jacket);
        backpack.add(money);
        System.out.println("backpack contains : "+backpack);
        boolean containsJacket = backpack.contains("jacket");
        System.out.println("is Jacket contained in backpack ? "+containsJacket);
        backpack.remove("money");
        System.out.println(backpack);
        boolean isMoneyContained = backpack.contains("money");
        System.out.println("is Money contained in backpack ?" +isMoneyContained);
        backpack.add("jacket");
        System.out.println("your backpack contains : "+backpack);
        System.out.println(backpack.size());
    }
}
