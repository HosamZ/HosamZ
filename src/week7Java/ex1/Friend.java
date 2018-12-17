package week7Java.ex1;

import java.util.Arrays;
import java.util.List;

public class Friend {
    MoneyCollector moneyCollector = new MoneyCollector();

    public List<String> getFriendsNames() {
        List<String> friends = Arrays.asList("friend1", "friend2", "friend3", "friend4", "friend5", "friend6", "friend7",
                "friend8", "friend9", "friend10");
        for (String friend : friends) {
            System.out.println(friend + moneyCollector.getPayments());
        }
        return friends;
    }
}
